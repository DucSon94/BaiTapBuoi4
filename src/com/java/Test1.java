package com.java;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        while (true) {
            qlnv.hienMenu();
            int chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1:
                    qlnv.nhapDuLieu();
                    break;
                case 2:
                    qlnv.hienDuLieu();
                    break;
                case 3:
                    System.out.println("1\t Gioitinh");
                    System.out.println("2\t Theo vi tri (1 =>Cong nhan , 2 => Nhan vien van phong , # =>Quan ly)");
                    int nhap = new Scanner(System.in).nextInt();
                    switch (nhap) {
                        case 1:
                            qlnv.nhanVienCoLuongCaoNhatTheoGioitinh();
                            break;
                        case 2:
                            qlnv.nhanVienCoLuongCaoNhatTheoPhongBan();
                            break;
                        default:
                            System.out.println("Vui long chon muc 1 hoac 2");
                    }
                    break;
                case 4:
                    System.out.println("Cam on thim da su dung chuong trinh :D");
                    System.exit(0);
                default:
                    System.out.println("vui long chon muc 1 or 2 or 3 or 4 thank you ");
            }

        }
    }

}
