
package week5;

public class Laimaybay {

    String hoTen, email, sdt;
    double canNang, vong1;
    int tuoiTho;

    public Laimaybay() {
    }

    public Laimaybay(String hoTen, String email, String sdt, double canNang, double vong1, int tuoiTho) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.canNang = canNang;
        this.vong1 = vong1;
        this.tuoiTho = tuoiTho;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public double getVong1() {
        return vong1;
    }

    public void setVong1(double vong1) {
        this.vong1 = vong1;
    }

    public int getTuoiTho() {
        return tuoiTho;
    }

    public void setTuoiTho(int tuoiTho) {
        this.tuoiTho = tuoiTho;
    }

    public void xuatTT() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("\tCân nặng: " + canNang);
        System.out.println("\tVòng 1: " + vong1);
        System.out.println("\tEmail: " + email);
        System.out.println("\tSố Điện Thoại: " + sdt);
        System.out.println("\tTuổi thọ: " + tuoiTho);
    }
}
