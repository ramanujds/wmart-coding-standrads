package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();

        items.add("car");
        items.add("bike");
        items.add("laptop");
        items.add("car");
        items.add("bike");
        items.add("laptop");


//        for (int i=0 ; i<items.size(); i++){
//            System.out.println(items.get(i));
//        }

        for (String item : items){
            System.out.println(item);
        }

//        items.forEach(item-> System.out.println(item));

//        items.forEach(System.out::println);


    }

}
