package com.company;

public class ProperCase {

    public static String tekstFormat(String str){
        if(str != null) {
            String[] arr = str.split(" ");
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > 3 && !arr[i].toUpperCase().equals(arr[i])) {
                    arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1) + " ";
                    System.out.println(arr[i]);
                } else if (arr[i].length() <= 3 && !arr[i].toUpperCase().equals(arr[i])) {
                    arr[i] = arr[i].toLowerCase() + " ";
                } else {
                    arr[i] = arr[i] + " ";
                }
            }
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]);
            }
            String string = sb.toString();
            return string;
        }
            return "String is null";
    }
}
