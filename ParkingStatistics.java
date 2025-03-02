package org.example.Assig2;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class ParkingStatistics {
    public ParkingStatistics() {
        System.out.println("ParkingStatistics initialized (lazy)");
    }

    public void showStats() {
        System.out.println("Showing parking statistics...");
    }
}
