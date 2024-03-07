package com.example.onboarding_backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("postcodes_geo")
public class Geo {
    @TableId(value ="id", type = IdType.AUTO)
    private int id;
    private String postcode;
    private String suburb;
    private String state;
    @TableField("latitude")
    private double lat;
    @TableField("longitude")
    private double lon;

    public Geo(int id, String postcode, String suburb, String state, double lat, double lon) {
        this.id = id;
        this.postcode = postcode;
        this.suburb = suburb;
        this.state = state;
        this.lat = lat;
        this.lon = lon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "id=" + id +
                ", postcode='" + postcode + '\'' +
                ", suburb='" + suburb + '\'' +
                ", state='" + state + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }
}
