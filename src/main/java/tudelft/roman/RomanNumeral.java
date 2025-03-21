package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

//    private static Map<Character, Integer> map;

    //    static {
//        map = new HashMap<Character, Integer>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);
//    }
//
//    public int convert(String s) {
//
//        int convertedNumber = 0;
//        for(int i = 0; i < s.length(); i++) {
//            int currentNumber = map.get(s.charAt(i));
//            int next = i+1 < s.length() ? map.get(s.charAt(i+1)) : 0;
//
//            if(currentNumber >= next)
//                convertedNumber += currentNumber;
//            else
//                convertedNumber -= currentNumber;
//        }
//
//        return convertedNumber;
//
//    }
    private static final Map<Character, Integer> ROMAN_VALUES = Map.ofEntries(
            Map.entry('I', 1), Map.entry('V', 5), Map.entry('X', 10),
            Map.entry('L', 50), Map.entry('C', 100), Map.entry('D', 500), Map.entry('M', 1000)
    );

    public int convert(String roman) {
        if (roman == null || roman.isEmpty()) {
            throw new IllegalArgumentException("La cadena de entrada no puede estar vacía o ser nula.");
        }

        int total = 0;
        int prevValue = 0;

        for (char c : roman.toCharArray()) {
            if (!ROMAN_VALUES.containsKey(c)) {
                throw new IllegalArgumentException("Caracter inválido en la cadena: " + c);
            }

            int currentValue = ROMAN_VALUES.get(c);
            total += (currentValue > prevValue) ? (currentValue - 2 * prevValue) : currentValue;
            prevValue = currentValue;
        }
        return total;
    }
}
