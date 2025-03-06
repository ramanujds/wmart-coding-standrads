package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Integer> stateCodes = new HashMap<>();
        stateCodes.put("Karnataka", 29);
        stateCodes.put("Maharashtra", 27);
        stateCodes.put("Tamil Nadu", 33);
        stateCodes.put("Harayana", 6);
        stateCodes.put("Telangana", 36);
        stateCodes.put("Karnataka", 29);
        stateCodes.put("Karnataka", 29);
        stateCodes.put("Karnataka", 29);

//        stateCodes.remove("Harayana");
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the state name: ");
//        String state = scanner.nextLine();
//        Integer code = stateCodes.get(state);
//        System.out.println("State code for " + state + " is " + code);

        for(String state : stateCodes.keySet()){
            System.out.println(state + " : " + stateCodes.get(state));
        }


    }

}
