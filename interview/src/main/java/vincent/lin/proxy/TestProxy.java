package vincent.lin.proxy;

import java.sql.Time;

/**
 * Created by Vincent on 2017/1/11.
 */
public class TestProxy {
    public static void main(String[] args) {
        Car car=new Car();
        TimeProxy timeProxy=new TimeProxy(car);
       // timeProxy.move();
        LogProxy logProxy=new LogProxy(timeProxy);
        logProxy.move();


    }
}
