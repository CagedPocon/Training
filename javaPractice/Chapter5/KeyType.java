public enum KeyType {
    PADLOCK (1024),
    BUTTON (10000),
    DIAL (30000),
    FINGER (1000000),
    ;
    private KeyType(final int count) {
        this.needCount = count;
    }
    public final int getCount() {
        return this.needCount;
    }
    private final int needCount;
}
