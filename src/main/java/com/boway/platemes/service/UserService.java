package com.boway.platemes.service;

import com.boway.platemes.pojo.UserEntity;
import com.boway.platemes.repository.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private Database database;

    public UserEntity getUserByUsername(String username){
        return database.getDatabase().get(username);
    }
}
