public class StorageBannedBook {
    public static void main(String[] args) {
        Book bannedBook = new Book();
        bannedBook.setTitle("black list");
        StrongBox<Book> box1 = new StrongBox<>(KeyType.PADLOCK);
        box1.put(bannedBook);
        for (int i = 0; i < 1024; i++) {
            Book result = box1.get();
            if (result != null) {
                System.out.println(result.getTitle());
                return;
            }
        }
        System.out.println("It's too Strong.");
        return;
    }
}
