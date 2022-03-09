package com.lege.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author lege
 * @Description
 * @create 2022-03-09 15:50
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user_info")
public class UserInfo extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @TableField("avatar")
    private String avatar;

    @TableField("email")
    private String email;

    @TableField("password")
    private String password;

    @TableField("phone")
    private String phone;

    @TableField("salt")
    private String salt;

    @TableField("sex")
    private Integer sex;

    @TableField("user_name")
    private String userName;
}
