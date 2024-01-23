package com.example.bteaksa2.Daftar;

public class ModelDaftar {
    private String namaUser;
    private String nomorWhatsapp;
    private String password;
    private String confirmPassword;

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getNomorWhatsapp() {
        return nomorWhatsapp;
    }

    public void setNomorWhatsapp(String nomorWhatsapp) {
        this.nomorWhatsapp = nomorWhatsapp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
