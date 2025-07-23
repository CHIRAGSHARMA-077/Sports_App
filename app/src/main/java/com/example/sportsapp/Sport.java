package com.example.sportsapp;
//THIS WILL ACT AS MODEL CLASS

public class Sport {
    String sportName;
    Integer sportImg;

    public Sport(String sportName, Integer sportImg) {
        this.sportName = sportName;
        this.sportImg = sportImg;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public Integer getSportImg() {
        return sportImg;
    }

    public void setSportImg(Integer sportImg) {
        this.sportImg = sportImg;
    }
}
