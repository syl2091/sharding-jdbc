package com.lege.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lege
 * @Description
 * @create 2022-03-09 15:45
 */
public abstract class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

//    @TableId(value = "id", type = IdType.AUTO)
    @TableId(value = "id")
    private Long id;

    @TableLogic
    @TableField(value = "deleted")
    private Integer deleted;

    @TableField(value = "available", fill = FieldFill.INSERT)
    private Integer available;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
