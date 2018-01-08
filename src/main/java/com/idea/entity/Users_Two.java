package com.idea.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Users_Two")
public class Users_Two implements Serializable{
    private int uno;//编号
    private String uname;//姓名
    private String usex;//性别
    private int telephone;//电话
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;//出生日期
    private String address;//地址
    private String picture;//照片

    

    public Users_Two() {
    }

    public Users_Two(int uno, String uname, String usex, int telephone, Date birthday, String address, String picture) {
        this.uno = uno;
        this.uname = uname;
        this.usex = usex;
        this.telephone = telephone;
        this.birthday = birthday;
        this.address = address;
        this.picture = picture;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
