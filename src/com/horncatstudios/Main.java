package com.horncatstudios;

public class Main {

    public static void main(String[] args) {

        MovingCat samTheCat = new MovingCat();

        //PRACTICING STATEMENTS

        //! Can change this code below (remove lines, add lines,)
        //! sam the cat can go up(), down(), left(), right()
        samTheCat.left();
        samTheCat.right();
        samTheCat.down();
        samTheCat.down();
        samTheCat.left();
        samTheCat.up();
        samTheCat.up();


        System.out.println("");
        System.out.println("---------------");
        System.out.println("CHANGE DA SPEED!");
        System.out.println("---------------");
        System.out.println("");


        // PRACTICING STATEMENTS BY CHANGING SPEED
        // Practice changing the numbers of the statements below
        //! NOTE:  dx is a way of changing how fast something is moving in the x direction (aka left and right )
        //         dy is a way of changing how fast something is moving in the y direction (aka up and down )
        samTheCat.DX = 20;
        samTheCat.DY = 20;

        samTheCat.left();
        samTheCat.right();
        samTheCat.right();
        samTheCat.down();
        samTheCat.down();
        samTheCat.left();
        samTheCat.up();
        samTheCat.up();
    }
}
