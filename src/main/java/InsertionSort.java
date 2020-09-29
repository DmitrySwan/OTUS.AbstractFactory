import java.util.Arrays;

import static java.lang.System.arraycopy;

public class InsertionSort implements Sort {

    @Override
    public int[] doSort() {
        int[] a1 = new int[]{3,6,11,7,5,1,8};

        int[] a2 = new int[]{8,30,1,2,5,6,12,4};
        int[] a3 = new int[15];
        //return new int[0];

        int i=0, j=0, k=0;
        while(i < a1.length && j < a2.length) {
            System.out.println(i+ " " + j);
            a3[k++] = a1[i] < a2[j] ? a1[i++] : a2[j++];
            System.out.println(k+ " " + j);
        }
        if(i< a1.length) {
            arraycopy(a1, i, a3, k, a1.length - i);
        } else if(j< a2.length) {
            arraycopy(a2, j, a3, k, a2.length - j);
        }
        return a3;
    }

    public int[] doSort(int[] a1, int[] a2) {
        int[] a3 = new int[a1.length+a2.length];
        //return new int[0];

        int i=0, j=0, k=0;
        while(i < a1.length && j < a2.length) {
            System.out.println(i+ " " + j);
            a3[k++] = a1[i] < a2[j] ? a1[i++] : a2[j++];
            System.out.println(k+ " " + j);
        }
        if(i< a1.length) {
            arraycopy(a1, i, a3, k, a1.length - i);
        } else if(j< a2.length) {
            arraycopy(a2, j, a3, k, a2.length - j);
        }
        return a3;
    }

    //test
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        System.out.println(Arrays.toString(insertionSort.split(new int[]{3,4,6,7,3,2,4,54,2,2,5,2,5,4,2,21123,4,5,0,56,8,43,2,1,2,6,6,4, 1, 2, 5})));
    }

    int[] split(int[] i){
        if(i.length == 1) {
            return i;
        }
        int[] myArray1 = Arrays.copyOfRange(i, 0, i.length/2);
        int[] myArray2 = Arrays.copyOfRange(i, i.length/2, i.length);

        int[] myArray11 = split(myArray1);
        int[] myArray12 = split(myArray2);
        return doSort(myArray11, myArray12);
    }
}
