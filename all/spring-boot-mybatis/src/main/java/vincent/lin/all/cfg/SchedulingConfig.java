package vincent.lin.all.cfg;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by Vincent on 2017/2/10.
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
    private int count=0;
    @Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
    public void testScheduling(){
      count++;
        System.out.println("第"+count+"次执行.......");
    }
}
