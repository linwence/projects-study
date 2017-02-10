package vincent.lin.all;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * thymeleaf 中模板文件中，标签是需要闭合的，3.0
 * Created by Vincent on 2017/2/9.
 */
@Controller
@RequestMapping("/templates")
public class TemplatesController {
    /**
     * 映射地址是/templates/hello
     *
     * @return
     */
    @RequestMapping("/hello")
    public String hello(Map<String,Object> map) {
        map.put("name","andy");
        return "hello";
    }
}
