package com.louis.mango.admin.controller;

import com.louis.mango.admin.service.SysUserService;
import com.louis.mango.admin.model.SysUser;
import com.louis.mango.core.http.HttpResult;
import com.louis.mango.core.page.PageRequest;
import com.louis.mango.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/list")
    public List<SysUser> list(SysUser sysUser){
        List<SysUser> sysUserList= sysUserService.findAll();
        return sysUserList;
    }

    @PostMapping("/pageList")
    public HttpResult pageList(@RequestBody PageRequest pageRequest){
        PageResult pageResult = sysUserService.findPage(pageRequest);
        return HttpResult.ok(pageResult);
    }
}
