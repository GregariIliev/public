public enum DoughEnums {
    WHITE( 1.5),
    WHOLEGRAIN( 1.0),
    CRISPY( 0.9),
    CHEWY( 1.1),
    HOMEMADE( 1.0);

    double modifier;

    DoughEnums(double modifier){
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
