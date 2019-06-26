package com.vav.Design.PrototypePattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public interface Graphic {
    public Graphic clone();
    public void setUrl(String url);
    public String getUrl();

}
