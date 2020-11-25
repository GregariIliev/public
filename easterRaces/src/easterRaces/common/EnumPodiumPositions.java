package easterRaces.common;

public enum  EnumPodiumPositions {
    wins("wins"),
    second("is second in"),
    third("is third in");

    public String place;

    EnumPodiumPositions(String place) {
        this.place = place;
    }
}
