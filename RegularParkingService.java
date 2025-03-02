package org.example.Assig2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class RegularParkingService implements ParkingService {
    private final ParkingRepository repository;

    @Autowired
    public RegularParkingService(ParkingRepository repository) {
        this.repository = repository;
    }

    @Override
    public void park(Car car) {
        if (!"regular".equals(car.getType())) {
            System.out.println("This service only parks regular cars.");
            return;
        }
        repository.parkCar(car);
    }
}
