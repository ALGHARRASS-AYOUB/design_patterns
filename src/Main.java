import abstract_factory.DemoAbstractFactory;
import builder.DemoBuilder;
import factory_method.DemoFactoryMethod;
import prototype.DemoPrototype;

public class Main {
    public static void main(String[] args) {
        DemoFactoryMethod factory_method_demoFactoryMethod =new DemoFactoryMethod();
        DemoAbstractFactory abstract_factory=new DemoAbstractFactory();
        DemoBuilder builder_pattern=new DemoBuilder();
        DemoPrototype prototype=new DemoPrototype();

//        factory_method_demo.testFactoryMethod();
//        abstract_factory.testAbstractFactory();
//            builder_pattern.testBuilder();
            prototype.testDemoPrototype();



    }
}