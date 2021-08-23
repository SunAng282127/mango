package com.louis.mango.admin.service.impl;

import com.louis.mango.admin.mapper.SysUserMapper;
import com.louis.mango.admin.model.SysUserRole;
import com.louis.mango.admin.service.SysUserService;
import com.louis.mango.admin.model.SysUser;
import com.louis.mango.core.page.MybatisPageHelper;
import com.louis.mango.core.page.PageRequest;
import com.louis.mango.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;
import java.util.Set;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByName(String name) {
        return null;
    }

    /**
     * 查找用户的菜单权限标识集合
     *
     * @param userName
     * @return
     */
    @Override
    public Set<String> findPermission(String userName) {
        return null;
    }

    /**
     * 查找用户的角色集合
     *
     * @param userId
     * @return
     */
    @Override
    public List<SysUserRole> findUserRoles(Long userId) {
        return null;
    }

    /**
     * 生成用户信息Excel文件
     *
     * @param pageRequest 要导出的分页查询参数
     * @return
     */
    @Override
    public File createUserExcelFile(PageRequest pageRequest) {
        return null;
    }

    /**
     * 查找所有用户
     *
     * @return
     */
    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }

    /**
     * 分页查询
     *
     * @return
     */
    @Override
    public List<SysUser> findPage() {
        return sysUserMapper.findPage();
    }

    /**
     * 保存操作
     *
     * @param record
     * @return
     */
    @Override
    public int save(SysUser record) {
        return 0;
    }

    /**
     * 删除操作
     *
     * @param record
     * @return
     */
    @Override
    public int delete(SysUser record) {
        return 0;
    }

    /**
     * 批量删除操作
     *
     * @param records
     * @return
     */
    @Override
    public int delete(List<SysUser> records) {
        return 0;
    }

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public SysUser findById(Long id) {
        return null;
    }

    /**
     * 分页查询
     * 这里统一封装了分页请求和结果，避免直接引入具体框架的分页对象, 如MyBatis或JPA的分页对象
     * 从而避免因为替换ORM框架而导致服务层、控制层的分页接口也需要变动的情况，替换ORM框架也不会
     * 影响服务层以上的分页接口，起到了解耦的作用
     *
     * @param pageRequest 自定义，统一分页查询请求
     * @return PageResult 自定义，统一分页查询结果
     */
    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest,sysUserMapper);
    }
}
