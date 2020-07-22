//Given a list of Strings, write a method that returns a list of all strings that start with the letter 'a'
//(lower case) and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.

package lamdas_stream_master;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listofstr {
    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();
        list.add("mnrs");
        list.add("mnopqr");
        list.add("mmn");
        list.add("mno");

        list = findStrings(list);

        for(String str : list)
            System.out.println(str);
    }

    static List<String> findStrings(List<String> list)
    {
        return list.stream().filter(str -> str.startsWith("m")).filter(str -> str.length()==3).collect(Collectors.toList());
    }
}
