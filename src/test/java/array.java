import org.testng.annotations.Test;

import java.util.Arrays;

//数组的相关讨论
public class array {
/*
* 数组的基本操作
1、	创建数组
2、	赋值
3、	添加一个元素
4、	删除一个元素
* */
    public static void createArray() {
        //创建一维数组
        int[] a = {1,2,3};
        int[] b = a;
        System.out.println(Arrays.toString(b));
    }

    /*
    * i为添加的目标位置
    * b为添加的数据
    * 将数据b添加到数组a的第i个位置
    * */
    public static int[] Add(int i,int b,int[] aa){
    int[]  bb= new int[aa.length+1];
    //若i介于第0个和最后一个数据之间，将前i-1个数据复制过来，b数据放在i的位置，i及后面的元素顺移一下
    for(int j=0;j<aa.length;j++){
        if(j<i){
            bb[j] = aa[j];
        }else if(j==i){
            int temp = bb[i];
            bb[j] = b;
        }else{
            bb[j] = aa[j+1];
        }
    }
    return bb;

    }
}
