package vincent.lin.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理
 * Created by Vincent on 2017/1/11.
 */
public class TimeHandler implements InvocationHandler {
    private Object obj;

    public TimeHandler(Object obj) {
        this.obj = obj;

    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("time 开始");
          method.invoke(obj);
        System.out.println("time 结束");
        return  null;
    }
}
