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
public class MyStringBuilder {
    String str = "MyStringBuilder-";
    
     public MyStringBuilder(Builder builder) {
        this.str = builder.str;
    }
     
    @Override
    public String toString() {
        return str;
    }
    
    public static class Builder
    {
        String str = "BT2 : ";
        public Builder()
        {
            
        }
        public Builder addString(String s)
        {
            this.str = this.str.concat(s);
            return this;
        }
        public Builder addFloat(Float f)
        {
            String converF = Float.toString(f);
            this.str = this.str.concat(converF);
            return this;
        }
        public Builder addBool(boolean b)
        {
            String converB = Boolean.toString(b);
            this.str = this.str.concat(converB);
            return this;
        }
        public MyStringBuilder build()
        {
            return new MyStringBuilder(this);
        }
        
    }
    
}
