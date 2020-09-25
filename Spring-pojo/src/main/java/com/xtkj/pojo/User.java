package com.xtkj.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("tb_user")
public class User implements Serializable{
    private static final long serialVersionUID = 3359817797050835619L;
    @TableId(value = "user_id",type = IdType.INPUT)
    private Integer userId;
    @TableField("user_name")
    private String UserName;
    @TableField("login_id")
    private String loginId;
    @TableField("login_pwd")
    private String loginPwd;
//    @Version
//    private Integer version;
}
