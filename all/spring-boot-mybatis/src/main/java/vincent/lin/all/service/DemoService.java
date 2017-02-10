package vincent.lin.all.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vincent.lin.all.Demo;
import vincent.lin.all.mapper.DemoMapper;

import java.util.List;

/**
 * Created by Vincent on 2017/2/10.
 */
@Service
public class DemoService {
    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> likeName(String name){
        return demoMapper.likeName("张");
    }
}
