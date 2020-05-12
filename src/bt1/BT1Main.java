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
public class BT1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //hoa don
        HoaDonHeader HoaDon = new HoaDonHeader.Builder()
                .addMaHoaDon("HD001")
                .addNgayBan("12/05/2020")
                .addTenKhachHang("Nguyen Van Thanh")
                .build();
        
        System.out.println(HoaDon.toString());
        
        
        //chi tiet hoa don
        ArrayList<CTHD> arraylist = new ArrayList();
        CTHD cthd = new CTHD.Builder()
                .addSanPham("Laptop")
                .addDonGia("1500$")
                .addSoLuong("10")
                .addChietKhau("50%")
                .build();
        
        arraylist.add(cthd);
        
        System.out.println(cthd.toString());
        
    }
    
}
