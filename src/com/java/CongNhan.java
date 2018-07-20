package com.java;

import java.util.Scanner;

public class CongNhan {

    private int maTuTang;
    private int ma;
    private String ten;
    private GioiTinh gioiTinh;
    private float luong;
    private float soNgayCong;

    public CongNhan() {
        this.ma = maTuTang;
        maTuTang++;
    }

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

    public float getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(float soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public float getThuNhap() {

        return luong + (soNgayCong / 26) * luong;
    }

    public void nhapThongTin() {

        System.out.println("Nhap ten:");
        this.ten = new Scanner(System.in).nextLine();
        System.out.println("vui Long Chon gioi tinh 1 => Nam, 0 => Nu, # Khong xac dinh");
        int chon = new Scanner(System.in).nextInt();
        this.gioiTinh = GioiTinh.setGioitinh(chon);
        System.out.println("nhap luong ban muon co: ");
        this.luong = new Scanner(System.in).nextFloat();
        System.out.println("Nhap so ngay cong lam viec");
        this.soNgayCong = new Scanner(System.in).nextFloat();

    }

    public void hienThongTin() {

        System.out.println("ma: " + this.ma + " Ten: " + this.ten + " Gioi tinh: " + this.gioiTinh.getTenGioiTinh()
                + " Thu Nhap :" + getThuNhap());
    }

}
