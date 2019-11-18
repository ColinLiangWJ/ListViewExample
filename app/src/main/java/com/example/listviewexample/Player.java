package com.example.listviewexample;

public class Player {
    //Todo finish the class player
        // Todo 5 member variables
        //Todo name, age, worth(money), main sport and int image resource from drawable
        //Todo create constructor and getters and setters
        // use Android Studio for fast writing code, find Code->Generate
    public void setall(String a, int b,int c,String d,int f){
        name=a;
        age=b;
        worth=c;
        mainSport=d;
        image=f;
    }
    private String name;
    private int age;
    private int worth;
    private String mainSport;
    private int image;
    public String getName(){ return name; }
    public int getage(){ return age; }
    public int getWorth(){ return worth; }
    public String getMainsport(){ return mainSport; }
    public int getImage(){ return image; }
    public void setName(String s){ name=s; }
    public void setAge(int s){ age=s; }
    public void setWorth(int s){ worth=s; }
    public void setMainSport(String s){ mainSport=s; }
    public void setImage(int s){ image=s; }









}
