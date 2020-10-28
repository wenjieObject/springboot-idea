package com.boway.platemes.repository;

import com.boway.platemes.entity.CppItemDetail;
import com.boway.platemes.entity.FactoryBas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface itemDetailRepository  extends JpaRepository<CppItemDetail,String> {

    public List<CppItemDetail> getByDeleteFlagAndFromGuid(String deleteFlag,String fromGuid);
}
