package com.pgmanagement.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class MealSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mealType;

    private LocalTime mealTime;

    private String notificationMessage;

    private String dayOfWeek;
    
    public MealSchedule() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public LocalTime getMealTime() {
        return mealTime;
    }

    public void setMealTime(LocalTime mealTime) {
        this.mealTime = mealTime;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    public String getDayOfWeek() {
    return dayOfWeek;
}

public void setDayOfWeek(String dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
}
}