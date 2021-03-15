package com.company;

public class Director {
    //function to build house that client choice
    public void buildLargeHouse(Builder builder){
        builder.setType("Large House");
        builder.setRooms(8);
        builder.setFloors(3);
        builder.setMinWindows(2);
        builder.setRoof(new Roof("Something"));
        builder.setWalls(new Walls("Yellow"));// :)
    }

    public void buildAverageHouse(Builder builder){
        builder.setType("Average House");
        builder.setRooms(6);
        builder.setFloors(2);
        builder.setMinWindows(2);
        builder.setRoof(new Roof("Something"));
        builder.setWalls(new Walls("Brownn"));
    }

    public void buildSmallHouse(Builder builder){
        builder.setType("Small House");
        builder.setRooms(3);
        builder.setFloors(1);
        builder.setMinWindows(2);
        builder.setRoof(new Roof("Flat"));
        builder.setWalls(new Walls("Wood"));
    }
}
