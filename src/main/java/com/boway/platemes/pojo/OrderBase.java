package com.boway.platemes.pojo;

import lombok.Data;
import org.elasticsearch.search.DocValueFormat;

import java.io.Serializable;

@Data
public class OrderBase  implements Serializable {

    private String inquiries_no;

    private String seq;

    private String prd_guid;

    private String final_user_guid;

    private String final_function_guid;

    private String brand_guid;

    private float spec1;

    private float P_SPEC1_TOL;

    private float N_SPEC1_TOL;


}
