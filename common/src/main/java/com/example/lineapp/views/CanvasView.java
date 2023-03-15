package com.example.lineapp.views;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Container;
import com.codename1.ui.Graphics;
import com.codename1.ui.geom.Dimension;
import com.example.lineapp.GameWorld;

public class CanvasView extends Container {
    GameWorld gw;

    public CanvasView(GameWorld gw){
        this.gw = gw;
        this.getStyle().setBgColor(ColorUtil.BLACK);
        this.getStyle().setBgTransparency(255);

    }

    @Override
    public void laidOut(){
        gw.setWorldSize(new Dimension(this.getWidth(),this.getHeight()));
        gw.init();
    }

    public void paint(Graphics g){
        super.paint(g);
    }
    public void update(){
        gw.tick();
    }
}
