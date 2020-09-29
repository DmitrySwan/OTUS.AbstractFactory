public class SelectionSortFactory implements SortAbstractFactory {

    @Override
    public Sort createSort() {
        return new SelectionSort();
    }
}
