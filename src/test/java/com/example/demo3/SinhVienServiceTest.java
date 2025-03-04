package com.example.demo3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    private SinhVienService sinhVienService;

    @BeforeEach
    void setUp() {
        sinhVienService = new SinhVienService();
    }

    @Test
    void them() {
        assertTrue(sinhVienService.them( new SinhVien(1l, "sinh vien 1", 18, 10.0)));
    }

    @Test
    void them1() {
        assertThrows(NullPointerException.class, () -> sinhVienService.them(null));
    }

    @Test
    void them2() {
        assertThrows(IllegalArgumentException.class, () -> sinhVienService.them(new SinhVien(null, "sinh vien 1", 18, 10.0)));
    }

    @Test
    void them3() {
        assertThrows(IllegalArgumentException.class, () -> sinhVienService.them(new SinhVien(1l, "", 18, 10.0)));
    }

    @Test
    void testThem_DuplicateId_ShouldThrowException() {
        SinhVien sinhVien1 = new SinhVien(1L, "Sinh Vien 1", 18, 10.0);
        SinhVien sinhVien2 = new SinhVien(1L, "Sinh Vien 2", 20, 9.0);
        sinhVienService.them(sinhVien1);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sinhVienService.them(sinhVien2));

    }

    @Test
    void sua() {
        SinhVien sinhVien = new SinhVien(1l, "sinh vien 1", 18, 10.0);
        sinhVienService.them(sinhVien);
        SinhVien sinhVien1 = new SinhVien(1l, "sinh vien 1", 18, 8.0);
        assertTrue(sinhVienService.sua(sinhVien1));
    }

    @Test
    void sua1() {
        assertThrows(NullPointerException.class, () -> sinhVienService.sua(null));
    }

    @Test
    void sua2() {
        SinhVien sinhVien = new SinhVien(1l, "sinh vien 1", 18, 10.0);
        sinhVienService.them(sinhVien);
        SinhVien sinhVien1 = new SinhVien(99l, "sinh vien 1", 18, 8.0);
        assertThrows(IllegalArgumentException.class, () -> sinhVienService.sua(sinhVien1));
    }

    @Test
    void soa() {
        SinhVien sinhVien = new SinhVien(1l, "sinh vien 1", 18, 10.0);
        sinhVienService.them(sinhVien);
        assertTrue(sinhVienService.soa(1l));
    }

    @Test
    void soa1() {
        assertFalse(sinhVienService.soa(99l));
    }

    @Test
    void soa2() {
        assertThrows(NullPointerException.class, () -> sinhVienService.soa(null));
    }

    @Test
    void getSinhVien() {
        SinhVien sinhVien = new SinhVien(1l, "sinh vien 1", 18, 10.0);
        sinhVienService.them(sinhVien);
        assertEquals(sinhVien, sinhVienService.getSinhVien(1l));
    }

    @Test
    void getSinhVien1() {
        SinhVien sinhVien = new SinhVien(1l, "sinh vien 1", 18, 10.0);
        sinhVienService.them(sinhVien);
        assertThrows(IllegalArgumentException.class, () -> sinhVienService.getSinhVien(99l));
    } @Test
    void getSinhVien2() {
        assertThrows(NullPointerException.class, () -> sinhVienService.getSinhVien(null));
    }

}