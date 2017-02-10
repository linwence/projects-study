package vincent.lin.all.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import vincent.lin.all.bean.Cat;

import javax.annotation.Resource;

/**
 * Created by Vincent on 2017/2/9.
 */
@Repository
public class CatDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Cat selectByCatName(String catName) {
        /**
         * 1.定义一个sql语句
         * 2.定义个rowmapper
         * 3.执行查询方法
         */
        String sql = "select * from cat where cat_name=?";
        RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<Cat>(Cat.class);
        Cat cat = jdbcTemplate.queryForObject(sql, new String[]{catName}, rowMapper);
        return cat;
    }
}
