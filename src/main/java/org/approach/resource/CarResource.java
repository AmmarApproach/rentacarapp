package org.approach.resource;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.approach.model.Car;
import org.approach.repository.CarRepository;

import java.util.List;

@Path("/cars")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarResource {

    @Inject
    CarRepository carRepository;


    @GET
    public List<Car> getALLCars() {
        return this.carRepository.listAll();
    }

    @POST
    @Transactional
    public Car addCar(Car car) {
        this.carRepository.persist(car);
        return car;
    }

    @GET
    @Path("/{model}")
    public Car getCarByModel(@PathParam("model") String model) {
        return this.carRepository.findByModel(model);
    }
}
