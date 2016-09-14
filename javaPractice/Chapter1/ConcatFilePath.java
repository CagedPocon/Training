public class ConcatFilePath {

    public static void main(String[] args) {
        String folder = "folder\\";
        String file = "file";

        String s = concatFile(folder, file);
        System.out.println(s);
    }

    public static String concatFile(String folder, String file) {
        if (!folder.endsWith("\\")) {
            folder += "\\";
        }
        return folder + file;
    }
}
