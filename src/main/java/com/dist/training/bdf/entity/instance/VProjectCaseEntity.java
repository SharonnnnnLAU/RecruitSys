package com.dist.training.bdf.entity.instance;

import java.io.Serializable;
import lombok.Data;

/**
 * V_PROJECT_CASE
 * @author 
 */
@Data
public class VProjectCaseEntity implements Serializable {
    private Long pid;

    private Long cid;

    private String businessname;

    private Long businessid;

    private String processinstanceid;

    private static final long serialVersionUID = 1L;
}