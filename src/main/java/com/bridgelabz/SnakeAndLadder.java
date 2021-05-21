package com.bridgelabz;

public class SnakeAndLadder {
        public static int position=0;
        public  int die_rolls=0;
        public static void main(String[] args) {
            System.out.println("position "+ position);
            int die_rolls=  (int) (Math.floor(Math.random() * 10) % 6 + 1);
            System.out.println(die_rolls);
        }
}
