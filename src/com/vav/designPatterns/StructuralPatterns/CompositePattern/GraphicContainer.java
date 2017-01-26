package com.vav.designPatterns.StructuralPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vaibhav on 1/26/17.
 */
public class GraphicContainer extends Graphic {
    public List<Graphic> graphicList;
    public GraphicContainer(){
        graphicList = new ArrayList<>();
    }
    public void addChildGraphic(Graphic graphic){
        graphicList.add(graphic);
    }

    @Override
    public void draw() {
        for(int i=0;i<graphicList.size();i++){
            graphicList.get(i).draw();
        }
    }
}
