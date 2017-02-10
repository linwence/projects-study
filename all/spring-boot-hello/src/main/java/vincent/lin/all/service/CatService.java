package vincent.lin.all.service;

import org.springframework.stereotype.Service;
import vincent.lin.all.bean.Cat;
import vincent.lin.all.dao.CatDao;
import vincent.lin.all.repository.Cat2Repository;
import vincent.lin.all.repository.CatRepository;

import javax.annotation.Resource;
import java.util.Iterator;

/**
 * Created by Vincent on 2017/2/9.
 */
@Service
public class CatService {
    @Resource
    private CatRepository catRepository;
    @Resource
    private Cat2Repository cat2Repository;
    @Resource
    private CatDao catDao;

    public void save(Cat cat) {
        catRepository.save(cat);
    }

    public void delete(int id) {
        catRepository.delete(id);
    }

    public Iterable<Cat> getAll() {
        return  catRepository.findAll();
    }

    public Cat findByCatName(String catName){
        return cat2Repository.findByCatName(catName);
    }

    public Cat selectByCatName(String catName){
        return catDao.selectByCatName(catName);
    }
}
