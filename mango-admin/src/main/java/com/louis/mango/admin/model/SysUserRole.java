package com.louis.mango.admin.model;

import lombok.Data;

@Data
public class SysUserRole extends BaseModel{

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 角色
     */
    private Long roleId;
}
