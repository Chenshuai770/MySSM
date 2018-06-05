package com.springmvc.controller;

import com.springmvc.pojo.Admin;
import com.springmvc.service.AdminService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class main {
    @Autowired
    AdminService adminService;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "hello SSM";
    }

    @RequestMapping(value = "/admin/{id}")
    @ResponseBody
    public Admin getUser(@PathVariable Integer id){
        return adminService.getIdFromAdmin(id);
    }

    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public String deleteUser(@PathVariable Integer id){
        return adminService.deleteFromID(id);
    }

  /*  @RequestMapping(value = "/insert" )
    @ResponseBody
    public String insert(@Param("name") String name,@Param("password") String password){
        return adminService.inserFromId(name,password);
    }*/

    @RequestMapping(value = "/insert" )
    @ResponseBody
    public String insert(){
        return adminService.insert();
    }

    @RequestMapping(value = "/insertEntity" )
    @ResponseBody
    public String insertEntity(@Param("name")String name,@Param("password")String password){
        return adminService.insertEntity(name,password);
    }

    @RequestMapping(value = "/obj" )
    @ResponseBody
    public String insertObj(@Param("admin")Admin admin ){
        return adminService.insertObj(admin);
    }

    @RequestMapping(value = "/update/name" )
    @ResponseBody
    public String updateName(@Param("name") String name){
        return adminService.updateName(name);
    }

    @RequestMapping(value = "/update/password" )
    @ResponseBody
    public String updatePassword(@Param("password") String password){
        return adminService.updatePassword(password);
    }

}
