//Given a list of Strings (that contains both palindromes and non-palindromes),
//write a method that returns a list of all the palindrome strings.

package lamdas_stream_master;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class palindrome_str 
{
	    public static void main(String args[])
	    {
	        List<String> arrayList = new ArrayList();
	        arrayList.add("mom");
	        arrayList.add("madam");
	        arrayList.add("abababba");
	        arrayList.add("rotator");
	        arrayList.add("lucifer");

	        arrayList = palindrome(arrayList);

	        System.out.println("Palindrome Strings are :-");
	        for(String str : arrayList)
	            System.out.println(str);
	    }

static List<String> palindrome(List<String> list)
{
        List<String> arrayList=new ArrayList();
        for(String i : list)
        {String str = i.replaceAll("\\s+", "").toLowerCase();
           if( IntStream.range(0, str.length()/2).noneMatch(j -> str.charAt(j)!= str.charAt(str.length()-j-1)))
                arrayList.add(i);}
        return arrayList;
	    }
	}
