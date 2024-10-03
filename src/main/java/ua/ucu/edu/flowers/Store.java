package ua.ucu.edu.flowers;

import java.util.ArrayList;


public class Store {
    private ArrayList<FlowerPack> availablePacks = new ArrayList<>();

    void addPack(FlowerPack pack) {
        for (FlowerPack iPack : availablePacks) {
            if (iPack.equals(pack)) {
                iPack.setCount(iPack.getCount() + pack.getCount());
                return;
            }


        }
        availablePacks.add(pack);
    }
}
