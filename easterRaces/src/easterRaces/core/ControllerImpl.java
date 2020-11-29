package easterRaces.core;

import easterRaces.common.OutputMessages;
import easterRaces.core.interfaces.Controller;
import easterRaces.entities.cars.Car;
import easterRaces.entities.cars.MuscleCar;
import easterRaces.entities.cars.SportsCar;
import easterRaces.entities.drivers.Driver;
import easterRaces.entities.drivers.DriverImpl;
import easterRaces.entities.racers.Race;
import easterRaces.entities.racers.RaceImpl;
import easterRaces.repositories.interfaces.Repository;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static easterRaces.common.ExceptionMessages.*;
import static easterRaces.common.OutputMessages.*;

public class ControllerImpl implements Controller {
    private Repository<Driver> driverRepository;
    private Repository<Car> carRepository;
    private Repository<Race> raceRepository;

    public ControllerImpl(Repository<Driver> driverRepository, Repository<Car> carRepository, Repository<Race> raceRepository) {
        this.driverRepository = driverRepository;
        this.carRepository = carRepository;
        this.raceRepository = raceRepository;
    }

    @Override
    public String createDriver(String driverName) {
        if (driverRepository.getByName(driverName) != null) {
            throw new IllegalArgumentException(String.format(DRIVER_EXISTS, driverName));
        }
        Driver driver = new DriverImpl(driverName);
        this.driverRepository.add(driver);
        return String.format(DRIVER_CREATED, driverName);
    }

    @Override
    public String createCar(String type, String model, int horsePower) {
        Car car = null;

        if (this.carRepository.getByName(model) != null) {
            throw new IllegalArgumentException(String.format(CAR_EXISTS, model));
        }

        if (type.equals("Muscle")) {
            car = new MuscleCar(model, horsePower);
            this.carRepository.add(car);
        } else if (type.equals("Sports")) {
            car = new SportsCar(model, horsePower);
            this.carRepository.add(car);
        }
        if (car == null) {
            return null;
        }
        return String.format(CAR_CREATED, car.getClass().getSimpleName(), model);
    }

    @Override
    public String createRace(String name, int laps) {
        if (this.raceRepository.getByName(name) != null) {
            throw new IllegalArgumentException(String.format(RACE_EXISTS, name));
        }
        Race race = new RaceImpl(name, laps);
        this.raceRepository.add(race);
        return String.format(RACE_CREATED, name);
    }

    @Override
    public String addCarToDriver(String driverName, String carModel) {
        Driver driver = this.driverRepository.getByName(driverName);
        Car car = this.carRepository.getByName(carModel);

        if (driver == null) {
            throw new IllegalArgumentException(String.format(DRIVER_NOT_FOUND, driverName));
        }
        if (car == null) {
            throw new IllegalArgumentException(String.format(CAR_NOT_FOUND, carModel));
        }

        driver.addCar(car);
        return String.format(OutputMessages.CAR_ADDED, driverName, carModel);
    }

    @Override
    public String addDriverToRace(String raceName, String driverName) {
        Race race = this.raceRepository.getByName(raceName);
        Driver driver = this.driverRepository.getByName(driverName);

        if (race == null) {
            throw new IllegalArgumentException(String.format(RACE_NOT_FOUND, raceName));
        }
        if (driver == null) {
            throw new IllegalArgumentException(String.format(DRIVER_NOT_FOUND, driverName));
        }

        race.addDriver(driver);
        return String.format(DRIVER_ADDED, driverName, raceName);
    }

    @Override
    public String startRace(String raceName) {
        if (this.raceRepository.getByName(raceName) == null) {
            throw new IllegalArgumentException(String.format(RACE_NOT_FOUND, raceName));
        }
        if (this.driverRepository.getAll().size() < 3) {
            throw new IllegalArgumentException(String.format(RACE_INVALID, raceName, 3));
        }

        Race race = raceRepository.getByName(raceName);
        final int laps = race.getLaps();
        Collection<Driver> drivers = race.getDrivers();

        List<Driver> collect = drivers.stream()
                .sorted((l, r) -> Double.compare(r.getCar().calculateRacePoints(laps), l.getCar().calculateRacePoints(laps)))
                .collect(Collectors.toList());

//        for (int i = 0; i < 3; i++) {
//            stringBuilder.append(String.format("Driver %s %s %s race.%n"
//                   ,collect.get(i).getName(), EnumPodiumPositions.values()[i].place, raceName));
//        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format(DRIVER_FIRST_POSITION, collect.get(0).getName(), raceName))
                .append(System.lineSeparator())
                .append(String.format(DRIVER_SECOND_POSITION, collect.get(1).getName(), raceName))
                .append(System.lineSeparator())
                .append(String.format(DRIVER_THIRD_POSITION, collect.get(2).getName(), raceName));

        this.raceRepository.remove(race);

        return stringBuilder.toString();
    }
}
