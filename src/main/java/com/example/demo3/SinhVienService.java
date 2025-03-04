package com.example.demo3;

import org.apache.commons.compress.harmony.pack200.NewAttribute;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> sinhViens = new ArrayList<SinhVien>();

    public boolean them(SinhVien sinhVien) {
        if (sinhVien == null) {
            throw new NullPointerException("sinhVien is null");
        }
        for (SinhVien sv : sinhViens) {
            if (sv.getId().equals(sinhVien.getId())) {
                throw new IllegalArgumentException("id sinh vien khong duoc trung");
            }
        }
        return sinhViens.add(sinhVien);
    }


    public boolean sua(SinhVien sinhVien) {
        if (sinhVien == null) {
            throw new NullPointerException("sinhVien is null");
        }
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i).getId().equals(sinhVien.getId())) {
                sinhViens.set(i, sinhVien);
                return true;
            }
        }
        throw new IllegalArgumentException("khong tim thay id sinh vien ");

    }

    public boolean soa(Long id) {
        if (id == null) {
            throw new NullPointerException("id is null");
        }
        return sinhViens.removeIf(sv -> sv.getId().equals(id));
    }


    public SinhVien getSinhVien(Long id) {
        if (id == null) {
            throw new NullPointerException("id is null");
        }
        for (SinhVien sv : sinhViens) {
            if (sv.getId().equals(id)) {
                return sv;
            }
        }
        throw new IllegalArgumentException("khong tim thay id ");
    }
}
