import java.util.*;

public class Generics {

    //To achieve type safety use generic
    public static void main(String[] args) {

        List<Integer> values = new ArrayList();
        values.add(305);
        values.add(998);
        values.add(774);
//        values.add("san");
//        values.add(5.8f);
        values.add(236);
        values.add(881);
        //values.add(1,9);

//        Comparator<Integer> com = (o1,o2) ->
//        {
//            return o1%10>02%10?1:-1;
//        };
//     //Comparator<Integer> com = new CompImpl();

        Collections.sort(values,(o1,o2) ->
        {
            return o1%10>02%10?1:-1;
        });
        //Collections.reverse(values);
       // values.forEach(System.out::println);
        for(int i :values) {
            System.out.println(i);
        }

//        //iterator to fetch values from collection
//        Iterator i = values.iterator();
//
//
//        while(i.hasNext()) {
//            System.out.println(i.next());
//        }

    }
}
