package com.example.test1;
import java.util.Random;
class fuckery {


    public static String text = "Hi Kenya, just letting you know I love you!";
    public static String text1 = "ur fuckin hot - reece";
    public static String text2 = "Hey baby, don't forget how amazing of a person you are no matter what!";
    public static String text3 = "I hope you have a great time doing whatever you're doing right now";
    public static String text4 = "Maybe you should text me lol jk, but seriously hit me up if you haven't";


    public static String getText(){
        Random rand = new Random();
        int n = rand.nextInt(5);
        switch (n){
            case 0:
                return text;
            case 1:
                return text1;
            case 2:
                return text2;

            case 3:
                return text3;

            case 4:
                return text4;
            default:
                return text4;
        }
    }
}
