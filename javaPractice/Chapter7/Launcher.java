import java.lang.reflect.*;
public class Launcher {
    private static void launchExternal(Class<?> cinfo)
    throws Exception {
        ProcessBuilder pb = new ProcessBuilder(
            "java", cinfo.getName()
        );
        Process proc = pb.start();
    }
    private static void launchInternal(Class<?> cinfo)
    throws Exception {
        Method mainMethod = cinfo.getDeclaredMethod("main", String[].class);
        String[] args = {};
        mainMethod.invoke(null, (Object)args);
    }
    private static void launchExternalSub(Class<?> cinfo)
    throws Exception {
        Method subMethod = cinfo.getDeclaredMethod("sub", String[].class);
        String[] args = {};
        Object subInstance = cinfo.newInstance();
        subMethod.invoke(subInstance, (Object)args);
    }

    public static void main(String[] args) {
        final String fqcn = args[0];
        final String launchCode = args[1];
        System.out.println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory() + " bytes");
        try {
            Class<?> cinfo = Class.forName(fqcn);
            Method[] methods = cinfo.getDeclaredMethods();
            for (Method method: methods) {
                System.out.println(method.getName());
            }
            if (launchCode.equals("E")) {
                launchExternal(cinfo);
            } else if (launchCode.equals("I")) {
                launchInternal(cinfo);
            } else if (launchCode.equals("S")) {
                launchExternalSub(cinfo);
            } else {
                throw new Exception("起動コードはEまたはIで指定してください");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024 + "MB");
    }
}
