package HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int numberOfDay;
    private Seasons seasons;
    private Discount discount;

    public PriceCalculator(double pricePerDay, int numberOfDays, Seasons seasons, Discount discount){
        this.pricePerDay = pricePerDay;
        this.numberOfDay = numberOfDays;
        this.seasons = seasons;
        this.discount = discount;
    }


    public double calculateHoliday() {
        return this.pricePerDay * this.numberOfDay * this.seasons.getSeason() * ((100 - 1.00 * this.discount.getDiscount()) / 100);
    }
}
