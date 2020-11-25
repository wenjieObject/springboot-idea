package com.boway.platemes.repository; 

import com.boway.platemes.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userBasRepository extends JpaRepository<UserBas, String> {

    public List<UserBas> findByUserNoIn (List<String> userNos);
}
