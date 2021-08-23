package com.louis.mango.admin.model;



import lombok.Data;

import java.util.Date;

@Data
public class SysUser {
    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 盐加密
     */
    private String salt;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户手机号
     */
    private String mobile;

    /***
     * 用户状态
     */
    private Byte status;

    /**
     * 用户所在部门
     */
    private Long deptId;

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

    /**
     * 是否为物理删除
     */
    private Byte delFlag;
}
