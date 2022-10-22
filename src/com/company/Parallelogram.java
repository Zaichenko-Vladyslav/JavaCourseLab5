/*
 *
 * Classname: Parallelogram
 *
 * 04 June 2020
 *
 * Copyright Zaichenko Vladyslav KNUTE
 *
 * Module 2 task 1
 *
 * Create a class from the attached document according
 * to the order in your group. The class must contain
 *
 * 1. Constructor.
 * 2. Getters/Setters.
 * 3. 5 methods.
 * 4. Override toString() method
 * 5. Override hash() and equals() methods.
 *
 */

package com.company;

import java.util.Objects;

public class Parallelogram {

    private int bigSide;
    private int smallSide;
    private double angle;

    // 1. Constructor.

    public Parallelogram() {

    }

    public Parallelogram(int bigSide, int smallSide, double angle) {
        this.bigSide = bigSide;
        this.smallSide = smallSide;
        this.angle = angle;
    }

    // 2. Getters/Setters.

    public int getBigSide() {
        return bigSide;
    }

    public void setBigSide(int bigSide) {
        this.bigSide = bigSide;
    }

    public int getSmallSide() {
        return smallSide;
    }

    public void setSmallSide(int smallSide) {
        this.smallSide = smallSide;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    // 3. 5 methods.

    // Method for finding the perimeter

    public double getPerimeter() {
        return 2 * this.getBigSide() + 2 * this.getSmallSide();
    }

    // Method for finding the Longest Diagonal

    public double getLongDiagonal() {
        return Math.sqrt(this.getBigSide() * this.getBigSide() +
                this.getSmallSide() * this.getSmallSide() + 2 *
                this.getBigSide() * this.getSmallSide() *
                Math.cos(this.getAngle()));
    }

    // Method for finding the Shortest Diagonal

    public double getShortDiagonal() {
        return Math.sqrt(this.getBigSide() * this.getBigSide() +
                this.getSmallSide() * this.getSmallSide() - 2 *
                this.getBigSide() * this.getSmallSide() *
                Math.cos(this.getAngle()));
    }

    // Method for checking if parallelogram is a rhombus

    public boolean isRhombus() {

        boolean result = true;

        if (this.getBigSide() == this.getSmallSide()) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    // Method for checking if parallelogram is a rectangle

    public boolean isRectangle() {

        boolean result = true;

        if (this.getBigSide() == this.getSmallSide() &&
                this.getAngle() == Math.PI * 0.5) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    // 4. Override toString() method

    @Override
    public String toString() {
        return "Parallelogram: " +
                "\n" +
                "\nBig Side = " + bigSide +
                "\nSmall Side = " + smallSide +
                "\nAngle = " + angle +
                "\n" +
                "\nPerimeter = " + this.getPerimeter() +
                "\nLong Diagonal = " + this.getLongDiagonal() +
                "\nShort Diagonal = " + this.getShortDiagonal() +
                "\nThis is Rectangle? - " + this.isRectangle() +
                "\nThis is Rhombus? - " + this.isRhombus() +
                "\n";
    }

    // 5. Override hash() and equals() methods.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelogram that = (Parallelogram) o;
        return getBigSide() == that.getBigSide() &&
                getSmallSide() == that.getSmallSide() &&
                Double.compare(that.getAngle(), getAngle()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBigSide(), getSmallSide(), getAngle());
    }
}

