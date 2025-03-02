package org.example.Assig2;

import org.springframework.stereotype.Component;

@Component
public class ParkingLogger {
    public ParkingLogger() {
        System.out.println("ParkingLogger initialized (eager)");
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
