package vincent.lin.all.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 1.新建一个Class，取名为GlobalDefaultExceptionHandler
 * 2.class添加注解@ControllerAdvice
 * 3.在class添加方法
 * 4.在方法增加@ExceptionHandler拦截相应的信息
 * 5.如果返回的是view，方法返回值是ModelAndView
 * 6.如果返回的是String或者是Json数据，那么需要在方法上添加@ResponseBody
 * Created by Vincent on 2017/2/9.
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String defaultExceptionHanler(HttpServletRequest req, Exception e) {

        return "对不起，服务器繁忙，请稍后再试";
    }
}
