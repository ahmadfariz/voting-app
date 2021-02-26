package com.fariz.voting;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

@Entity
public class User {
    @Id
    private Long id;
    @NotNull
    private String pilihan;
    @NotNull
    private String tanggal;
    @NotNull
    private String jam;

    @Generated(hash = 195912910)
    public User(Long id, @NotNull String pilihan, @NotNull String tanggal,
            @NotNull String jam) {
        this.id = id;
        this.pilihan = pilihan;
        this.tanggal = tanggal;
        this.jam = jam;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPilihan() {
        return pilihan;
    }

    public void setPilihan(String pilihan) {
        this.pilihan = pilihan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
}
