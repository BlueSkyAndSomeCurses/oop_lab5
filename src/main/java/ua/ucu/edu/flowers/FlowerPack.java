package ua.ucu.edu.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlowerPack {
    private Flower flower;
    private int count;

    public FlowerPack(Flower flower, int count) {
        this.flower = new Flower(flower);
        this.count = count;

    }

    public boolean equals(FlowerPack flowerPack) {
        return flower.equals(flowerPack.getFlower());
    }

    double getPrice() {
        return flower.getPrice() * count;
    }

}
