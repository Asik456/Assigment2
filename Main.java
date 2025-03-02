package org.example.Assig2;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ParkingService regularParking = context.getBean(ParkingService.class);
        regularParking.park(new Car("ABC-123", "regular"));

        ParkingService electricParking = context.getBean("electricService", ParkingService.class);
        electricParking.park(new Car("EV-001", "electric"));

        ParkingLogger logger = context.getBean(ParkingLogger.class);
        logger.log("New car parked.");

        ParkingStatistics statistics = context.getBean(ParkingStatistics.class);
        statistics.showStats();

        context.close();
    }
}

