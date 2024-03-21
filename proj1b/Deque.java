public interface Deque<T> {
    void addFirst(T item);
    void addLast(T item);
    T removeFirst();
    T removeLast();
    T get(int index);
    void printDeque();
    int size();

    default boolean isEmpty() {
        return size() == 0;
    }
}
