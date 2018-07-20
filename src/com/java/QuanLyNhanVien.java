package com.java;

import java.util.Scanner;

public class QuanLyNhanVien {

	// QuanLyNhanvien qlnv = new QuanLyNhanvien();
	CongNhan[] danhSachCongNhan = null;
	NhanVienVanPhong[] danhSachNhanVienVanPhong = null;

	QuanLy[] danhSachQuanLy = null;

	public CongNhan[] nhapDanhSachCongNhan() {
		boolean check = true;
		while (check) {
			System.out.println("Nhap so luong cong nhan");
			int soLuong = new Scanner(System.in).nextInt();
			if (soLuong > 0) {
				CongNhan[] danhSach = new CongNhan[soLuong];
				// check = false;
				for (int i = 0; i < danhSach.length; i++) {

					CongNhan congNhan = new CongNhan();
					congNhan.nhapThongTin();
					danhSach[i] = congNhan;

				}
				return danhSach;

			}
		}
		return null;
	}

	public NhanVienVanPhong[] nhapDanhSachNhanVienVanPhong() {
		boolean check = true;
		while (check) {
			System.out.println("Nhap so luong nhan vien van phong");
			int soLuong = new Scanner(System.in).nextInt();
			if (soLuong > 0) {
				NhanVienVanPhong[] danhSach = new NhanVienVanPhong[soLuong];
				// check = false;
				for (int i = 0; i < danhSach.length; i++) {
					NhanVienVanPhong nhanVienVanPhong = new NhanVienVanPhong();
					nhanVienVanPhong.nhapThongTin();
					danhSach[i] = nhanVienVanPhong;
				}
				return danhSach;

			}
		}
		return null;
	}

	public QuanLy[] nhapDanhSachQuanLy() {
		boolean check = true;
		while (check) {
			System.out.println("Nhap so luong quan ly");
			int soLuong = new Scanner(System.in).nextInt();
			if (soLuong > 0) {
				QuanLy[] danhSach = new QuanLy[soLuong];
				// check = false;
				for (int i = 0; i < danhSach.length; i++) {
					QuanLy quanLy = new QuanLy();
					quanLy.nhapThongTin();
					danhSach[i] = quanLy;
				}
				return danhSach;

			}
		}
		return null;
	}

	public void hienDanhSachCongNhan(CongNhan danhSach[]) {
		if (danhSach != null) {
			for (int i = 0; i < danhSach.length; i++) {
				CongNhan congNhan = danhSach[i];
				congNhan.hienThongTin();

			}
		} else {
			System.out.println("Khong co cong nhan nao");
		}

	}

	public void hienDanhSachNhanVienVanPhong(NhanVienVanPhong danhSach[]) {
		if (danhSach != null) {
			for (int i = 0; i < danhSach.length; i++) {

				NhanVienVanPhong nhanVienVanPhong = danhSach[i];
				nhanVienVanPhong.hienThongTin();
			}
		} else {
			System.out.println("Khong co nhan vien van phong nao");
		}

	}

	public void hienDanhSachQuanLy(QuanLy danhSachQuanLy[]) {
		if (danhSachQuanLy != null) {
			for (int i = 0; i < danhSachQuanLy.length; i++) {
				QuanLy quanLy = danhSachQuanLy[i];
				quanLy.hienThongTin();
			}
		} else {
			System.out.println("khong co nhan vien quan ly nao");
		}

	}

	public CongNhan congNhanCoThuNhapCaoNhatTheoGioiTinh(CongNhan danhSach[], GioiTinh gioiTinh) {
		if (danhSach != null) {
			int count = 0;
			for (int i = 0; i < danhSach.length; i++) {
				if (danhSach[i].getGioiTinh().getMa() == gioiTinh.getMa()) {
					count++;

				}
			}
			if (count > 0) {
				CongNhan[] danhSachCongNhanTheoGioiTinh = new CongNhan[count];
				count = 0;
				for (int i = 0; i < danhSach.length; i++) {
					CongNhan congNhan = danhSach[i];
					if (congNhan.getGioiTinh().getMa() == gioiTinh.getMa()) {
						danhSachCongNhanTheoGioiTinh[count] = danhSach[i];
						count++;

					}
				}
				CongNhan congNhanLuongCaoNhat = congNhanLuongCaoNhat(danhSachCongNhanTheoGioiTinh);
				return congNhanLuongCaoNhat;
			}
		}

		return null;
	}

