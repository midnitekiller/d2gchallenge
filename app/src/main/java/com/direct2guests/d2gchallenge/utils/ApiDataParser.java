package com.direct2guests.d2gchallenge.utils;

import com.direct2guests.d2gchallenge.nonActivities.NetworkConnection;
import com.direct2guests.d2gchallenge.nonActivities.VolleyCallbackArray;
import com.direct2guests.d2gchallenge.R;

import java.io.Serializable;

public class ApiDataParser implements Serializable {

    private String cHotel_id;
    private String cChannel_id;
    private String cChannel_type;
    private String cChannel_name;
    private String cChannel_url;
    private String cChannel_logo;
    private String cChannel_createdAt;
    private String cChannel_updatedAt;
    private String cChannel_hotelName;
    private String cChannel_imagePath;
    private String cApiurl;
    private String cServerurl;

    //getters
    public String getcHotel_id() {return cHotel_id;}
    public String getcChannel_id() {return cChannel_id;}
    public String getcChannel_type() {return cChannel_type;}
    public String getcChannel_name() {return cChannel_name;}
    public String getcChannel_url() {return cChannel_url;}
    public String getcChannel_logo() {return cChannel_logo;}
    public String getcChannel_createdAt() {return cChannel_createdAt;}
    public String getcChannel_updatedAt() {return cChannel_updatedAt;}
    public String getcChannel_hotelName() {return cChannel_hotelName;}
    public String getcChannel_imagePath() {return cChannel_imagePath;}
    public String getcApiurl() {return cApiurl;}
    public String getcServerurl() {return cServerurl;}




    //setters


    public void setcServerurl(String cServerurl) {
        this.cServerurl = cServerurl;
    }

    public void setcApiurl(String cApiurl) {
        this.cApiurl = cApiurl;
    }

    public void setcChannel_hotelName(String cChannel_hotelName) {
        this.cChannel_hotelName = cChannel_hotelName;
    }

    public void setcChannel_createdAt(String cChannel_createdAt) {
        this.cChannel_createdAt = cChannel_createdAt;
    }

    public void setcChannel_id(String cChannel_id) {
        this.cChannel_id = cChannel_id;
    }

    public void setcChannel_imagePath(String cChannel_imagePath) {
        this.cChannel_imagePath = cChannel_imagePath;
    }

    public void setcChannel_logo(String cChannel_logo) {
        this.cChannel_logo = cChannel_logo;
    }

    public void setcChannel_name(String cChannel_name) {
        this.cChannel_name = cChannel_name;
    }

    public void setcChannel_type(String cChannel_type) {
        this.cChannel_type = cChannel_type;
    }

    public void setcChannel_updatedAt(String cChannel_updatedAt) {
        this.cChannel_updatedAt = cChannel_updatedAt;
    }

    public void setcChannel_url(String cChannel_url) {
        this.cChannel_url = cChannel_url;
    }

    public void setcHotel_id(String cHotel_id) {
        this.cHotel_id = cHotel_id;
    }

}

