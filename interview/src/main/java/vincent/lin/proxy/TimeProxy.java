package vincent.lin.proxy;

/**
 * Created by Vincent on 2017/1/11.
 */
public class TimeProxy implements Moveable {
    private Moveable m;

    public TimeProxy(Moveable m) {
        this.m = m;
    }

    public void move() {
        System.out.println("time 开始....");
        m.move();
        System.out.println("time 结束....");
    }
}
