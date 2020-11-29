package easterRaces.repositories;

import easterRaces.entities.racers.Race;
import easterRaces.repositories.interfaces.Repository;

import java.util.*;

public class RaceRepository implements Repository<Race> {
    private Set<Race> models;

    public RaceRepository() {
        this.models = new HashSet<>();
    }

    @Override
    public Race getByName(String name) {
        for (Race model : models) {
            if (model.getName().equals(name)){
                return model;
            }
        }
        return null;
    }

    @Override
    public Collection<Race> getAll() {
        return Collections.unmodifiableCollection(this.models);
    }

    @Override
    public void add(Race model) {
        this.models.add(model);
    }

    @Override
    public boolean remove(Race model) {
        return this.models.remove(model);
    }
}
