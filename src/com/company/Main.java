package com.company;

public class Main {

    public static void main(String[] args) {
        compare();
    }
    public static void compare(){
        System.out.println("N" + "          " + "Y1" + "          " + "Y2");
        for(int i = 0; i <= 100; i+=10){
            int y1 = 100 * i + 10;
            int y2 = 5 * i * i + 2;

            System.out.println(i + "          " + y1 + "          " + y2);
        }
    }
}
