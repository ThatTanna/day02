package models;

import java.util.Date;

// Created before main
public class Car {

    // Properties (Members of the class)
    private String colour;
    private String make;
    private String registration;
    private Date registrationDate;
    private Integer acceleration;

    public Car() { }
    // When you add a constructor, the default constructor disappears
    public Car(String registration) {
        this.registration = registration;
    }
    public Car(String registration, String colour) {
        this.registration = registration;
        this.colour = colour;
    }
    public Car(String registration, String colour, String make) {
        this.registration = registration;
        this.colour = colour;
        this.make = make;
    }

    // Access methods to our members
    // getMemberName, setMemberName
    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    /// make - getter and setter for our members
    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        switch (make.toLowerCase()) {
            case "honda":
            case "toyota":
            case "mazada":
                this.make = make.toLowerCase();
                break;
        }
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    // Behaviour - method
    public void horn() {
        System.out.println("horn horn horn");
    }

    public void accelerate() {
        if (this.acceleration < 200) {
            this.acceleration++;
        }
    }

    public void accelerate(Integer n) {
        for (int i = 0; i < n; i++) 
            this.accelerate();
    }

    public void decelerate() {
        if (this.acceleration > 0) {
            this.acceleration--;
        }
    }

    public Integer getAcceleration() {
        return this.acceleration;
    }

    public void setAcceleration(Integer acceleration) {
        this.acceleration = acceleration;
    }
}
