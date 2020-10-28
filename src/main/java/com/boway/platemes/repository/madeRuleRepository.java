package com.boway.platemes.repository;

import com.boway.platemes.entity.CppMadeRule;
import com.boway.platemes.entity.WipOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface madeRuleRepository  extends JpaRepository<CppMadeRule, String> {
}
