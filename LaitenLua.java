/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author Xuan Truong
 */
public class LaitenLua extends Laimaybay {

    int tocDo, nangLuong;

    public LaitenLua() {
    }

    public LaitenLua(int tocDo, int nangLuong, String hoTen, String email, String sdt, double canNang, double vong1, int tuoiTho) {
        super(hoTen, email, sdt, canNang, vong1, tuoiTho);
        this.tocDo = tocDo;
        this.nangLuong = nangLuong;
    }
    
    

    public int getTocDo() {
        return tocDo;
    }

    public void setTocDo(int tocDo) {
        this.tocDo = tocDo;
    }

    public int getNangLuong() {
        return nangLuong;
    }

    public void setNangLuong(int nangLuong) {
        this.nangLuong = nangLuong;
    }

    @Override
    public void xuatTT() {
        super.xuatTT();
        System.out.println("\tNăng lượng của tên lửa là: " + nangLuong);
        System.out.println("\tToc do cua ten lua la: " + tocDo);
    }

}
