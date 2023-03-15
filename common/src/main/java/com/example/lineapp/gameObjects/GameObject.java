package com.example.lineapp.gameObjects;

import com.codename1.ui.geom.Dimension;
import com.codename1.ui.geom.Point2D;

public class GameObject {

    private Point2D location;
    private Dimension dimension;
    private int color;
    private Dimension worldSize;

    public Point2D getLocation(){ return this.location; }

    public void setLocation(int x, int y){
        this.location = new Point2D(x,y);
    }
    public void setLocation(Point2D location){
        this.location = location;
    }

    public Dimension getDimension(){ return this.dimension; }
    public void setDimension(int width, int height) {
        this.dimension = new Dimension(width,height);
    }
    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    int getColor(){ return this.color; }
    void setColor(int color){ this.color = color; }

    public Dimension getWorldSize() { return worldSize; }
    public void setWorldSize(Dimension worldSize) {
        this.worldSize = worldSize;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }

}
