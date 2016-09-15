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
        switch (this.keyType) {
            case PADLOCK:
                if (this.count < 1024) {
                    return null;
                }
                break;
            case BUTTON:
                if (this.count < 100000) {
                    return null;
                }
                break;
            case DIAL:
                if (this.count < 300000) {
                    return null;
                }
                break;
            case FINGER:
                if (this.count < 1000000) {
                    return null;
                }
                break;
        }
        return this.content;
    }
}
