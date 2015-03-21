package org.gyt.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletGame extends Applet implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x, y, w, h, strt, arc;
	public static Button start, stop;
	boolean flag1, flag2, flag3;
	public static  Label p;
	public static int foodX=230;
	int foodY=90;


	public void init() {
		
		x = 30;
		y = 40;
		w = 100;
		h = 100;
		
		setVisible(true);
		setLayout(null);
		start = new Button("START");
		stop = new Button("STOP");
		p=new Label("*");
		start.setBounds(200, 0, 40, 20);
		stop.setBounds(270, 0, 40, 20);
		p.setBounds(foodX, foodY, 7, 7);
		
		strt = 25;
		arc = 315;
		add(start);
		add(stop);
		add(p);
		start.addActionListener(this);
		stop.addActionListener(this);
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillArc(x, y, w, h, strt, arc);
		

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == start) {
			if (flag2 == false)
				new DrawThread(this);
		}
		if (e.getSource() == stop) {
			flag2 = false;
		}
	}
}

class DrawThread extends Thread {
	AppletGame a;
	int maxRight =360;

	DrawThread(AppletGame a) {
		this.a = a;
		start();
	}

	public void run() {
		a.flag2 = true;
		while (a.flag2) {
			AppletGame.p.setVisible(true);
			
			AppletGame.foodX = 50 + (int)(Math.random()*320);
			
			try {
				sleep(200);
			} catch (Exception e) {
			}
			if (!a.flag1) {
				a.x += 10;
				if (!a.flag3) {
				
					a.strt -= 15;
					a.arc += 15;
				} else {
				
					a.strt += 15;
					a.arc -= 15;
				}
			}
			if (a.flag1) {
				a.x -= 10;
				if (!a.flag3)
					a.arc += 15;
				if (a.flag3)
					a.arc -= 15;
			}
			if (a.x == 300) {
				a.flag1 = true;
				a.strt = 180;
				a.arc = 315;
			}
			if (a.x == 30) {
				a.flag1 = false;
				a.strt = 45;
				a.arc = 315;
			}
			if (a.strt == 0 || a.arc == 360) {
				a.flag3 = true;
			}
			if (a.strt == 45 || a.arc == 315) {
				a.flag3 = false;
			}
			a.repaint();
			if(a.x==AppletGame.foodX)
			{
				AppletGame.p.setVisible(false);
			}
		}
	}
}