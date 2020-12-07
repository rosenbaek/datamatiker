package com.company;

public class Græs {

    public static float slåGræs(float aktuel, float maxHøjde){
        float græsUdvikling = 0.8f;
        float dageTilGræsSlåning = (maxHøjde-aktuel)/græsUdvikling;
        return dageTilGræsSlåning;
    }
}
