package com.example.gridWars.Models;

import lombok.Data;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by prakash on 24/3/18.
 */
@Data
public class Position {
    int xpos,ypos;



    public void setXPos(int xlimit){
        this.xpos = ThreadLocalRandom.current().nextInt(0, xlimit + 1);
    }

    public void setYpos(int ylimit){
        this.ypos = ThreadLocalRandom.current().nextInt(0, ylimit + 1);
    }


}