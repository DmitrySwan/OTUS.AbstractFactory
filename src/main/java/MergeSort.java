import java.util.Arrays;

import static java.lang.System.arraycopy;

public class MergeSort implements Sort {

    @Override
    public int[] sort(int[] array) {
        if (array.length == 1) return array;
        int[] sortedFirst = sort(Arrays.copyOfRange(array, 0, array.length / 2));
        int[] sortedSecond = sort(Arrays.copyOfRange(array, array.length / 2, array.length));
        return doSort(sortedFirst, sortedSecond);
    }

    private int[] doSort(int[] firstArray, int[] secondArray) {
        int[] resultArray = new int[firstArray.length + secondArray.length];

        int i = 0, j = 0, k = 0;
        while (i < firstArray.length && j < secondArray.length) {
            resultArray[k++] = firstArray[i] < secondArray[j] ? firstArray[i++] : secondArray[j++];
        }
        if (i < firstArray.length) {
            arraycopy(firstArray, i, resultArray, k, firstArray.length - i);
        } else if (j < secondArray.length) {
            arraycopy(secondArray, j, resultArray, k, secondArray.length - j);
        }
        return resultArray;
    }
}
