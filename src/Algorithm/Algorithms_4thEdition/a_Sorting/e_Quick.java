package Algorithm.Algorithms_4thEdition.a_Sorting;

import Standard.Std;
import Standard.StdOut;

/**
 * Created by nibnait on 2016/8/9.
 */
public class e_Quick {
    public static void main(String[] args) {
//        int[] a = new int[10];
//        a = StdRandom.random(a);
//        int[] a = {3,4,0,1,6,2,5,1};
        int[] a = {3,5,1,4,2};
        StdOut.print(a);

        a = Quick_Sort(a, 0, a.length-1);
        StdOut.print(a);
    }

    /**
     *
     */
    public static int[] Quick_Sort(int[] a, int lo, int hi) {

        if (lo>=hi)
            return a;
        int j = partition(a, lo, hi);
        StdOut.print(a);
        Quick_Sort(a, lo, j-1);
        Quick_Sort(a, j+1, hi);
        return a;
    }

    private static int partition(int[] a, int lo, int hi) {
        if (a==null || a.length<=0 || lo<0 || hi>=a.length){
            throw new RuntimeException("输入有误");
        }
        int flag = lo;
        for (int i = lo; i < hi; i++) {
            if (a[i] < a[hi]){      //以a[hi]为基准
                Std.swap(a, i, flag++);
            }
        }
        Std.swap(a,flag,hi);

//        int flag = lo+1;    //以a[lo]为基准
//        for (int i = lo+1; i <= hi; i++) {
//            if (a[i]<a[lo]) {
//                Std.swap(a,i,flag++);
//            }
//        }
//        Std.swap(a,--flag,lo);
        return flag;
    }
}