import java.time.LocalDateTime;
public class main1 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(+999_999_999,12,31,23,59,59,999_999_999));
        System.out.println(LocalDateTime.of(0,1,1,0,0,0,0));
        System.out.println(LocalDateTime.of(-999_999_999,1,1,0,0,0,0));
    }
}