	public NhanVienVanPhong nhanVienVanPhongCoThuNhapCaoNhatTheoGioitinh(NhanVienVanPhong danhSach[],
			GioiTinh gioiTinh) {
		if (danhSach != null) {
			int count = 0;
			for (int i = 0; i < danhSach.length; i++) {
				NhanVienVanPhong nhanVienVanPhong = danhSach[i];
				if (nhanVienVanPhong.getGioiTinh().getMa() == gioiTinh.getMa()) {
					count++;
				}
			}
			if (count > 0) {
				NhanVienVanPhong[] danhSachNhanVienVanPhongTheoGioitinh = new NhanVienVanPhong[count];
				count = 0;
				for (int i = 0; i < danhSach.length; i++) {
					NhanVienVanPhong nhanVienVanPhong = danhSach[i];
					if (nhanVienVanPhong.getGioiTinh().getMa() == gioiTinh.getMa()) {
						danhSachNhanVienVanPhongTheoGioitinh[count] = danhSach[i];
						count++;
					}
				}
				NhanVienVanPhong nhanVienVanPhongLuogCaoNhat = nhanVienVanPhongLuongCaoNhat(
						danhSachNhanVienVanPhongTheoGioitinh);
				return nhanVienVanPhongLuogCaoNhat;
			}
		}

		return null;

	}

	public QuanLy quanLyCoThuNhapCaoNhatTheoGioiTinh(QuanLy danhSach[], GioiTinh gioiTinh) {

		if (danhSach != null) {
			int count = 0;
			for (int i = 0; i < danhSach.length; i++) {
				QuanLy quanLy = danhSach[i];
				if (quanLy.getGioiTinh().getMa() == gioiTinh.getMa()) {
					count++;
				}

			}
			if (count > 0) {
				QuanLy[] danhSachQuanLyTheoGioiTinh = new QuanLy[count];
				count = 0;
				for (int i = 0; i < danhSach.length; i++) {
					QuanLy quanLy = danhSach[i];
					if (quanLy.getGioiTinh().getMa() == gioiTinh.getMa()) {
						danhSachQuanLyTheoGioiTinh[count] = danhSach[i];
						count++;
					}

				}
				QuanLy quanLyLuongCaoNhat = quanLyLuongCaoNhat(danhSachQuanLyTheoGioiTinh);

				return quanLyLuongCaoNhat;
			}
		}
		return null;
	}

	public CongNhan congNhanLuongCaoNhat(CongNhan danhSach[]) {
		if (danhSach != null) {
			CongNhan congNhanLuongCaoNhat = danhSach[0];
			for (int i = 1; i < danhSach.length; i++) {
				if (congNhanLuongCaoNhat.getThuNhap() < danhSach[i].getThuNhap()) {
					congNhanLuongCaoNhat = danhSach[i];
				}
			}
			return congNhanLuongCaoNhat;

		}
		return null;
	}

	public NhanVienVanPhong nhanVienVanPhongLuongCaoNhat(NhanVienVanPhong danhSach[]) {
		if (danhSach != null) {
			NhanVienVanPhong nhanVienVanPhongLuongCaoNhat = danhSach[0];
			for (int i = 1; i < danhSach.length; i++) {
				if (nhanVienVanPhongLuongCaoNhat.getThuNhap() < danhSach[i].getThuNhap()) {
					nhanVienVanPhongLuongCaoNhat = danhSach[i];
				}
			}
			return nhanVienVanPhongLuongCaoNhat;
		}
		return null;
	}

	public QuanLy quanLyLuongCaoNhat(QuanLy danhSach[]) {
		if (danhSach != null) {
			QuanLy quanLyLuongCaoNhat = danhSach[0];
			for (int i = 0; i < danhSach.length; i++) {
				if (quanLyLuongCaoNhat.getThuNhap() < danhSach[i].getThuNhap()) {
					quanLyLuongCaoNhat = danhSach[i];
				}
			}
			return quanLyLuongCaoNhat;
		}

		return null;
	}

