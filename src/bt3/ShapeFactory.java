/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author ThanhMickey
 */
public class ShapeFactory {
    
    private static ShapeFactory instance;

    public ShapeFactory() {
    }
    
    public static ShapeFactory createInstance()
    {
        if(instance == null)
            instance = new ShapeFactory();
        return instance; 
    }
    
    public Shape CreateShape(ShapeType shapeType)
    {
        switch(shapeType)
        {
            case retangle:
                return new Rectangle();
            case circle:
                return new Circle();
            case traingle:
                return new Traingle();
        }
        return null;
    }
}
