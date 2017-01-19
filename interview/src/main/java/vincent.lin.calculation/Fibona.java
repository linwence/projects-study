package vincent.lin.calculation;

/**
 * Created by Vincent on 2017/1/5.
 */
public class Fibona {
    private long cal(long parm){
        if(parm==0||parm==1){
            return parm;
        }
        return cal(parm-2)+cal(parm-1);
    }

    public static void main(String[] args){
        Fibona fibona=new Fibona();
        long ret=fibona.cal(3);
        System.out.println("......ret......."+ret);
    }
}
