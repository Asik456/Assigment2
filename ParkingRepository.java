package org.example.Assig2;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public List<Car> getAllParkedCars() {
        return parkingLot.values().stream().collect(Collectors.toList());
    }

}
