
package bt3;

import bt3.Shape.Shape;
import bt3.Shape.ShapeType;
import bt3.ShapeFactory.ShapeFactory;

public class MainBT3 {

    public static void main(String[] args) {
        var SF1 = ShapeFactory.createInstance();
        var SF2 = ShapeFactory.createInstance();
        var SF3 = ShapeFactory.createInstance();
        
        SF1.setType(ShapeType.circle);
        SF2.setType(ShapeType.rectangle);
        SF3.setType(ShapeType.triangle);
        
        var Hinh1 = SF1.createShape();
        var Hinh2 = SF2.createShape();
        var Hinh3 = SF3.createShape();
        var Hinh4 = SF1.createShape();
       
        System.out.println("Hình 1: "+Hinh1.draw());
        System.out.println("Hình 2: "+Hinh2.draw());
        System.out.println("Hình 3: "+Hinh3.draw());
    }
    
}
