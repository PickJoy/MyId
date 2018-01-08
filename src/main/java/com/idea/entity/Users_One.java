package com.idea.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Users_One")
public class Users_One implements Serializable{
    private int uid;//编号
    private String uname;//账号
    private String upwd;//密码

    public Users_One() {
    }

    public Users_One(int uid, String uname, String upwd) {
        this.uid = uid;
        this.uname = uname;
        this.upwd = upwd;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
}
