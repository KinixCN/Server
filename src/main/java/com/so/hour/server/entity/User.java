package com.so.hour.server.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String nickname;
    private String photo;
    private double correctRate;
    private int correctNum;
    private int incorrectNum;
    private int propsTimes;
    private int shortestTime;
    private int totalTime;
    private int tipsPropNum;
    private int restartPropNum;
}
