package com.boway.platemes.service;

import com.boway.platemes.entity.BaseEntity;
import com.boway.platemes.entity.UserBas;
import com.boway.platemes.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.UUID;

@Service
@Slf4j
public class userAuthService {

    @Autowired
    private userBasRepository userBasRepository;

    @Autowired
    private pageBasRepository pageBasRepository;


//    ----------------人员表
//    select * from USER_BAS where USER_NO like 'test%';
//    SELECT * FROM SSD_USER_GROUP; --3316d71b-be1c-48d3-b80e-293d27194a0c
//    SELECT * FROM SSD_USER_GROUP_USER;
//    SELECT *FROM SSD_USER_GROUP_ROLE;
//    SELECT * FROM SSD_ROLE;
//    SELECT *FROM SSD_ROLE_PERMISSION;
//
//-----------------资源表
//    select * from PAGE_BAS where guid='38a35291-a76e-4144-a74e-7db5b1438367';
//    select  *from SSD_PERMISSION where ;
// ---menu_guid 就是page_bas的guid --权限与页面的关系
//    select *from  SSD_PERMISSION_MENU where PERMISSION_GUID='49428065-6ef6-4f85-b088-7a0e9e73f0eb' ;
//--权限与按钮给的关系
//    select * from SSD_PERMISSION_OPERATION;

    @Transactional
    public void test()  {

//        1.新建一个群组SSD_USER_GROUP
//        2.新建一个角色SSD_ROLE
//        3.新建一些权限SSD_PERMISSION，新增角色与权限的关联SSD_ROLE_PERMISSION
//        4.群组与角色关联表SSD_USER_GROUP_ROLE
//        5.查询人员USER_BAS，新增人员与群组的关系SSD_USER_GROUP_USER
//        6.新增权限与页面的关联SSD_PERMISSION_MENU，新增权限与页面与按钮的关系SSD_PERMISSION_OPERATION



        UserBas userBas=new UserBas();
        userBas.setGuid(UUID.randomUUID().toString());
        userBas.setUserName("testName");
        userBas.setUserNo("test3");
        userBas.setPassword("e10adc3949ba59abbe56e057f20f883e");
        userBas.setStatus("1");
        BeanUtils.copyProperties(BaseEntity.Build(), userBas);

        userBasRepository.save(userBas);

        if("test3".equals(userBas.getUserNo()) || userBas!=null){
            throw new  RuntimeException("666");
        }


        userBas.setGuid(UUID.randomUUID().toString());
        userBas.setUserNo("test2");

        userBasRepository.save(userBas);
    }


}
