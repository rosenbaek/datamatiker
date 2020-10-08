package com.Task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Walls wall = new Walls();
        Room bedRoom = new Room(wall,1,2,2);
        Room livingRoom = new Room(wall,1,4,3);
        Room diningRoom = new Room(wall,2,5,2);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(bedRoom);
        rooms.add(livingRoom);
        rooms.add(diningRoom);

        Building headQuarter = new Building(rooms,2,10,false);
        int totalLamps = 0;
        for (int i = 0; i < rooms.size(); i++) {
            totalLamps = totalLamps + headQuarter.getRooms().get(i).getNumberOfLamps();
        }
        //for (Room tmp : rooms){
        //    totalLamps = rooms.getNumberOfLamps();
        //}
        System.out.println(totalLamps);

        if (headQuarter.getNumberOfFloors() > headQuarter.getRooms().size())  {
            System.out.println("This is an odd building");
        }
    }

}
