package com.careerguide.youtubeVideo;


public class Videos_two {

    private String title;
    private String thumbnail_url;
    private String videoID;
    private String Desc;

    public Videos_two(String title, String thumbnail_url, String videoid, String Desc) {
        this.title = title;
        this.thumbnail_url= thumbnail_url;
        this.videoID = videoid;
        this.Desc = Desc;
    }

    public String getTitle() {
        return title;
    }
    public String getThumbnailUrl() {
        return thumbnail_url;
    }
    public String getVideoID() {
        return videoID;
    }
    public String getDesc() {
        return Desc;
    }



}

