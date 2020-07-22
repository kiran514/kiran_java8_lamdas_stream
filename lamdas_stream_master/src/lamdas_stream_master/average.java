//Write a method that returns the average of a list of integers.
package lamdas_stream_master;


	import java.util.OptionalDouble;
	import java.util.stream.IntStream;

	public class average {
	    public static void main(String args[])
	    {
	        IntStream stream = IntStream.of(5,7,74,89,54,268,74,25,7,2);

	        OptionalDouble opt = stream.average();
	        if(opt.isPresent()) {
	            System.out.println("Avg : " + opt.getAsDouble());
	        } else {
	            System.out.println(-1);
	        }
	    }
	}
