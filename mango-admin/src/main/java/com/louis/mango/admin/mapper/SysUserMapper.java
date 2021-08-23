package com.louis.mango.admin.mapper;

import com.louis.mango.admin.model.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysUserMapper {

    /**
     * 通过用户id删除
     * @param id 用户id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 添加用户
     * @param record 用户
     * @return
     */
    int insert(SysUser record);

    /**
     * 添加用户
     * @param record 用户
     * @return
     */
    int insertSelective(SysUser record);

    /**
     * 通过id获取用户信息
     * @param id 用户id
     * @return
     */
    SysUser selectByPrimaryKey(Long id);

    /**
     * 更新用户信息
     * @param record 用户
     * @return
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * 更新用户信息
     * @param record 用户
     * @return
     */
    int updateByPrimaryKey(SysUser record);

    /**
     * 查询全部用户信息
     * @return
     */
    List<SysUser> findAll();

    /**
     * 分页查询
     * @return
     */
    List<SysUser> findPage();

    /**
     * 通过名字查询
     * @param name 名字
     * @return
     */
    SysUser findByName(@Param(value = "name") String name);

    /**
     * 通过名字查询
     * @param name
     * @return
     */
    List<SysUser> findPageByName(@Param(value = "name") String name);

    List<SysUser> findPageByNameAndEmail(@Param(value = "name") String name,@Param("email") String email);
}
