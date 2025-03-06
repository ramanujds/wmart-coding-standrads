package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class ListExample {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();

        items.add("car");
        items.add("bike");
        items.add("laptop");
        items.add("phone");
        items.add("watch");
        items.add("shoes");
        items.add("shirt");
        items.add("jeans");
        items.add("glasses");

        // find all the item starts with s

        class MyPredicate implements Predicate<String>{
            @Override
            public boolean test(String value) {
                if (value.startsWith("s")){
                    return true;
                }
                return false;
            }
        }

        MyPredicate p= new MyPredicate();

        class MyFunction implements Function<String,String>{
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }

        MyFunction function = new MyFunction();

//        List<String> output = items.stream().filter(p)
//                .map(function)
//                        .toList();
//        System.out.println(output);

//        List<String> output = items.stream().filter(item->item.startsWith("s"))
//                .map(item->item.toUpperCase())
//                .toList();
//        System.out.println(output);

       var output = items.stream().filter(item->item.startsWith("s"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(output);


//        List<String> filteredItems = new ArrayList<>();

//        for (String item:items){
//            if (item.startsWith("s")){
//                filteredItems.add(item);
//            }
//        }
//
//        // Transform to uppercase
//        List<String> transformedItems = new ArrayList<>();
//        for (String item:filteredItems){
//           transformedItems.add(item.toUpperCase());
//        }





//        for (int i=0 ; i<items.size(); i++){
//            System.out.println(items.get(i));
//        }

//        for (String item : items){
//            System.out.println(item);
//        }

//        items.forEach(item-> System.out.println(item));

//        items.forEach(System.out::println);


    }

}
