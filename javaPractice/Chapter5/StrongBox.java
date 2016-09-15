public class StrongBox<E> {
    public final KeyType keyType;
    private E content;
    public int count;

    public StrongBox(KeyType key) {
        this.keyType = key;
    }
    public final void put(E _content) {
        this.content = _content;
    }
    public final E get() {
        this.count++;
        if (this.count < keyType.getCount()) {
            return null;
        }
        return this.content;
    }
}
