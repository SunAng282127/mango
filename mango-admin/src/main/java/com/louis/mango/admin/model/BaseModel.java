package com.louis.mango.admin.model;

import lombok.Data;

import java.util.Date;

/**
 * 基础模型
 */
@Data
public class BaseModel {

    /**
     * id
     */
    private Long id;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String lastUpdateBy;

    /**
     * 更新时间
     */
    private Date lastUpdateTime;
}
