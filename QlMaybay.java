
package week5;

import java.util.ArrayList;
import java.util.Scanner;

public class QlMaybay {
    Scanner sc = new Scanner(System.in);
    ArrayList<Laimaybay> listMaybay = new ArrayList<>();
    
    public void nhapTT(){
        while (true) {
            String hoTen;
            while (true) {                
                System.out.print("Moi nhap ten may bay: ");
                hoTen=sc.nextLine();
                if(hoTen.isEmpty() || hoTen.equals("\n")|| hoTen.endsWith(" ")){
                    System.out.print("Ten khong duoc de trong");
                }else if(hoTen.length()>30){
                    System.out.print("Ten khong duoc qua 30 ky tu");
                }else{
                    break;
                }
            }
            double canNang;
            while (true) {                
                try {
                    System.out.print("Nhap can nang: ");
                    canNang = Double.parseDouble(sc.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Ky tu nhap vao khong phai la so");
                }
            }
            double vong1=0;
            while (true) {                
                try {
                    System.out.print("Nhap so do vong 1: ");
                    vong1 = Double.parseDouble(sc.nextLine());
                } catch (NumberFormatException nfe) {
                    System.out.print("Ky tu nhap vao khong phai la so");
                }
                if(vong1<50 || vong1>150){
                    System.out.println("Vong 1 phai lon hon 50 va nho hon 150");
                }else{
                    break;
                }
            }
            String email;
            while (true) {                
                System.out.print("Nhap dia chi email: ");
                email = sc.nextLine();
                String regexEmail="\\w+@\\w+(\\. \\w+){1,2}";
                if(email.matches(regexEmail)){
                    break;
                }else{
                    System.out.print("Nhap sai dinh dang email");
                }
            }
            String sdt;
            while (true) {                
                System.out.print("Nhap so dien thoai: ");
                sdt = sc.nextLine();
                String regexSDT ="0\\d{9}";
                if(sdt.matches(regexSDT)){
                    break;
                }else{
                    System.out.print("Nhap sai dinh dang sdt");
                }
            }
            int tuoiTho;
            while (true) {                
                try {
                    System.out.print("Nhap tuoi tho: ");
                    tuoiTho = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException nfe) {
                    System.out.print("Tuoi nhap khong phai la so");
                }
            }
            System.out.println("-----*-----*-----");
            System.out.println("1. May bay");
            System.out.println("2. Ten lua");
            System.out.println("3. Tau con thoi");
            System.out.print("Chon chung loai may bay: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    listMaybay.add(new Laimaybay(hoTen, email, sdt, canNang, vong1, tuoiTho));
                    break;
                case 2:
                    System.out.print("Tuoi tho cua ten lua: ");
                    int nangLuong;
                    while (true) {                        
                        try {
                            System.out.print("Nhap nang luong cua ten lua: ");
                            nangLuong = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (NumberFormatException nfe) {
                            System.out.print("Nang luong ban nhap khong phai la so");
                        }
                    }
                    int tocDo;
                    while (true) {                        
                        try {
                            System.out.print("Nhap toc do cua ten lua: ");
                            tocDo = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (NumberFormatException nfe) {
                            System.out.print("Toc do ban nhap khong phai la so");
                        }
                    }
                    tuoiTho = tocDo * nangLuong;
                    System.out.print("Tuoi tho cua ten lua la: "+tuoiTho);
                    listMaybay.add(new LaitenLua(tocDo, nangLuong, hoTen, email, sdt, canNang, vong1, tuoiTho));
                    break;
                case 3:
                    listMaybay.add(new LaitauConThoi(hoTen, email, sdt, canNang, vong1, tuoiTho));
                    break;
                default:
                    System.out.println("Chon 1 trong 3 loai thoi, an day the");
            }
            System.out.print("Ban con muon nhap tiep khong?(Y/N)");
            String op = sc.nextLine();
            if(op.equalsIgnoreCase("n")){
                break;
            }
        }
    }
    public void xuatTT(){
        for (Laimaybay xx : listMaybay) {
            xx.xuatTT();
        }
    }
    public void xuatKhoangv1(){
        System.out.print("Nhap khoang bat dau: ");
        double minV1 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap khoang ket thuc: ");
        double maxv1 = Double.parseDouble(sc.nextLine());
        for (Laimaybay xx : listMaybay) {
            if(xx.getVong1()>=minV1 && xx.getVong1()<=maxv1){
                xx.xuatTT();
            }
        }
    }
    public void timTheoten(){
        System.out.print("Nhap ho ten may bay: ");
        String name = sc.nextLine();
        for (Laimaybay xx : listMaybay) {
            if(xx.getHoTen().equalsIgnoreCase(name)){
                xx.xuatTT();
            }
        }
    }
    public void suaTheoSDT(){
        System.out.print("Nhap SDT can tim de sua: ");
        String phone = sc.nextLine();
        System.out.print("Nhap so do vong 1 moi: ");
        double newv1 = Double.parseDouble(sc.nextLine());
        System.out.print("Done");
        for (Laimaybay xx : listMaybay) {
            if(xx.getSdt().equals(phone)){
                xx.setVong1(newv1);
                xx.xuatTT();
            }
        }
    }
    public void xoaTheoSDT(){
        System.out.print("Nhap SDT de tim nguoi can xoa: ");
        String phone = sc.nextLine();
        for (Laimaybay xx : listMaybay) {
            if(xx.getSdt().equals(phone)){
                listMaybay.remove(xx);
            }
        }
    }
    public void timMinh(){
        for (Laimaybay xx : listMaybay) {
            if(xx.getHoTen().contains("Minh")){
                xx.xuatTT();
            }
        }
    }
    public void timHoThanh(){
        for (Laimaybay xx : listMaybay) {
            if(xx.getHoTen().startsWith("Thanh")){
                xx.xuatTT();
            }
        }
    }
    public void sapXepv1(){
        listMaybay.sort((Laimaybay o1,Laimaybay o2)->Double.compare(o2.getVong1(), o1.getVong1()));
        for (Laimaybay xx : listMaybay) {
            xx.xuatTT();
        }
    }
    public void sapXeptopVong1(){
        listMaybay.sort((Laimaybay o1,Laimaybay o2)->Double.compare(o2.getVong1(), o1.getVong1()));
        int count =0;
        for (Laimaybay xx : listMaybay) {
            if(count==5){
                break;
            }else{
                xx.xuatTT();
            }
            count++;
        }
//        for (int i = 1; i < 5; i++) {
//            System.out.print(listMaybay);
//        }
    }
}
