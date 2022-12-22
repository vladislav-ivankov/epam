package task1.classes;

import java.util.StringJoiner;

public class Ball {
    private String colour;
    private double weight;

    public Ball(String color, double weight) {
        this.colour = color;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
         return colour;
    }

    public void setColor(String color) {
        this.colour = color;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ball.class.getSimpleName() + "[", "]")
                .add("color='" + colour + "'")
                .add("weight=" + weight)
                .toString();
    }
}
