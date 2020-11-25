package com.boway.platemes.service;

import com.boway.platemes.entity.*;
import com.boway.platemes.repository.*;
import com.boway.platemes.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Slf4j
public class userAuthService {

    @Autowired
    private userBasRepository userBasRepository;
    @Autowired
    private pageBasRepository pageBasRepository;
    @Autowired
    private ssdUserGroupRepository ssdUserGroupRepository;
    @Autowired
    private ssdRoleRepository ssdRoleRepository;
    @Autowired
    private ssdPermissionRepository ssdPermissionRepository;
    @Autowired
    private ssdRolePermissionRepository ssdRolePermissionRepository;
    @Autowired
    private ssdUserGroupRoleRepository ssdUserGroupRoleRepository;
    @Autowired
    private ssdUserGroupUserRepository ssdUserGroupUserRepository;
    @Autowired
    private ssdPermissionMenuRepository ssdPermissionMenuRepository;
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


    @Transactional(rollbackFor = Exception.class)
    public String authorizeFunc(String groupCode,String roleCode,String permissionCode,
                                List<String> userNos,List<String> pageId){

//1.新建一个群组SSD_USER_GROUP
//2.新建一个角色SSD_ROLE 新增群组与角色关联表SSD_USER_GROUP_ROLE
//3.新建一些权限SSD_PERMISSION，新增角色与权限的关联SSD_ROLE_PERMISSION
//5.查询人员USER_BAS，新增人员与群组的关系SSD_USER_GROUP_USER
//6.新增权限与页面的关联SSD_PERMISSION_MENU，新增权限与页面与按钮的关系SSD_PERMISSION_OPERATION

        if(StringUtils.isEmpty(groupCode) || StringUtils.isEmpty(roleCode) || StringUtils.isEmpty(permissionCode)){
            return "0";
        }
        SsdUserGroup ssdUserGroup=new SsdUserGroup();
        ssdUserGroup.setUserGroupCode(groupCode);
        ssdUserGroup.setUserGroupName(groupCode);
        BeanUtils.copyProperties(BaseEntity.Build(), ssdUserGroup);
        ssdUserGroupRepository.save(ssdUserGroup);

        SsdRole ssdRole=new SsdRole();
        BeanUtils.copyProperties(BaseEntity.Build(), ssdRole);
        ssdRole.setRoleCode(roleCode);
        ssdRole.setRoleName(roleCode);
        ssdRoleRepository.save(ssdRole);

        SsdPermission ssdPermission=new SsdPermission();
        BeanUtils.copyProperties(BaseEntity.Build(), ssdPermission);
        ssdPermission.setPermissionCode(permissionCode);
        ssdPermission.setPermissionName(permissionCode);
        ssdPermissionRepository.save(ssdPermission);

        //新增角色与权限的关联
        SsdRolePermission ssdRolePermission=new SsdRolePermission();
        BeanUtils.copyProperties(BaseEntity.Build(), ssdRolePermission);
        ssdRolePermission.setRoleGuid(ssdRole.getGuid());
        ssdRolePermission.setPermissionGuid(ssdPermission.getGuid());
        ssdRolePermissionRepository.save(ssdRolePermission);

        //群组与角色关联表SSD_USER_GROUP_ROLE
        SsdUserGroupRole ssdUserGroupRole=new SsdUserGroupRole();
        BeanUtils.copyProperties(BaseEntity.Build(), ssdUserGroupRole);
        ssdUserGroupRole.setUserGroupGuid(ssdUserGroup.getGuid());
        ssdUserGroupRole.setRoleGuid(ssdRole.getGuid());
        ssdUserGroupRoleRepository.save(ssdUserGroupRole);

        //根据用户code 查询用户id
        List<UserBas> userBasList = userBasRepository.findByUserNoIn(userNos);
        List<String> userIds = userBasList.stream().map(UserBas :: getGuid).collect(Collectors.toList());

        //新增人员与群组的关系SSD_USER_GROUP_USER
        List<SsdUserGroupUser> ssdUserGroupUserList=new ArrayList<>();
        for (String userId:userIds) {
            SsdUserGroupUser ssdUserGroupUser=new SsdUserGroupUser();
            BeanUtils.copyProperties(BaseEntity.Build(), ssdUserGroupUser);
            ssdUserGroupUser.setUserGuid(userId);
            ssdUserGroupUser.setUserGroupGuid(ssdUserGroup.getGuid());
            ssdUserGroupUserList.add(ssdUserGroupUser);
        }
        ssdUserGroupUserRepository.saveAll(ssdUserGroupUserList);

        //假设这是页面guid 98f32e98-272d-464a-b3f2-e200795a6178
        //新增权限与页面的关联SSD_PERMISSION_MENU
        SsdPermissionMenu ssdPermissionMenu=new SsdPermissionMenu();
        BeanUtils.copyProperties(BaseEntity.Build(), ssdPermissionMenu);
        ssdPermissionMenu.setPermissionGuid(ssdPermission.getGuid());
        ssdPermissionMenu.setMenuGuid("98f32e98-272d-464a-b3f2-e200795a6178");
        ssdPermissionMenuRepository.save(ssdPermissionMenu);

        //新增权限与页面与按钮的关系SSD_PERMISSION_OPERATION
        //todo



        return "1";

    }

    @Transactional
    public void test()  {



        UserBas userBas=new UserBas();
        userBas.setGuid(UUID.randomUUID().toString());
        userBas.setUserName("testName");
        userBas.setUserNo("test3");
        userBas.setPassword("e10adc3949ba59abbe56e057f20f883e");
        userBas.setStatus("1");
        BeanUtils.copyProperties(BaseEntity.Build(), userBas);

        userBasRepository.save(userBas);

        if ("test3".equals(userBas.getUserNo()) || userBas != null) {
            throw new RuntimeException("666");
        }


        userBas.setGuid(UUID.randomUUID().toString());
        userBas.setUserNo("test2");

        userBasRepository.save(userBas);
    }


}
