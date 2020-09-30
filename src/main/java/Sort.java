public interface Sort {
    int[] sort(int[] array);

    default String sortType() {
        return this.getClass().getName();
    }
}
