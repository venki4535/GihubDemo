package interview;

import java.util.HashMap;
import java.util.Map;

public class occurenceofstring {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "HellloHiHelloHiHello";
		   HashMap<Character,Integer> charcount = new HashMap<Character,Integer>();
		   
		   char[] strArray= str.toCharArray();
		   
		   for(char c:strArray)
		   {
			   if(charcount.containsKey(c))
			   {
				   charcount.put(c, charcount.get(c)+1);
			   }
			   else
			   {
				   charcount.put(c, 1);
			   }
		   }
		   
		   for(Map.Entry entry :charcount.entrySet()) {
			   System.out.println(entry.getKey()+"="+entry.getValue());
		   }
		   
		  
		
	}

}
