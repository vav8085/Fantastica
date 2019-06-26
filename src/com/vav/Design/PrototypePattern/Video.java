package com.vav.Design.PrototypePattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public class Video implements Graphic {
    private Video video=null;
    private String url;

    @Override
    public Graphic clone() {
        Graphic video = new Video();
        video.setUrl(url);
        return video;
    }
    public void setUrl(String url){
        this.url=url;
    }
    public String getUrl(){
        return url;
    }

}
