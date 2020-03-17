package com.bookee.bookee.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("caf_user")
public class UserEo {
    private String id;
    private String name;
}
