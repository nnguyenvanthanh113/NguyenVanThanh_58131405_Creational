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
public class BT3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ve hinh chu nhat
        Shape shapeHCNhat = ShapeFactory.createInstance().CreateShape(ShapeType.retangle);
        System.out.println(shapeHCNhat.toString());
        
        //ve hình tròn
        Shape shapeHTron = ShapeFactory.createInstance().CreateShape(ShapeType.circle);
        System.out.println(shapeHTron.toString());
        
        //ve hinh tam giac
        Shape shapeTamGiac = ShapeFactory.createInstance().CreateShape(ShapeType.traingle);
        System.out.println(shapeTamGiac.toString());
        
        
    }
    
}
