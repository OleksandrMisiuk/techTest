package com.santa.techtest.dto;

import java.time.LocalDate;

public class OrderDto {
    private String country;
    private String city;
    private LocalDate dateDepart;
    private int duration;
    private int numberOfPeople;
    private int seaDistance;
    private String roomType;
    private String meal;
    private int hotelRating;
    private boolean transfer;
    private boolean insurance;
    private boolean visa;

    public OrderDto(String country, String city, LocalDate dateDepart, int duration, int numberOfPeople,
                    int seaDistance, String roomType, String meal, int hotelRating, boolean transfer, boolean insurance, boolean visa) {
        this.country = country;
        this.city = city;
        this.dateDepart = dateDepart;
        this.duration = duration;
        this.numberOfPeople = numberOfPeople;
        this.seaDistance = seaDistance;
        this.roomType = roomType;
        this.meal = meal;
        this.hotelRating = hotelRating;
        this.transfer = transfer;
        this.insurance = insurance;
        this.visa = visa;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getSeaDistance() {
        return seaDistance;
    }

    public void setSeaDistance(int seaDistance) {
        this.seaDistance = seaDistance;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getHotelRating() {
        return hotelRating;
    }

    public void setHotelRating(int hotelRating) {
        this.hotelRating = hotelRating;
    }

    public boolean isTransfer() {
        return transfer;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public boolean isVisa() {
        return visa;
    }

    public void setVisa(boolean visa) {
        this.visa = visa;
    }


}
