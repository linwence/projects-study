package vincent.lin.all.repository;

import org.springframework.data.repository.CrudRepository;
import vincent.lin.all.bean.Cat;

/**
 * Created by Vincent on 2017/2/9.
 */
public interface CatRepository extends CrudRepository<Cat,Integer> {
}
