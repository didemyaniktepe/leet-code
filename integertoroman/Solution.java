package integertoroman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    List<String> strings = List.of("M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I");
    List<Integer> integers = List.of(1000,900,500,400,100,90,50,40,10,9,5,4,1);

    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(strings.size());
        System.out.println(integers.size());
        for(int i = 0 ; i < integers.size() ; i++ ) {
            while (num >= integers.get(i)) {
                num -= integers.get(i);
                stringBuilder.append(strings.get(i));
            }
        }
        return stringBuilder.toString();
    }


}
