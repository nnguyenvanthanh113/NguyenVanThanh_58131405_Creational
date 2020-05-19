/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author ThanhMickey
 */
public class HoaDon {
    ArrayList<CTHD> cthd = new ArrayList();
    HoaDonHeader hoaDonHeader;

    public HoaDon(Builder builder) {
        this.hoaDonHeader = builder.hoaDonHeader;
        this.cthd = builder.cthd;
    }

    @Override
    public String toString() {
        String InHD = hoaDonHeader.toString();
        for(int i=0;i<cthd.size();i++)
        {
            InHD += "\n chi tiết hóa đơn " + (i+1) + ":" + cthd.get(i).toString();
        }
        return InHD;
        //return "HoaDon{" + "cthd=" + cthd + ", hoaDonHeader=" + hoaDonHeader + '}';
    }
    
    
    
    public static class Builder
    {
        ArrayList<CTHD> cthd = new ArrayList();
        HoaDonHeader hoaDonHeader;
        public Builder addCTHD(CTHD cthd)
            {
                this.cthd.add(cthd);
                return this;
            }
            public Builder addHoaDonHeader(HoaDonHeader hoaDonHeader)
            {
                this.hoaDonHeader = hoaDonHeader;
                return this;
            }

            public HoaDon build()
            {
                return new HoaDon(this);
            }
    }
}
