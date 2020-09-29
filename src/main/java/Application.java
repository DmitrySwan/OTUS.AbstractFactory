public class Application {

    private Sort sort;

    Application(SortAbstractFactory factory) {
        this.sort = factory.createSort();
    }

    int[] sort(int[] array) {
        return sort.sort(array);
    }
}
