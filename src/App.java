import java.util.List;

public class App {
    public static void main(String[] args) {
        var numbers = List.of(12, 13, 14, 15);
        System.out.println(numbers.getFirst());
        System.out.println(numbers.getLast());
    }
}
