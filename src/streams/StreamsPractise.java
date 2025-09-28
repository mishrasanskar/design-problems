package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsPractise {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "abc", "ayr", "b", "c", "d", "e", "f");

        List<String> upper = list.stream().map(String::toUpperCase).toList();

        System.out.println(upper);

        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10, 11, 12, 13,1,2,3,4);


        List<Integer> ans = list2.stream().filter((x) -> x%2 == 0).toList();
        System.out.println(ans);


        Optional<Integer> ans2 = list2.stream().filter((x) -> x>15).findFirst();

        if(ans2.isPresent()){
            System.out.println(ans2.get());
        }
        else{
            System.out.println("no element satisfy condition");
        }

        long ans3 = list.stream().filter((x) -> x.startsWith("a")).count();

        System.out.println(ans3);

        List<Integer> ans4 = list2.stream().sorted((a,b)->b-a).toList();
        System.out.println(ans4);

        int maxNumber = list2.stream().max((a,b)->a-b).get();
        System.out.println(maxNumber);

        List<Integer> distict = list2.stream().distinct().sorted().toList();

        System.out.println(distict);

        int sum = list2.stream().filter(x->x%2==1).map(x->x*x).reduce(0, Integer::sum);

        System.out.println(sum);

        List<String> words = Arrays.asList("bahvd", "kjhdjkh", "jhdjkh");

        String s = words.stream().collect(Collectors.joining(", "));
        System.out.println(s);


        List<Integer> salaries = Arrays.asList(3000, 5000, 2000, 8000, 7000);

        List<Integer> ans5 = salaries.stream().sorted((a,b)->b-a).limit(3).toList();
        System.out.println(ans5);

        class Employee {
            String name;
            int salary;
            Employee(String n, int s) { name = n; salary = s; }
            public String toString() { return name + ":" + salary; }
        }

        List<Employee> emps = Arrays.asList(
                new Employee("A", 3000),
                new Employee("B", 2000),
                new Employee("C", 5000)
        );


        List<Employee> ans6 = emps.stream().sorted((a,b)->b.salary-a.salary).toList();
        System.out.println(ans6);


        Set<Integer> ans7 = list2.stream().filter(x-> Collections.frequency(list2, x) > 1).collect(Collectors.toSet());
        System.out.println(ans7);

    }
}
