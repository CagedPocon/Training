public class ConcatFilePath {

    public static void main(String[] args) {
        String concatFile(String folder, String file) {
            if (!folder.endsWith("\\")) {
                folder += "\\";
            }
            return folder + file;
        }
        String folder = "folder\\";
        String file = "file";
        String s = concatFile(folder, file);
        System.out.println(s);
    }


}
