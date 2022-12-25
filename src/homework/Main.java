package homework;

import homework.Drivers.CategoryB;
import homework.Drivers.CategoryC;
import homework.Drivers.CategoryD;
import homework.Transport.Bus;
import homework.Transport.Cars;
import homework.Transport.Tracks;
import homework.Transport.Transport;

public class Main {
    //    public class Car extends Transport implements Park ()   - кар зависит от род-го транспорт и добавляет интерфейс.
//        можно указывать массив String[], но если не знаем длину, можно поставить ... вместо скобок и не нужно писать new Park[]{lada, busq}
//    а просто пишем
    //    (lada, bus1) или (lada, bus1, new Car(lada3))
//    static Bus[] bus = new Bus[4];
//    static Cars[] car = new Cars[4];
//    static Tracks[] track = new Tracks[4];
//    static Category_B[] carDriver = new Category_B[4];
//    static Category_C[] trackDriver = new Category_C[4];
//    static Category_D[] busDriver = new Category_D[4];

    public static void printTransport(Transport<?>... transports) {
//
////        for (Bus bus : bus) {
//            System.out.println(bus);
//            bus.pitStop();
//            bus.bestLapTime();
//            bus.maxSpeed();
//        for (Cars car : car) {
//                System.out.println(car);
//                car.pitStop();
//                car.maxSpeed();
//                car.bestLapTime();
//        for (Tracks track : track) {
//                    System.out.println(track);
//                    track.bestLapTime();
//                    track.pitStop();
//                    track.maxSpeed();
//                }
//            }
//        }
        for (Transport<?> transport : transports) {
            System.out.println(transport.getPitStopTime());
            System.out.println(transport.getMaxVelocity());
            System.out.println(transport.getRoundTime());
            System.out.println("Водитель " + transport.getDriver() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде!");
        }
    }

    public static void main(String[] args) {
        Bus bus1 = new Bus("Reno", "A5", 2.1, 70, 34, 120);
        Bus bus2 = new Bus("Reno", "Logan", 3.7, 68, 37, 115);
        Bus bus3 = new Bus("Reno", "F4", 4.5, 75, 45, 105);
        Bus bus4 = new Bus("Reno", "A6", 7.2, 60, 10, 132);
        Cars car1 = new Cars("Lada", "Granta", 3.4, 47, 34, 180);
        Cars car2 = new Cars("Lada", "Vesta1", 4.4, 55, 24, 150);
        Cars car3 = new Cars("Lada", "X-Ray", 5.4, 50, 36, 120);
        Cars car4 = new Cars("Lada", "Vesta2", 6.4, 52, 32, 115);
        Tracks track1 = new Tracks("Kia", "A1", 10.1, 63, 27, 137);
        Tracks track2 = new Tracks("Kia", "A1", 11.1, 65, 45, 140);
        Tracks track3 = new Tracks("Kia", "A1", 12.1, 63, 24, 150);
        Tracks track4 = new Tracks("Kia", "A1", 13.1, 58, 13, 160);
        CategoryB carDriver1 = new CategoryB(1, "Ivan Ivanovich", true);
        CategoryB carDriver2 = new CategoryB(2, "Ivan Petrovich", true);
        CategoryB carDriver3 = new CategoryB(3, "Ivan Kuzmichov", true);
        CategoryB carDriver4 = new CategoryB(4, "Ivan Sergeevich", true);
        CategoryC trackDriver1 = new CategoryC(5, "Kuzma Petrovich", true);
        CategoryC trackDriver2 = new CategoryC(6, "Kuzma Kuzmich", true);
        CategoryC trackDriver3 = new CategoryC(7, "Kuzma Gregorevich", true);
        CategoryC trackDriver4 = new CategoryC(8, "Kuzma Mihailovich", true);
        CategoryD busDriver1 = new CategoryD(9, "Sergey Ivanovich", true);
        CategoryD busDriver2 = new CategoryD(10, "Sergey Petrovich", true);
        CategoryD busDriver3 = new CategoryD(11, "Sergey Gregorevich", true);
        CategoryD busDriver4 = new CategoryD(12, "Sergey Mihailovich", true);
        car1.setDriver(carDriver1);
        car2.setDriver(carDriver2);
        car3.setDriver(carDriver3);
        car4.setDriver(carDriver4);
        bus1.setDriver(busDriver1);
        bus2.setDriver(busDriver2);
        bus3.setDriver(busDriver3);
        bus4.setDriver(busDriver4);
        track1.setDriver(trackDriver1);
        track2.setDriver(trackDriver2);
        track3.setDriver(trackDriver3);
        track4.setDriver(trackDriver4);
        printTransport(car1, track2, bus3);

    }
}
