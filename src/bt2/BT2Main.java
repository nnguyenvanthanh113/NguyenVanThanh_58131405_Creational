/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author ThanhMickey
 */
public class BT2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //addString
        MyStringBuilder myStringBuilder1 = new MyStringBuilder.Builder()
                .addString("addString")
                .addFloat(22f)
                .addBool(true)
                .build();
        
        System.out.println(myStringBuilder1.toString());
        
    }
    
}
