package com.boway.platemes.repository;

import com.boway.platemes.entity.CppMadeRule;
import com.boway.platemes.entity.CppMadeRuleItemDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.print.DocFlavor;
import java.util.List;

public interface madeRuleDetailRepository  extends JpaRepository<CppMadeRuleItemDetail, String> {


    public CppMadeRuleItemDetail getByDeleteFlagAndCategoryGuidAndCategoryNoAndItemCategoryGuid(
            String deleteFlag,
            String categoryGuid,
            String categoryNo,
            String itemCategoryGuid
    );
}
