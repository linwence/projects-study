package vincent.lin.all;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by Vincent on 2017/2/8.
 */
public class Demo {
    private int id;
    private String name;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
