package com.boway.platemes.repository;

import com.boway.platemes.entity.WipOrder;
import com.boway.platemes.pojo.OrderBase;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface orderBaseRepository extends  JpaRepository<WipOrder, String> {


    //关联查询    @Query可以用于自定义sql语句,如果是修改需加上@Modifying ,这是一条关联查询语句,返回的结果映射到新对象中，新对象为接口，里面含有对应参数的构造方法。
    @Query(value="select t1.inquiries_no,t.seq , t.prd_guid,t.final_user_guid,t.final_function_guid\n" +
            ",t.spec1,t.brand_guid,t.P_SPEC1_TOL,t.N_SPEC1_TOL\n" +
            "from WIP_ORDER_D t \n" +
            "left join WIP_ORDER t1 \n" +
            "on t.order_guid=t1.guid \n" +
            "where  t.delete_flag='N' and t1.delete_flag='N'   " +
            "and t.brand_guid in ('35452ef0-f610-4434-b6e5-f264f271c7b7','47ab25d0-0f7d-4564-82b7-d4270a62cf7b') ",nativeQuery = true)
    public  List<Map<String,Object>>  getOrderBase();


}
