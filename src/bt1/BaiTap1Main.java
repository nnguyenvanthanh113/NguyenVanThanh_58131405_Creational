/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author ThanhMickey
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //tao 1 hoa don header
        HoaDonHeader hoaDonHeader = new HoaDonHeader("HDH001", "19/5/2020", "Nguyễn Văn Thành");
        
        // tao 1 Chi tiet hoa đon
        CTHD cthd1 = new CTHD("LapTop", "10", "10000000", "25%");
        CTHD cthd2 = new CTHD("Chuột", "20", "100000", "30%");
        
        HoaDon hoaDon = new HoaDon.Builder()
                .addHoaDonHeader(hoaDonHeader)
                .addCTHD(cthd1)
                .addCTHD(cthd2)
                .build();
        
        System.out.println(hoaDon.toString());
    }
    
}
