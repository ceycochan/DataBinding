package com.nshane.databinding.bean;

import com.nshane.databinding.R;

/**
 * Created by lbl on 2017/5/23.
 */

public class User {
    private String name;
    private int score;
    private int level;
    private int avatar;


    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getLevel() {
        return level;
    }

    public int getAvatar() {
        return avatar;
    }

    public static User newInstance() {
        User u = new User();
        u.setName("小新" + (int) (Math.random() * 10));
        u.setScore((int) (Math.random() * 999));
        u.setLevel((int) (Math.random() * 77));
        u.setAvatar(R.drawable.xiaoxin);

        return u;
    }
}
