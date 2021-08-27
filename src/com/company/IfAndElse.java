package com.company;

public class IfAndElse {
    public static void main(String[] args) {
        boolean isMooring = true;
        boolean goodBay = false;
        boolean goodMooring = true;
        if (isMooring != goodBay) {
            System.out.println("welcome for anybody");
        }else if (goodMooring){
            System.out.println("Hello for you");
        } else {
            System.out.println("Welcome");
        }
    }
}
