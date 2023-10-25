package builder;

import builder.Compenents.*;

public class CarBuilder implements Builder{

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPS gpsNavigator;

    @Override
    public void reset() {

    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission=transmission;
    }

    @Override
    public void setCarType(CarType carType) {
        this.type=carType;
    }


    @Override
    public void setSeats(int seats) {
        this.seats=seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine=engine;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer=tripComputer;
    }

    @Override
    public void setGPS(GPS gps) {
        this.gpsNavigator=gps;
    }

    public Car   getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
