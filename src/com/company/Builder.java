package com.company;

public interface Builder {
    //set function that make reference to interface
    void setType(String type);
    void setRooms(int rooms);
    void setFloors(int floors);
    void setMinWindows(int minWindows);
    void setWalls(Walls wallsType);
    void setRoof(Roof roof);
}
