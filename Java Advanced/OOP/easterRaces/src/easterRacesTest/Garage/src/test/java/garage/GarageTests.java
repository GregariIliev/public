package garage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class GarageTests {
    //TODO: Test Garage class

    private Garage garage;
    private Car car;

    @Before
    public void createGarageAndCar(){
        this.garage = new Garage();
        this.car = new Car("BMW", 300, 230000);
    }


    @Test
    public void testCreateGarageAndGetCount(){
        Assert.assertEquals(garage.getCount(), 0);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void testGetUnmodifiableListOfCarsThrowException(){
        List<Car> cars = garage.getCars();
        cars.add(this.car);
    }

    @Test
    public void testAddCar(){
        this.garage.addCar(this.car);
        Assert.assertEquals(this.garage.getCount(), 1);
    }
    @Test (expected = IllegalArgumentException.class)
    public void testAddNullCar(){
        this.garage.addCar(null);
    }

    @Test
    public void testFindAllCarsByBrand(){
        this.garage.addCar(this.car);
        this.garage.addCar(new Car("Audi", 200, 20000));
        List<Car> audi = this.garage.findAllCarsByBrand("Audi");
        Assert.assertEquals(audi.get(0).getBrand(), "Audi");
    }

    @Test
    public void testGetTheMostExpensiveCar(){
        this.garage.addCar(this.car);
        this.garage.addCar(new Car("Audi", 300, 1000000));
        Car theMostExpensiveCar = this.garage.getTheMostExpensiveCar();
        Assert.assertEquals(theMostExpensiveCar.getPrice(), 1000000, 0);
    }

    @Test
    public void testFindAllCarsWithMaxSpeedAbove(){
        this.garage.addCar(this.car);
        this.garage.addCar(new Car("Audi", 1000, 150000));
        List<Car> allCarsWithMaxSpeedAbove = this.garage.findAllCarsWithMaxSpeedAbove(400);
        Assert.assertEquals(allCarsWithMaxSpeedAbove.size(), 1);
    }
}