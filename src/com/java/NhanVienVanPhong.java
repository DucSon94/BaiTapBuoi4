package com.java;

import java.util.Scanner;

public class NhanVienVanPhong {

    private static int maTuTang = 0;
    private int ma;
    private String ten;
    private GioiTinh gioiTinh;
    private float luong;
    private float heSo;

    public NhanVienVanPhong() {
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

    public float getHeSo() {
        return heSo;
    }

    public void setHeSo(float heSo) {
        this.heSo = heSo;
    }

    public float getThuNhap() {

        return luong + luong * heSo;
    }

    public void nhapThongTin() {
        System.out.println("Nhap Ten: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.println("Vui long chon gioi tinh: 1 => Nam, 0 => Nu, # KXD");
        int chon = new Scanner(System.in).nextInt();
        this.gioiTinh = GioiTinh.setGioitinh(chon);
        System.out.println("Nhap so luong ma ban muon: ");
        this.luong = new Scanner(System.in).nextFloat();
        System.out.println("Nhap he so ma ban thich: ");
        this.heSo = new Scanner(System.in).nextFloat();

    }

    public void hienThongTin() {
        System.out.println("ma: " + this.ma + " Ten: " + this.ten + " GioiTinh: " + this.gioiTinh.getTenGioiTinh()
                + "  Thu Nhap: " + getThuNhap());

    }

}
