public class Main {
    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     * @param args
     */
    private static Application configureApplication(String[] args) {
    Application app;
    SortAbstractFactory factory;
    if () {
        factory = new InsertionSortFactory();
        app = new Application(factory);
    } else if () {
        factory = new MergeSortFactory();
        app = new Application(factory);
    }
    else {
        factory = new SelectionSortFactory();
        app = new Application(factory);
    }
    return app;
}

    public static void main(String[] args) {
        Application app = configureApplication(args);
        app.sort();
    }
}
