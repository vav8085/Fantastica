package com.vav.designPatterns.StructuralPatterns.CompositePattern;

/**
 * Created by Vaibhav on 1/26/17.
 */
public class CompositePatternClient {
    public static void main(String arg[]){
        Graphic circle = new Circle();
        Graphic image = new Image();
        GraphicContainer container1 = new GraphicContainer();
        container1.addChildGraphic(circle);
        container1.addChildGraphic(image);
        container1.draw();
    }
}
