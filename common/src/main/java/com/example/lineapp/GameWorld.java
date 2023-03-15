package com.example.lineapp;

import com.codename1.ui.geom.Dimension;
import com.codename1.ui.geom.Point2D;
import com.example.lineapp.gameObjects.Line;


public class GameWorld {
    private Line line;
    Dimension worldSize;

    public GameWorld(){
        worldSize = new Dimension();

    }

    public void init(){
        //TODO:add gameObjects in this function
        line = new Line(worldSize, new Point2D(100,100), 30);


    }

    public void setWorldSize(Dimension dimension) {
        this.worldSize = dimension;
    }
    public void tick(){

        System.out.println(System.currentTimeMillis());
    }
}
