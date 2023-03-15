package com.example.lineapp.gameObjects;

import com.codename1.ui.Graphics;
import com.codename1.ui.geom.Dimension;
import com.codename1.ui.geom.Point;
import com.codename1.ui.geom.Point2D;

public class Line extends GameObject{
    private Point2D start = this.getLocation();
    private Point2D end;
    private int length;

    private int angle;





    public Line(Dimension worldSize, Point2D start, int angle){
        this.setStart(start);
        this.setWorldSize(worldSize);
        this.setAngle(angle);
        Point2D calculatedEndPoint = new Point2D(start.getX() + (getLength() * Math.cos(getAngle())),
                start.getY() + (getLength() * Math.sin(getAngle())));
        this.setEnd(calculatedEndPoint);



    }
    public void draw(Graphics g, Point containerOrigin) {
        g.drawLine((int) (getStart().getX() + containerOrigin.getX()),
                (int) (getStart().getY() + containerOrigin.getX()),
                (int) (getEnd().getX() + containerOrigin.getY()),
                (int) (getEnd().getY() + containerOrigin.getY()));


    }


    public Point2D getEnd() {
        return end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }

    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
}
