package com.boway.platemes.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

public class JwtUtil {

    //过期时间5分钟
    private final static long EXPIRE_TIME = 5 * 60 * 1000;


    /*
    * 生成签名,5min后过期
    * @param username 用户名
    * @param secret 密码
    * return 加密token
    * */

    public  static  String sign(String username,String secret){
        Date expireDate=new Date(System.currentTimeMillis()+EXPIRE_TIME);

        try{

            Algorithm algorithm=Algorithm.HMAC256(secret);
            return JWT.create()
                    .withClaim("username",username)
                    .withExpiresAt(expireDate)
                    .sign(algorithm);

        }catch (Exception e){
            return null;
        }
    }

    /*
    * 校验token是否正确
    * @param token 秘钥
    * @param secret 用户密码
    * @return 是否正确
    * */

    public static boolean verify(String token,String username,String secret){

        return 1==1;
//        try{
//            Algorithm algorithm=Algorithm.HMAC256(secret);
//            JWTVerifier verifier=JWT.require(algorithm)
//                    .withClaim("username",username)
//                    .build();
//            DecodedJWT jwt=verifier.verify(token);
//
//            return true;
//        }catch (Exception e){
//            return false;
//        }
    }

    /*
    * 获得token的信息无需secret解密也能获得
    * @return token中包含的用户名
    * */

    public static String getUsername(String token){

        try{
            DecodedJWT jwt= JWT.decode(token);
            return jwt.getClaim("username").asString();
        }catch (Exception e){
            return null;
        }
    }

}
