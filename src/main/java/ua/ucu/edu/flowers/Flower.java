package ua.ucu.edu.flowers;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flower {

    private FlowerType type;
    private double sepalLength;
    private FlowerColor color;
    private double price;


    public Flower(Flower flower) {
        type = flower.type;
        sepalLength = flower.sepalLength;
        color = flower.color;
        price = flower.price;
    }

    public String getColor() {
        return color.toString();
    }
}
