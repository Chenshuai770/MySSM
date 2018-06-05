package com.springmvc.service;

import com.springmvc.dao.AdminDao;
import com.springmvc.pojo.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService {

    @Resource
    private AdminDao adminDao;

    public Admin getIdFromAdmin(int id){
        Admin admin = adminDao.selectFromId(id);
        return admin;
    }

    public Admin selectFromId(int id) {
        Admin admin = adminDao.selectFromId(id);
        return admin;
    }

    public String deleteFromID(int id) {
        adminDao.deleteFromID(id);
        if (adminDao.selectFromId(id)==null){
            return "id="+id+" 的数据已经删除";
        }else {
            return "数据删除失败";
        }
    }
/*
     public String inserFromId(String name,String password){
         Admin admin = new Admin();
         admin.setName(name);
         admin.setPassword(password);
         int i =adminDao.insert(admin);
         if (i>0){
             return "插入数据success";
         }else {
             return "插入数据失败";
         }

    }*/


    public String insert(){
        int i =adminDao.insert();
        if (i>0){
            return "插入数据success";
        }else {
            return "插入数据失败";
        }
    }


    public String insertEntity(String name,String password){
        int i =adminDao.insertAdmin(name,password);
        if (i>0){
            return "插入数据success";
        }else {
            return "插入数据失败";
        }

    }

    public String insertObj(Admin admin){
        int i =adminDao.inserObj(admin);
        if (i>0){
            return "插入数据success";
        }else {
            return "插入数据失败";
        }

    }

    public String updateName(String name){
        int i =adminDao.updateName(name);
        System.out.println(">>>>>>>>"+i+"");
        if (i>0){
            return "更新数据success";
        }else {
            return "更新数据失败";
        }
    }

    public String updatePassword(String password){
        int i =adminDao.updatePassword(password);
        System.out.println(">>>>>>>>"+i+"");
        if (i>0){
            return "更新密码success";
        }else {
            return "更新密码失败";
        }
    }

}
