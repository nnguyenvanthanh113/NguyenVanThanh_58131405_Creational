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
public abstract class Shape {
    private String brush = "vẽ tia sáng";
    private String paper = "vẽ giấy";
    private String frame = "vẽ khung";
         
    public abstract String addDraw();

    @Override
    public String toString() {
        return "Shape{" + addDraw() + " : " +brush + " " + paper + " " + frame + '}';
    }
    
}
