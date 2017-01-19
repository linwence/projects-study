package vincent.lin.cglibproxy;

/**
 * Created by Vincent on 2017/1/11.
 */
public class TestCglibProxy {
    public static void main(String[] args) {
        TrainCglibProxy trainCglibProxy = new TrainCglibProxy();
        Train train = (Train) trainCglibProxy.getProxy(Train.class);
        train.move();
    }
}
