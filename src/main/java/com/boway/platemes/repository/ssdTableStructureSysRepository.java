package com.boway.platemes.repository; 

import com.boway.platemes.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 

@Repository
public interface ssdTableStructureSysRepository extends JpaRepository<SsdTableStructureSys, String> {
}
