package com.boway.platemes.service;

import com.boway.platemes.pojo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;


    /*
    * 从数据库获取用户信息的操作
    * */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userEntity = userService.getUserByUsername("smith");

        if(userEntity==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return new User(userEntity.getUsername(),userEntity.getPassword(),userEntity.getRole());
    }
}
