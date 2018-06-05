package com.springmvc.dao;

import org.apache.ibatis.annotations.Mapper;
import com.springmvc.pojo.Admin;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminDao {
    Admin selectFromId(@Param("id") int id);

    void deleteFromID(@Param("id") int id);

    int insert();

    int insertAdmin(@Param("name") String  name,@Param("password") String  password);

    int inserObj(Admin admin);

    int updateName(@Param("name") String name);


    int updatePassword(@Param("password") String password);


}
