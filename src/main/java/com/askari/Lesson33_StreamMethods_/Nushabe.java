package com.askari.Lesson33_StreamMethods_;

/**
 * Created by Maryam Askari
 * Date: 3/13/2021
 * Time: 7:11 PM
 * Project: IntelliJ IDEA
 */
public class Nushabe {

    private Long id;
    private long weight;
    private String color;
    private String Maze;
    private String berand;


    public Nushabe(long id, long weight, String color, String maze, String berand) {
        this.id = id;
        this.weight = weight;
        this.color = color;
        Maze = maze;
        this.berand = berand;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBerand() {
        return berand;
    }

    public void setBerand(String berand) {
        this.berand = berand;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaze() {
        return Maze;
    }

    public void setMaze(String maze) {
        Maze = maze;
    }
}

