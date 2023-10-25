package builder;

import builder.Compenents.*;

public interface Builder {

    // build step here

    public void reset();
    public void setTransmission(Transmission transmission);
    public  void setCarType(CarType carType);

    public void setSeats(int seats);
    public void setEngine(Engine engine);
    public void setTripComputer(TripComputer tripComputer);
    public void setGPS(GPS gps);



}
