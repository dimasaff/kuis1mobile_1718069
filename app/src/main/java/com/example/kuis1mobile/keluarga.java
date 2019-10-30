package com.example.kuis1mobile;

import android.graphics.drawable.Drawable;

public class keluarga
{
    public String nama, namap;
    public Drawable gambar;

    public Drawable getGambar() {
        return gambar;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }

    public keluarga(Drawable gambar, String nama, String namap)
    {
        this.gambar = gambar;
        this.nama = nama;
        this.namap = namap;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNamap() {
        return namap;
    }

    public void setNamap(String namap) {
        this.namap = namap;
    }
}
