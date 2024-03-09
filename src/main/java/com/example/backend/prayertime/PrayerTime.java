package com.example.backend.prayertime;

import jakarta.persistence.*;

@Entity
@Table(name = "Prayerss")
public class PrayerTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String يوم;
    private String الهجري;
    private String الميلادي;
    private String الامساك;
    private String  الفجر;
    private String   الشروق ;
    private String الظهر;
    private String العصر;
    private String المغرب;
    private String  العشاء;

    // Constructors
    public PrayerTime() {
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getيوم() {
        return يوم;
    }

    public void setيوم(String يوم) {
        this.يوم = يوم;
    }

    public String getالهجري() {
        return الهجري;
    }

    public void setالهجري(String الهجري) {
        this.الهجري = الهجري;
    }

    public String getالميلادي() {
        return الميلادي;
    }

    public void setالميلادي(String الميلادي) {
        this.الميلادي = الميلادي;
    }

    public String getالامساك() {
        return الامساك;
    }

    public void setالامساك(String الامساك) {
        this.الامساك = الامساك;
    }

    public String getالفجر() {
        return الفجر;
    }

    public void setالفجر(String الفجر) {
        this.الفجر = الفجر;
    }

    public String getالشروق() {
        return الشروق;
    }

    public void setالشروق(String الشروق) {
        this.الشروق = الشروق;
    }

    public String getالظهر() {
        return الظهر;
    }

    public void setالظهر(String الظهر) {
        this.الظهر = الظهر;
    }

    public String getالعصر() {
        return العصر;
    }

    public void setالعصر(String العصر) {
        this.العصر = العصر;
    }

    public String getالمغرب() {
        return المغرب;
    }

    public void setالمغرب(String المغرب) {
        this.المغرب = المغرب;
    }

    public String getالعشاء() {
        return العشاء;
    }

    public void setالعشاء(String العشاء) {
        this.العشاء = العشاء;
    }
}
