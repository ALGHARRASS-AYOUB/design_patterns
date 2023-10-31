package structural_pattern.Bridge;

public class TV implements Device{

    private double volume;
    private boolean on;
    private double channel;

    TV(){
        this.on=false;
        this.channel=1;
        this.volume=30;
    }
    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public boolean enable() {
        return on=true;
    }

    @Override
    public boolean disable() {
        return on=false;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void setVolume(double volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public double getChannel() {
        return channel;
    }

    @Override
    public void setChannel(double channel) {
        this.channel=channel;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }

}
