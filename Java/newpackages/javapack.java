package newpackages;
public class javapack {
    public static void print(Object... args) {
        for (Object arg: args) {
            System.out.println(arg);
        }
    }
}