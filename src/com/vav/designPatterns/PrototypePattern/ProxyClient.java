package com.vav.designPatterns.PrototypePattern;

/**
 * Created by Vaibhav on 1/16/2017.
 */
public class ProxyClient {
    public static void main(String arg[]){
        Video video = new Video();
        video.setUrl("https:.//www.youtube.com");
        Proxy proxy = new Proxy(video);
        Graphic newVideo =proxy.duplicate();
        System.out.print(newVideo.getUrl());
    }
}
