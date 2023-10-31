package structural_pattern.Bridge;

public interface Device {
    public  boolean isEnabled();
    public boolean enable();
    public boolean disable();
    public double getVolume();

    public void setVolume(double volume);
    public double getChannel();
    public void setChannel(double channel);
    public void printStatus();
}
