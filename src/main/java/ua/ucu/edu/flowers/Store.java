package ua.ucu.edu.flowers;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Store {
    private ArrayList<FlowerPack> availablePacks = new ArrayList<>();

    public void addPack(FlowerPack pack) {
        for (FlowerPack iPack : availablePacks) {
            if (iPack.equals(pack)) {
                iPack.setCount(iPack.getCount() + pack.getCount());
                return;
            }

        }
        availablePacks.add(pack);
    }

    public Flower search(Flower searchedFlower) {
        for (FlowerPack iPack : availablePacks) {
            if (iPack.getFlower().equals(searchedFlower)) {
                iPack.setCount(iPack.getCount() - 1);
                if (iPack.getCount() == 0) {
                    availablePacks.remove(iPack);
                }
                return iPack.getFlower();
            }
        }
        return null;
    }

    public FlowerPack search(Flower searchedFlower, int count) {
        FlowerPack searchedPack = new FlowerPack(searchedFlower, 0);

        for (FlowerPack iPack : availablePacks) {
            if (iPack.getFlower().equals(searchedFlower)) {
                if (iPack.getCount() >= count) {
                    iPack.setCount(iPack.getCount() - count);
                    if (iPack.getCount() <= 0) {
                        availablePacks.remove(iPack);
                    }
                    return new FlowerPack(iPack.getFlower(), count);
                }
            }

        }
        return null;
    }

    public FlowerBucket search(FlowerPack... searchedPacks) {
        FlowerBucket bucket = new FlowerBucket();
        for (FlowerPack iPack : searchedPacks) {
            bucket.add(search(iPack.getFlower(), iPack.getCount()));
        }

        return bucket;
    }

    public int getSize() {
        return availablePacks.size();
    }

    public boolean isInside(Flower flower) {
        for (FlowerPack iPack : availablePacks) {
            if (iPack.getFlower().equals(flower)) {
                return true;
            }
        }
        return false;
    }

    public int getNumberOf(Flower flower) {
        for (FlowerPack iPack : availablePacks) {
            if (iPack.getFlower().equals(flower)) {
                return iPack.getCount();
            }
        }
        return 0;

    }
}