package vincent.lin.all;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Vincent on 2017/2/8.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
    @RequestMapping("/hello2")
    public String hello2() {
        return "Hello World2";
    }

    @RequestMapping("/getDemo")
    public Demo getDemo() {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("张三1");
        demo.setCreateTime(new Date());
        return demo;
    }
}
