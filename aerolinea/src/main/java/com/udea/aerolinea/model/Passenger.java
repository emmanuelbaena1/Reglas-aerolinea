package com.udea.aerolinea.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Passenger {
    @NotNull(message = "La edad es obligatoria")
    @Min(value = 0, message = "La edad no puede ser negativa")
    @Max(value = 120, message = "La edad no puede superar los 120 años")
    private int age;

    @NotBlank(message = "El estado de membresía es obligatorio")
    private String membershipStatus;

    @NotBlank(message = "La preferencia de asiento es obligatoria")
    private String seatPreference;

    private boolean travelingWithChildren;

    @NotNull(message = "El peso del equipaje es obligatorio")
    @Min(value = 0, message = "El peso del equipaje no puede ser negativo")
    @Max(value = 50, message = "El peso del equipaje no puede superar los 50 kg")
    private double luggageWeight;

    public Passenger() {
    }

    public Passenger(int age, String membershipStatus, String seatPreference,
                     boolean travelingWithChildren, double luggageWeight) {
        this.age = age;
        this.membershipStatus = membershipStatus;
        this.seatPreference = seatPreference;
        this.travelingWithChildren = travelingWithChildren;
        this.luggageWeight = luggageWeight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public String getSeatPreference() {
        return seatPreference;
    }

    public void setSeatPreference(String seatPreference) {
        this.seatPreference = seatPreference;
    }

    public boolean isTravelingWithChildren() {
        return travelingWithChildren;
    }

    public void setTravelingWithChildren(boolean travelingWithChildren) {
        this.travelingWithChildren = travelingWithChildren;
    }

    public double getLuggageWeight() {
        return luggageWeight;
    }

    public void setLuggageWeight(double luggageWeight) {
        this.luggageWeight = luggageWeight;
    }
}