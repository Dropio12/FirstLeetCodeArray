package com.company;
import javax.swing.*;
import java.awt.*;


class Fenêtre {
    public final static int LARGEUR = 500;
    public final static int HAUTEUR = 150;

    public static void main(String[] args) {
        Frame F = new Frame();
        F.setTitle("Fenêtre");
        F.setSize(LARGEUR, HAUTEUR);
        F.setBackground(Color.PINK);
        F.setVisible(true);
        F.setTitle("3 Things To Do Today!"); ;

        Checkbox b= new Checkbox("Complete 4 pages of math exercises");
        b.setFont(new Font("Arial", Font.BOLD, 20));
        F.add(b);

        Checkbox c= new Checkbox("Go gym!");
        c.setFont(new Font("Arial", Font.BOLD, 20));
        F.add(c);

        Checkbox d= new Checkbox("Read 10 pages of the productivity project");
        d.setFont(new Font("Arial", Font.BOLD, 20));
        F.add(d);

        Checkbox e= new Checkbox("Read 10 pages of the productivity project");
        F.add(e);

        b.setBounds(10, 30, 400, 30);
        c.setBounds(10, 60, 400, 30);
        d.setBounds(10, 90, 800, 30);

        F.setVisible(true);
        F.setLayout(null);
        F.setAlwaysOnTop(true);
        F.setResizable(false);
        if(b.getState() && c.getState() && d.getState() && e.getState()){
            F.setTitle("You are done!");
        }

        while(true){
            try{
                Thread.sleep(3600000);
            int r = (int)(Math.random()*256);
            int g = (int)(Math.random()*256);
            int k = (int)(Math.random()*256);
            F.setBackground(new Color(r,g,k));

            }
            catch(InterruptedException p){
                System.out.println("Interrupted");
            }
        }
    }

        }




