import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Employee alex = new Employee("Alex", 12, 21314);
        Employee tanirbergen = new Employee("Tanirbergen", 123, 12313);
        Employee zhanibek = new Employee("Zhanibek", 1, 14324);
        Employee kolya = new Employee("Kolya", 33, 4343434);
        Employee madina = new Employee("Madina", 43, 54454545);
        Employee zaman = new Employee("Zaman", 12, 123213);

        List<Employee> list = new ArrayList<>();
        list.add(alex);
        list.add(tanirbergen);
        list.add(zhanibek);
        list.add(kolya);
        list.add(madina);
        list.add(zaman);

        Collections.sort(list);
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        int binaryValue = Collections.binarySearch(list, tanirbergen);
        System.out.println(binaryValue);
    }
}
