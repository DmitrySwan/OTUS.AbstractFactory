public class InsertionSortFactory implements SortAbstractFactory {

    @Override
    public Sort createSort() {
        return new InsertionSort();
    }
}
