package com.boway.platemes.repository;

import com.boway.platemes.entity.CppItemDetail;
import com.boway.platemes.entity.CppItemDetailSub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface itemDetailSubRepository extends JpaRepository<CppItemDetailSub,String> {

    public CppItemDetailSub getByDeleteFlagAndFromGuidAndItemParmGuid(
            String deleteFlag,
            String fromGuid,
            String itemParmGuid);
}