	public void hienMenu() {
		System.out.println("1.Nhap danh sach");
		System.out.println("2.Hien Danh Sach");
		System.out.println("3.tim nhan vien co thu nhap cao nhat theo:");
	}

	public void nhapDuLieu() {

		danhSachCongNhan = nhapDanhSachCongNhan();
		danhSachNhanVienVanPhong = nhapDanhSachNhanVienVanPhong();
		danhSachQuanLy = nhapDanhSachQuanLy();

	}

	public void hienDuLieu() {
		System.out.println(" 1.Danh sach cong nhan:");
		hienDanhSachCongNhan(danhSachCongNhan);
		System.out.println(" 2.Danh sach nhan vien van phong");
		hienDanhSachNhanVienVanPhong(danhSachNhanVienVanPhong);
		System.out.println("3. Danh sach quan ly");
		hienDanhSachQuanLy(danhSachQuanLy);
	}

	public void nhanVienCoLuongCaoNhatTheoGioitinh() {
		System.out.println("Chon gioi tinh");
		System.out.println("1 => Nam, 0 => NU, # => KXD");
		int chonGioiTinh = new Scanner(System.in).nextInt();
		GioiTinh gioiTinh = GioiTinh.setGioitinh(chonGioiTinh);
		CongNhan kqCongNhan = congNhanCoThuNhapCaoNhatTheoGioiTinh(danhSachCongNhan, gioiTinh);
		NhanVienVanPhong kqNhanVienVanPhong = nhanVienVanPhongCoThuNhapCaoNhatTheoGioitinh(danhSachNhanVienVanPhong,
				gioiTinh);
		QuanLy kqQuanLy = quanLyCoThuNhapCaoNhatTheoGioiTinh(danhSachQuanLy, gioiTinh);
		if (kqCongNhan != null) {
			System.out.println("Cong nhan co luong cao nhat theo gioi tinh: " + gioiTinh.getTenGioiTinh() + "la:");
			kqCongNhan.hienThongTin();
		} else {
			System.out.println("khong co du lieu cong nhan gioi tinh: " + gioiTinh.getTenGioiTinh()
					+ "nen khong tim dc cong nhan co luong cao nhat");
		}
		if (kqNhanVienVanPhong != null) {
			System.out.println(
					"Nhan vien van phong co luong cao nhat theo gioi tinh: " + gioiTinh.getTenGioiTinh() + "la:");
			kqNhanVienVanPhong.hienThongTin();
		} else {
			System.out.println("khong co du lieu nhan vien van phong gioi tinh: " + gioiTinh.getTenGioiTinh()
					+ "nen khong tim dc nhan vien van phong co luong cao nhat");
		}
		if (kqQuanLy != null) {
			System.out.println("Quan lyco luong cao nhat theo gioi tinh: " + gioiTinh.getTenGioiTinh() + "la:");
			kqQuanLy.hienThongTin();
		} else {
			System.out.println("khong co du lieu quan ly gioi tinh: " + gioiTinh.getTenGioiTinh()
					+ "nen khong tim dc quan ly co luong cao nhat");
		}
	}

	public void nhanVienCoLuongCaoNhatTheoPhongBan() {

		CongNhan congNhanLuongCaoNhat = congNhanLuongCaoNhat(danhSachCongNhan);
		NhanVienVanPhong nhanvienVanPhongLuongCaoNhat = nhanVienVanPhongLuongCaoNhat(danhSachNhanVienVanPhong);
		QuanLy quanLyLuongCaoNhat = quanLyLuongCaoNhat(danhSachQuanLy);
		if (congNhanLuongCaoNhat != null && nhanvienVanPhongLuongCaoNhat != null && quanLyLuongCaoNhat != null) {
			System.out.println("Cong nhan co luong cao nhat la:");
			congNhanLuongCaoNhat.hienThongTin();
			System.out.println("Nhan vien van phong co luong cao nhat la");
			nhanvienVanPhongLuongCaoNhat.hienThongTin();
			System.out.println("Quan ly co luong cao nhat la: ");
			quanLyLuongCaoNhat.hienThongTin();
		}
	}

}
