package com.example.gridWars.Models;

import lombok.Data;

import java.util.List;

/**
 * Created by prakash on 24/3/18.
 */
@Data
public class WarField {

    int width;
    int height;
    List<Position> goldPositions;

}
