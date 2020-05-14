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
public class Traingle extends Shape{
    
    private static Traingle  instance;
    protected Traingle()
    {
        
    }
    public static Traingle createInstance()
    {
        if(instance == null)
            instance = new Traingle();
        return instance; 
    }
    @Override
    public String addDraw() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "vẽ hình tam giác";
    }
    
}
