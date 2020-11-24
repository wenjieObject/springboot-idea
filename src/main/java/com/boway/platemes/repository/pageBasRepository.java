package com.boway.platemes.repository; 

import com.boway.platemes.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 

@Repository
public interface pageBasRepository extends JpaRepository<PageBas, String> {

    //这是注释

    //再来一个注释
}

