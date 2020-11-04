package com.boway.platemes.util;

import com.boway.platemes.pojo.ResultCode;
import com.boway.platemes.pojo.ResultVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
*登录过滤
*
* */
public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    //过滤器一定要设置AuthenticationManager，所以此处我们这么编写，
    // 这里的AuthenticationManager我会从Security配置的时候传入

    public JwtAuthenticationFilter(AuthenticationManager authenticationManager){
        super();
        setAuthenticationManager(authenticationManager);
    }

    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        //从post中获取username和pwd 参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);

        // 设置一些客户 IP 啥信息，后面想用的话可以用，虽然没啥用
        setDetails(request, token);

        // 交给 AuthenticationManager 进行鉴权
        return getAuthenticationManager().authenticate(token);
    }



    /*
    *  鉴权成功进行的操作，我们这里设置返回加密后的token
    * */
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        handleResponse(request, response, authResult, null);
    }

    /*
    * 鉴权失败进行的操作，我们这里就返回用户名或密码错误的信息
    * */
    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {
        handleResponse(request, response, null, failed);
    }

    private void handleResponse(HttpServletRequest request, HttpServletResponse response, Authentication authResult, AuthenticationException failed) throws IOException, ServletException {

        ObjectMapper mapper =new ObjectMapper();
        //ResultVO responseEntity=new ResultVO();
        response.setHeader("Content-Type","application/json;charset=UTF-8");
        if(authResult!=null){
            //处理登入成功请求
            User user= (User) authResult.getPrincipal();
            String token = JwtUtil.sign(user.getUsername(), user.getPassword());

            ResultVO responseEntity=new ResultVO<>(ResultCode.SUCCESS,"Bearer "+token);
            response.setStatus(HttpStatus.OK.value());
            response.getWriter().write(mapper.writeValueAsString(responseEntity));

        }else {
            //处理登入失败
            ResultVO responseEntity=new ResultVO<>(ResultCode.VALIDATE_FAILED,"用户名或密码错误");
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            response.getWriter().write(mapper.writeValueAsString(responseEntity));
        }


    }
}
