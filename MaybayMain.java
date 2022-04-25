
package week5;

import java.util.Scanner;
import week5.QlMaybay;

public class MaybayMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        QlMaybay quanLy = new QlMaybay();
        while (true) {         
            System.out.println("Vui long dang nhap de su dung dich vu");
            System.out.print("Nhap tai khoan: ");
            String user = sc.nextLine();
            System.out.print("Nhap mat khau: ");
            String pass = sc.nextLine();
            if (user.equals("PolyHN") && pass.equals("Java1")) {
                System.out.println("Tai khoan va mat khau chinh xac, dang tien hanh chay truong trinh");
                break;
            } else {
                System.out.print("Tai khoan hoac mat khau khong chinh xac, vui long nhap lai");
            }
        }
        
        while (true) {            
            System.out.println("=======MENU=======");
            System.out.println("1. Nhập danh sách máy bay");
            System.out.println("2. Xuất danh sách máy bay");
            System.out.println("3. Xuất danh sách máy bay theo khoảng vòng 1");
            System.out.println("4. Tìm máy bay theo họ tên");
            System.out.println("5. Tìm và sửa vòng 1 theo số điện thoại");
            System.out.println("6. Xóa máy bay theo số điện thoại");
            System.out.println("7. Tìm tất cả máy bay có chữ \" Minh \" trong tên");
            System.out.println("8. Xuất tất cả máy bay có họ \" Thánh \"");
            System.out.println("9. Sắp xếp từ lớn -> bé theo vòng 1");
            System.out.println("10. In ra top 5 máy bay có vòng 1 lớn nhất");
            System.out.println("0. Siêu thoát");
            System.out.print("Mời nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    quanLy.nhapTT();
                    break;
                case 2:
                    quanLy.xuatTT();
                    break;
                case 3:
                    quanLy.xuatKhoangv1();
                    break;
                case 4:
                    quanLy.timTheoten();
                    break;
                case 5:
                    quanLy.suaTheoSDT();
                    break;
                case 6:
                    quanLy.xoaTheoSDT();
                    break;
                case 7:
                    quanLy.timMinh();
                    break;
                case 8:
                    quanLy.timHoThanh();
                    break;
                case 9:
                    quanLy.sapXepv1();
                    break;
                case 10:
                    quanLy.sapXeptopVong1();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chỉ chọn từ 0 -> thôi bạn! ");
            }
            
        }
    }
}
