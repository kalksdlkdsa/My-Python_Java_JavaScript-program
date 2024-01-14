import newpackages.javapack;
import java.time.LocalDateTime;
public class MyJavafile {
    public static void main(String[] args) {
        javapack.print(LocalDateTime.now());
        javapack.print(LocalDateTime.of(+999_999_999,12,31,23,59,59,999_999_999));
        javapack.print(LocalDateTime.of(0,1,1,0,0,0,0));
        javapack.print(LocalDateTime.of(-999_999_999,1,1,0,0,0,0));
    }
}