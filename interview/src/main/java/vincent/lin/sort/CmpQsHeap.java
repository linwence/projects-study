package vincent.lin.sort;

import java.util.Random;

/**
 * Created by Vincent on 2017/1/19.
 */
public class CmpQsHeap {
    public static void main(String[] args) {
       // int[] ary = genArray(3);
        int[] ary =new int[] {3,5,7,1,4,2,8,6,9};
        Qs(ary, 0, ary.length - 1);

    }

    public static int[] genArray(int i) {
        int[] ints = new int[i];
        Random random = new Random();
        for (int j = 0; j < i; j++) {
            ints[j] = random.nextInt(10);
        }
        return ints;
    }

    public static void Qs(int[] R, int low, int high) {
        if (low < high) {
            int p = Partition(R, low, high);
            Qs(R, low, p - 1);
            Qs(R, p + 1, high);
        }
    }

    public static int Partition(int[] R, int low, int high) {
        int pa = R[low];
        while (low < high) {
            while (low < high && R[high] >= pa) --high;
            R[low] = R[high];
            while (low < high && R[low] <= pa) ++low;
            R[high] = R[low];
        }
        R[low] = pa;
        return low;
    }
}
