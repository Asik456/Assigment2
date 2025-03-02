package org.example.Assig2;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ParkingRepository {
    private final Map<String, Car> parkingLot = new HashMap<>();

    public void parkCar(Car car) {
        parkingLot.put(car.getLicensePlate(), car);
        System.out.println("Car parked: " + car);
    }

    public Car findCar(String licensePlate) {
        return parkingLot.getOrDefault(licensePlate, null);
    }
}
