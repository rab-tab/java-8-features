import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        intList.add(1);
        intList.add(90);
        intList.add(51);

        Stream stream=intList.stream().filter(i-> i % 2 == 0);
        stream.forEach(i->System.out.println(i));

        intList.stream().filter(i-> i%2==0).forEach(i->System.out.println(i) );

    }
}
