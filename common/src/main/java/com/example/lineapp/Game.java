package com.example.lineapp;

import com.codename1.ui.Form;
import com.codename1.ui.Graphics;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.util.UITimer;
import com.example.lineapp.views.CanvasView;

public class Game extends Form implements Runnable {

    private GameWorld gw;
    CanvasView canvasView;
    public void paint(Graphics g){
        super.paint(g);
    }
    @Override
    public void run(){
        repaint();
        canvasView.update();
    }

    public Game(){
        UITimer timer = new UITimer(this);
        timer.schedule(30,true,this);
        gw = new GameWorld();
        canvasView = new CanvasView(gw);


        this.setLayout(new BorderLayout());
        this.add(BorderLayout.NORTH, canvasView);
    }
}

