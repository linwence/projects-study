package vincent.lin.all.mapper;

import org.apache.ibatis.annotations.Select;
import vincent.lin.all.Demo;

import java.util.List;

/**
 * Created by Vincent on 2017/2/9.
 */
public interface DemoMapper {
    @Select("select * from demo where name=#{name}")
    public List<Demo> likeName(String name);

    @Select("select * from demo where id=#{id}")
    public Demo getById(long id);

    @Select("select name from demo where id=#{id}")
    public String getNameById(long id);
}
