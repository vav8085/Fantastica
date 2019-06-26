package com.vav.Design.PrototypePattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public class Picture implements Graphic {
    private Picture picture=null;
    private String url;

    @Override
    public Graphic clone() {
        Graphic picture = new Picture();
        picture.setUrl(url);
        return picture;
    }
    public void setUrl(String url){
        this.url=url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
