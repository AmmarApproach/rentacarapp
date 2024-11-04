package org.approach.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.approach.model.Car;

@ApplicationScoped
public class CarRepository implements PanacheRepository <Car> {

    public Car findByModel(String model) {
        return find("model = '" + model + "'").firstResult();
    }
}
