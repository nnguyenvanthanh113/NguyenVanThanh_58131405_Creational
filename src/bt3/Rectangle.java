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
public class Rectangle extends Shape{

    private static Rectangle instance;
    protected Rectangle()
    {
        
    }
    public static Rectangle createInstance()
    {
        if(instance == null)
            instance = new Rectangle();
        return instance; 
    }
    @Override
    public String addDraw() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "vẽ hình chữ nhật";
    }
    
}
