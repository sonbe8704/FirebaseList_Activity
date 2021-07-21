package com.example.firebaselist_activity;

import android.widget.ImageView;

public class User {
    private String profile;//프로필이미지가 String인 이유  파이어 베이스에서 가져올때 uri로 사용
    private String id;
    private int pw;
    private String userName;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getpw() {
        return pw;
    }

    public void setpw(int pw) {
        this.pw = pw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

