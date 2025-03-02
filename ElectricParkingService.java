package org.example.Assig2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("electricService")
public class ElectricParkingService implements ParkingService {
    private final ParkingRepository repository;

    @Autowired
    public ElectricParkingService(ParkingRepository repository) {
        this.repository = repository;
    }

    @Override
    public void park(Car car) {
        if (!"electric".equals(car.getType())) {
            System.out.println("This service only parks electric cars.");
            return;
        }
        repository.parkCar(car);
    }
}
