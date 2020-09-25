package com.xtkj.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@TableName("tb_old_user")
public class OldUser implements Serializable {

    private static final long serialVersionUID = -5072081849565509746L;

    @TableId(value = "old_id",type = IdType.INPUT)
    private Integer oldId;
    @TableField("user_id")
    private Integer userId;
    @TableField("user_name")
    private String UserName;
    @TableField("login_id")
    private String loginId;
    @TableField(value = "datetime",fill = FieldFill.INSERT)
    private String dateTime;

}
