public class FuncList {
    public static boolean isOdd(int x) {return (x % 2 == 1);}
    public String addNamePrefix(boolean male, String name) {
        if (male == true) {return "Mr." + name;}
        else {return "Ms." + name;}
    }

    public static void main(String[] args) {
        Func1 isOddFunc = FuncList::isOdd;
        Func2 addNamePrefixFunc = new FuncList()::addNamePrefix;

        Func1 isOddLamda = (int x) -> {return (x % 2 == 1);};
        Func2 addNamePrefixLamda = (boolean male, String name) -> {
            if (male == true) {return "Mr." + name;}
            else {return "Ms." + name;}
        };
        System.out.println(isOddFunc.call(17));
        System.out.println(addNamePrefixFunc.call(true, "johnson"));

        System.out.println(isOddLamda.call(28));
        System.out.println(addNamePrefixLamda.call(false, "Jane"));
    }
}
