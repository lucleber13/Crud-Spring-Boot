package com.cbcode.crudspring.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "model", nullable = false, length = 20)
    private String model;
    @Column(name = "color", nullable = false, length = 20)
    private String color;
    @Column(name = "regNumber", nullable = false, length = 10)
    private String regNumber;
    @Column(name = "keysNumber", nullable = false, length = 5)
    private int keysNumber;

    public Car() {
    }

    public Car(String model, String color, String regNumber, int keysNumber) {
        this.model = model;
        this.color = color;
        this.regNumber = regNumber;
        this.keysNumber = keysNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getKeysNumber() {
        return keysNumber;
    }

    public void setKeysNumber(int keysNumber) {
        this.keysNumber = keysNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getId() == car.getId() && getKeysNumber() == car.getKeysNumber() && getModel().equals(car.getModel()) && getColor().equals(car.getColor()) && getRegNumber().equals(car.getRegNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getModel(), getColor(), getRegNumber(), getKeysNumber());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", keysNumber=" + keysNumber +
                '}';
    }
}
