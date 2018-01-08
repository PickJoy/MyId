package com.idea.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Commodity")
public class Commodity implements Serializable{

    private int sno;//商品编号
    private String sname;//商品名称
    private double price;//价格
    private String ufile;//图片
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sintime;//生产日期
    private String producer;//生产厂家
    private int state=0;//1:上架  0:下架

    public Commodity() {
    }

    public Commodity(int sno, String sname, double price, String ufile, Date sintime, String producer, int state) {
        this.sno = sno;
        this.sname = sname;
        this.price = price;
        this.ufile = ufile;
        this.sintime = sintime;
        this.producer = producer;
        this.state = state;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUfile() {
        return ufile;
    }

    public void setUfile(String ufile) {
        this.ufile = ufile;
    }

    public Date getSintime() {
        return sintime;
    }

    public void setSintime(Date sintime) {
        this.sintime = sintime;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
