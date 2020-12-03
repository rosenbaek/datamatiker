package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise {

    public static boolean arrayListExercise (ArrayList<String> arr, String str) {
        boolean result = false;

            if (str != null && !str.isEmpty() && !arr.contains(str)) {
                arr.add(str);
                result = true;
            }
            for (String s : arr) {
                System.out.println(s);
            }
            Collections.sort(arr);

        return result;
    }
}
