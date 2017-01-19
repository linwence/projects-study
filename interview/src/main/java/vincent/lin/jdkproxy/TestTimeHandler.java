package vincent.lin.jdkproxy;

import vincent.lin.proxy.Car;
import vincent.lin.proxy.Moveable;

import java.lang.reflect.Proxy;

/**
 * Created by Vincent on 2017/1/11.
 */
public class TestTimeHandler {
    public static void main(String[] args) {
        Car car = new Car();
        TimeHandler timeHandler = new TimeHandler(car);
        Moveable m = (Moveable) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), timeHandler);
        m.move();
    }
}
