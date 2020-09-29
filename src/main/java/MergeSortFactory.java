public class MergeSortFactory implements SortAbstractFactory {
    @Override
    public Sort createSort() {
        return new MergeSort();
    }
}
