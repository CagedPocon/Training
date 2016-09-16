public class FuncList {
    private int border;
    public static boolean isOdd(int x) {return (x % 2 == 1);}
    public String addNamePrefix(boolean male, String name) {
        if (male) {return "Mr." + name;}
        else {return "Ms." + name;}
    }
    public boolean divideGrade(int x) {
        if (x > border) {return true;}
        return false;
    }
    public FuncList(int border) {
        this.border = border;
    }


    public static void main(String[] args) {
        FuncList funclist = new FuncList(80);
        Func1 isOddFunc = FuncList::isOdd;
        Func2 addNamePrefixFunc = funclist::addNamePrefix;

        Func1 isOddLamda = (int x) -> {return (x % 2 == 1);};
        Func2 addNameSuffixLamda = (boolean male, String name) -> {
            if (male) {return name + "Ç≠ÇÒ";}
            else {return name + "Ç≥ÇÒ";}
        };
        Func1 divideGradeFunc = funclist::divideGrade;

        System.out.println(isOddFunc.call(17));
        System.out.println(addNameSuffixLamda.call(true, "éRìc"));
        System.out.println(divideGradeFunc.call(30) ? "çáäi" : "ïsçáäi");

        System.out.println(isOddLamda.call(28));
        System.out.println(addNameSuffixLamda.call(false, "è¨ó—"));
        System.out.println(divideGradeFunc.call(90) ? "çáäi" : "ïsçáäi");
    }
}
