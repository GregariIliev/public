package easterRaces.repositories;

import easterRaces.entities.drivers.Driver;
import easterRaces.entities.racers.Race;
import easterRaces.repositories.interfaces.Repository;

import java.util.*;

public class DriverRepository implements Repository<Driver> {
    private Set<Driver> models;

    public DriverRepository() {
        this.models = new HashSet<>();
    }

    @Override
    public Driver getByName(String name) {
        for (Driver model : models) {
            if (model.getName().equals(name)){
                return model;
            }
        }
        return null;
    }

    @Override
    public Collection<Driver> getAll() {
        return Collections.unmodifiableCollection(this.models);
    }

    @Override
    public void add(Driver model) {
        this.models.add(model);
    }

    @Override
    public boolean remove(Driver model) {
        return this.models.remove(model);
    }
}
