public class Application {

    SortAbstractFactory factory;
    Sort sort;

    Application(SortAbstractFactory factory) {
        this.factory = factory;
    }

    int[] doSort() {
        return sort.doSort();
    }

    void createSort() {
        this.sort = factory.createSort();
    }
}
