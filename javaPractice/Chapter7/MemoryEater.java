public class MemoryEater {
    public static void main(String[] args) {
        System.out.println("Eating");
        long[] longArray = new long[128000];
        for (int i = 0; i < longArray.length; i++) {
            longArray[i] = 0;
        }
    }
}
