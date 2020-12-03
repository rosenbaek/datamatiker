package com.company;

import static java.lang.Math.abs;

public class TegnFirkant {

    public static void tegnFirkant(int x, String j){
        for(int i = 0; i < abs(x); i++){
            System.out.println();
            for(int y = 0; y < abs(x); y++){
                System.out.print(""+j+"  ");
            }

        }
    }
}
