package com.java;

public enum GioiTinh {
    NAM(1, "Nam"), NU(0, "Nu"), KXD(-1, "Gioi Tinh Khac");
    private int ma;
    private String tenGioiTinh;

    private GioiTinh(int ma, String tenGioiTinh) {
        this.ma = ma;
        this.tenGioiTinh = tenGioiTinh;
    }

    public static GioiTinh setGioitinh(int ma) {
        switch (ma) {
            case 1:
                return NAM;
            case 0:
                return NU;

            default:
                return KXD;
        }

    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenGioiTinh() {
        return tenGioiTinh;
    }

    public void setTenGioiTinh(String tenGioiTinh) {
        this.tenGioiTinh = tenGioiTinh;
    }

}
