package com.example.week2.model;

public abstract class House implements Shelter {

    private int price;
    private int area;
    private int numberOfRooms;

    public House() {
    }

    public House(int price, int area, int numberOfRooms) {
        this.price = price;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getPrice() {
        return price;
    }

    public int getArea() {
        return area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", area=" + area +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}
