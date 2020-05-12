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
public class HoaDonHeader {
    String maHoaDon,ngayBan,tenKhachHang;

    public HoaDonHeader(Builder builder) {
        this.maHoaDon = builder.maHoaDon;
        this.ngayBan = builder.ngayBan;
        this.tenKhachHang = builder.tenKhachHang;
    }
    @Override
    public String toString() {
        return "Hóa đơn{" + "mã hóa đơn :" + maHoaDon + ", ngày bán :" + ngayBan + ", tên khách hàng :" + tenKhachHang  + '}';
    }
    public static class Builder
    {
        String maHoaDon,ngayBan,tenKhachHang;
        public Builder()
        {
            
        }
        public Builder addMaHoaDon(String maHoaDon)
        {
            this.maHoaDon = maHoaDon;
            return this;
        }
        public Builder addNgayBan(String ngayBan)
        {
            this.ngayBan = ngayBan;
            return this;
        }
        public Builder addTenKhachHang(String tenKhachHang)
        {
            this.tenKhachHang = tenKhachHang;
            return this;
        }
        
        public HoaDonHeader build()
        {
            return new HoaDonHeader(this);
        }
    }
    
}
