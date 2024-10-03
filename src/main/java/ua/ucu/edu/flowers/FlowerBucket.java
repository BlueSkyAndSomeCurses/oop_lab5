package ua.ucu.edu.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class FlowerBucket {
    private List<FlowerPack> flowerPacksList;

    public FlowerBucket() {
        this.flowerPacksList = new ArrayList<>();
    }

    public void add(FlowerPack flowerPack) {
        flowerPacksList.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack : flowerPacksList) {
            price += flowerPack.getPrice();
        }
        return price;
    }

}
