package vincent.lin.proxy;

/**
 * Created by Vincent on 2017/1/11.
 */
public class LogProxy implements Moveable {
    private Moveable m;
    public LogProxy(Moveable m){
        this.m=m;
    }

    public void move() {
        System.out.println("日志开始....");
        m.move();
        System.out.println("日志结束....");
    }
}
