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
public class Circle extends Shape{

    private static Circle  instance;
    protected Circle()
    {
        
    }
    public static Circle createInstance()
    {
        if(instance == null)
            instance = new Circle();
        return instance; 
    }
    @Override
    public String addDraw() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "vẽ hình tròn";
    }
    
}