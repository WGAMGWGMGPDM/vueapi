package com.zr.vueapi.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Author: 张忍忍
 * @Date: 2021/3/21 17:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "deptinfo")
public class Deptinfo implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    @TableField(value = "deptname")
    private String deptname;

    @TableField(value = "operationtime")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date operationtime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_DEPTNAME = "deptname";

    public static final String COL_OPERATIONTIME = "operationtime";

    // 测试
}
