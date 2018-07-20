package com.java;

import java.util.Scanner;

public class QuanLy {

    private static int maTuTang = 0;
    private int ma;
    private String ten;
    private GioiTinh gioiTinh;
    private float luong;
    private int soNhanVien;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    private float getPhuCap(int soNhanVien) {
        if (soNhanVien < 10) {
            return 500;
        } else if (soNhanVien >= 10 || soNhanVien <= 20) {
            return 1000;
        } else {
            return 2000;
        }

    }

    public float getThuNhap() {
        return luong + getPhuCap(soNhanVien);
    }

    public void nhapThongTin() {
        System.out.println("Nhap ten: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.println("Ban vui long chon gioi tinh: 1 => Nam, 0 => Nu, # => KXD");
        int chon = new Scanner(System.in).nextInt();
        this.gioiTinh = GioiTinh.setGioitinh(chon);
        System.out.println("Nhap so luong ma ban muon: ");
        this.luong = new Scanner(System.in).nextFloat();
        System.out.println("Nhap so nhan vien ma ban quan ly: ");
        this.soNhanVien = new Scanner(System.in).nextInt();

    }

    public void hienThongTin() {
        float phuCap = getPhuCap(soNhanVien);
        System.out.println("ma: " + this.ma + " Ten: " + this.ten + " Gioi tinh: " + this.gioiTinh.getTenGioiTinh()
                + "Luong: " + this.luong + " So nhan vien dang quan ly: " + this.soNhanVien + " phu cap: " + phuCap
                + " Thu Nhap: " + getThuNhap());
    }

}
