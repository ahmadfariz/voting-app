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

    @Generated(hash = 808936407)
    public User(Long id, @NotNull String pilihan) {
        this.id = id;
        this.pilihan = pilihan;
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
}
