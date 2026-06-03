import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {


        List<Integer> sayilar = List.of(1, 2, 3, 4, 5, 6);

        int toplam = sayilar.stream()
                .filter( sayi -> sayi % 2 == 0)
                .map(sayi -> sayi * sayi)
                .reduce(0, (a,b) -> a + b);

                System.out.println(toplam);



    }
}