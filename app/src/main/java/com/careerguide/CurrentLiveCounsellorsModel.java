package com.careerguide;

import android.util.Log;
import android.widget.ImageView;

public class CurrentLiveCounsellorsModel {

    private String counsellorName = "";
    private String desc = "";
    private String imgSrc;
    private String channel_name;


    public CurrentLiveCounsellorsModel(String counsellorName,String desc,String imgSrc,String channel_name){
        this.counsellorName=counsellorName;
        this.desc=desc;
        this.imgSrc=imgSrc;
        this.channel_name=channel_name;
    }

    public void setRestaurantName(String CounsellorName) {
        this.counsellorName = CounsellorName;
        Log.e("#name123","===>" +CounsellorName);
    }

    public String getCounsellorName() {
        return this.counsellorName;
    }

    public void setchannelname( String channel_name) {
        this.channel_name = channel_name;
    }

    public String getchannelname() {
        return this.channel_name;
    }

    public void setImgSrc(String _imgSrc) {
        Log.e("#img","===>" +_imgSrc);
        this.imgSrc = _imgSrc;
    }

    public String getImgSrc() {
        return this.imgSrc;

    }
}