package structural_pattern.Decorator;

public class DataSourceDecorator implements DataSource{
    DataSource wrappee;
    public DataSourceDecorator(DataSource source   ){this.wrappee=source;}
    @Override
    public String readData() {
        return this.wrappee.readData();
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }
}
