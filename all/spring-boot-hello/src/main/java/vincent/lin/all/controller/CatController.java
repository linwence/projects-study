package vincent.lin.all.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vincent.lin.all.bean.Cat;
import vincent.lin.all.service.CatService;

import javax.annotation.Resource;
import java.util.Iterator;

/**
 * Created by Vincent on 2017/2/9.
 */
@RestController
@RequestMapping("/cat")
public class CatController {
    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public String save() {
        Cat cat = new Cat();
        cat.setCatName("张三");
        catService.save(cat);
        return "save ok";
    }

    @RequestMapping("/delete")
    public String delete() {
        catService.delete(1);
        return "delete ok";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }

    @RequestMapping("/findbycatname")
    public Cat findByCatName(String catName) {
        return catService.findByCatName(catName);
    }

    @RequestMapping("/selectByCatName")
    public Cat selectByCatName(String catName) {
        return catService.selectByCatName(catName);
    }

}
