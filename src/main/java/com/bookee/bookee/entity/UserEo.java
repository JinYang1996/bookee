package com.bookee.bookee.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableName;

import lombok.Data;

@Data
@TableName("caf_user")
public class UserEo implements Serializable{
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
