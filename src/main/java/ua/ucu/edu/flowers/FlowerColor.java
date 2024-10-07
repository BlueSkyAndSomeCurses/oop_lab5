package ua.ucu.edu.flowers;

public enum FlowerColor {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("0000FF"), YELLOW("00FFFF"), WHITE("#FFFFFF");

    private final String rgb;

    FlowerColor(String rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return rgb;
    }
}
