package com.example.gridWars.Models;

import lombok.Data;

import java.util.List;

/**
 * Created by prakash on 24/3/18.
 */
@Data
public class Agent {

    Position curpos;
    int numBullets;
    List<Position> vision;
    String orientation;

}
