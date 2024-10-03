package ua.ucu.edu.flowers;

public enum FlowerType {
    ROSE, CHAMOMILE, LILYOFTHEVALLEY;

    public String toString() {
        return switch (this) {
            case ROSE -> "Rose";
            case CHAMOMILE -> "Chamole";
            case LILYOFTHEVALLEY -> "LilyOfTheValley";
        };
    }
}
