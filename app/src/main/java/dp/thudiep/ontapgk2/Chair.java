package dp.thudiep.ontapgk2;

import java.io.Serializable;

public class Chair implements Serializable {
    private int imgView, btnCong;
    private String ten;
    private int gia, soLuong;

    public Chair(int imgView, int btnCong, String ten, int gia, int soLuong) {
        this.imgView = imgView;
        this.btnCong = btnCong;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public int getImgView() {
        return imgView;
    }

    public void setImgView(int imgView) {
        this.imgView = imgView;
    }

    public int getBtnCong() {
        return btnCong;
    }

    public void setBtnCong(int btnCong) {
        this.btnCong = btnCong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}