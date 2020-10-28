package com.boway.platemes.repository;

import com.boway.platemes.entity.CppPrdMadeRuleRelationBas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface relationRepository  extends JpaRepository<CppPrdMadeRuleRelationBas, String> {

    public CppPrdMadeRuleRelationBas getByDeleteFlagAndPrdGuidAndFinalUserGuidAndFinalFunctionGuid(String deleteFlag,
      String prdGuid,String finalUserGuid,String finalFunctionGuid);


}
