package com.tailwolf.entity;


import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.tailwolf.mybatis.core.annotation.Table;
import java.io.Serializable;

@Data
@EqualsAndHashCode()
@Table(tableName = "sys_user")
public class SysUser implements Serializable{
    //主键id
    private Integer id;

    //用户名
    private String userName;

    //密码
    private String userPwd;

    //账号
    private String account;

    //创建日期
    private LocalDateTime createOn;

    //创建人
    private String createBy;

    //更新日期
    private LocalDateTime updateOn;

    //更新人
    private String updateBy;

    //是否删除，0否，1是
    private Integer deleted;

    //版本
    private Integer version;


}