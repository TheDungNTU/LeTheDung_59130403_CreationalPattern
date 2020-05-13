
package bt3.ShapeFactory;


import bt3.Shape.Circle.Circle;
import bt3.Shape.Rectangle.Rectangle;
import bt3.Shape.Shape;
import bt3.Shape.ShapeType;
import bt3.Shape.Triangle.Triangle;

public class ShapeFactory {

    ShapeType type;

    public ShapeType getType() {
        return type;
    }

    public void setType(ShapeType type) {
        this.type = type;
    }
    
     private static ShapeFactory instance;
    
    public static ShapeFactory createInstance()
    {
        if(instance==null)
            instance = new ShapeFactory();
        return instance;
    }
   
    protected ShapeFactory() {
    }
    
    
    public Shape createShape()
    {
        switch(type)
        {
            case rectangle: return new Rectangle();
            case triangle: return new Triangle();
            case circle: return new Circle();
        }  
        return null;
    }
}
