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
public class CTHD {
    String sanPham,soLuong,donGia,chietKhau;
    public CTHD(Builder builder) {
        this.sanPham = builder.sanPham;
        this.soLuong = builder.soLuong;
        this.donGia = builder.donGia;
        this.chietKhau = builder.chietKhau;
    }
    @Override
    public String toString() {
        return "Chi tiết hóa đơn{" + "sản phẩm :" + sanPham + ", số lượng :" + soLuong 
                + ", đơn giá :" + donGia  + ",chiết khấu :" + chietKhau + '}';
    }
    public static class Builder
    {
        String sanPham,soLuong,donGia,chietKhau;
        public Builder()
        {
            
        }
        public Builder addSanPham(String sanPham)
        {
            this.sanPham = sanPham;
            return this;
        }
        public Builder addSoLuong(String soLuong)
        {
            this.soLuong = soLuong;
            return this;
        }
        public Builder addDonGia(String donGia)
        {
            this.donGia = donGia;
            return this;
        }
        public Builder addChietKhau(String chietKhau)
        {
            this.chietKhau = chietKhau;
            return this;
        }
        
        public CTHD build()
        {
            return new CTHD(this);
        }
    }
}
