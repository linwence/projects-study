package vincent.lin.all.repository;


import org.springframework.data.repository.Repository;
import vincent.lin.all.bean.Cat;

/**
 * Created by Vincent on 2017/2/9.
 */
public interface Cat2Repository extends Repository<Cat,Integer> {
    /**
     * 查询以get|find|read开头，条件的属性用条件关键字连接，条件属性首字母大写
     */
    public Cat findByCatName(String name);
}
