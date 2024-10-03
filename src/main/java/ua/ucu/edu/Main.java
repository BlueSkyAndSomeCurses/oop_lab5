package ua.ucu.edu;

import ua.ucu.edu.flowers.Flower;
import ua.ucu.edu.flowers.FlowerColor;
import ua.ucu.edu.flowers.FlowerPack;
import ua.ucu.edu.flowers.FlowerType;

public class Main {
    public static void main(String[] args) {

        Flower flower = new Flower(FlowerType.ROSE, 100, FlowerColor.RED, 400);
        Flower flower2 = new Flower(FlowerType.LILYOFTHEVALLEY, 150, FlowerColor.BLUE, 200);

        FlowerPack flowerPack1 = new FlowerPack(flower, 10);
        FlowerPack flowerPack2 = new FlowerPack(flower, 10);
    }
}