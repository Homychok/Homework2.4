package homework;

import java.util.Arrays;

public class Main {
    //    public class Car extends Transport implements Park ()   - кар зависит от род-го транспорт и добавляет интерфейс.
//        можно указывать массив String[], но если не знаем длину, можно поставить ... вместо скобок и не нужно писать new Park[]{lada, busq}
//    а просто пишем
//    (lada, bus1) или (lada, bus1, new Car(lada3))
    static Bus[] bus = new Bus[4];
    static Cars[] car = new Cars[4];
    static Tracks[] track = new Tracks[4];

    public static void printTransport() {
        for (Bus bus : bus) {
            System.out.println(bus);
            bus.pitStop();
            bus.bestLapTime();
            bus.maxSpeed();
            for (Cars car : car) {
                System.out.println(car);
                car.pitStop();
                car.maxSpeed();
                car.bestLapTime();
                for (Tracks track : track) {
                    System.out.println(track);
                    track.bestLapTime();
                    track.pitStop();
                    track.maxSpeed();
                }
            }
        }
    }

    public static void main(String[] args) {
        bus[0] = new Bus("Reno", "A5", 2.1, 70, 34, 120);
        bus[1] = new Bus("Reno", "Logan", 3.7, 68, 37, 115);
        bus[2] = new Bus("Reno", "F4", 4.5, 75, 45, 105);
        bus[3] = new Bus("Reno", "A6", 7.2, 60, 10, 132);
        car[0] = new Cars("Lada", "Granta", 3.4, 47, 34, 180);
        car[1] = new Cars("Lada", "Vesta1", 4.4, 55, 24, 150);
        car[2] = new Cars("Lada", "X-Ray", 5.4, 50, 36, 120);
        car[3] = new Cars("Lada", "Vesta2", 6.4, 52, 32, 115);
        track[0] = new Tracks("Kia", "A1", 10.1, 63, 27, 137);
        track[1] = new Tracks("Kia", "A1", 11.1, 65, 45, 140);
        track[2] = new Tracks("Kia", "A1", 12.1, 63, 24, 150);
        track[3] = new Tracks("Kia", "A1", 13.1, 58, 13, 160);
//    bus1.pitStop();
//    bus2.pitStop();
//    bus3.pitStop();
//    bus4.pitStop();
//    bus1.bestLapTime();
//    bus2.bestLapTime();
//    bus3.bestLapTime();
//    bus4.bestLapTime();
//    bus1.maxSpeed();
//    bus2.maxSpeed();
//    bus3.maxSpeed();
//    bus4.maxSpeed();
//    car1.pitStop();
//    car2.pitStop();
//    car3.pitStop();
//    car4.pitStop();
//    car1.bestLapTime();
//    car2.bestLapTime();
//    car3.bestLapTime();
//    car4.bestLapTime();
//    car1.maxSpeed();
//    car2.maxSpeed();
//    car3.maxSpeed();
//    car4.maxSpeed();
//    track1.pitStop();
//    track2.pitStop();
//    track3.pitStop();
//    track4.pitStop();
//    track1.bestLapTime();
//    track2.bestLapTime();
//    track3.bestLapTime();
//    track4.bestLapTime();
//    track1.maxSpeed();
//    track2.maxSpeed();
//    track3.maxSpeed();
//    track4.maxSpeed();
    printTransport();
    }

}
