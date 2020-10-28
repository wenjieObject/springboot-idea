package com.boway.platemes.repository;

import com.boway.platemes.entity.CppMadeRuleItemDetail;
import com.boway.platemes.entity.CppMadeRuleProcessDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface madeRuleProcessRepository extends JpaRepository<CppMadeRuleProcessDetail, String> {

    public List<CppMadeRuleProcessDetail> getByDeleteFlagAndMadeRuleGuid(String deleteFlag,String madeRuleGuid);
}
