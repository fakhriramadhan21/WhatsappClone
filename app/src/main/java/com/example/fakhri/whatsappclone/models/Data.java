
package com.example.fakhri.whatsappclone.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("no_telp")
    @Expose
    private String noTelp;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.status = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.status = password;
    }


}
