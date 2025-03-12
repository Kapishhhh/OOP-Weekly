package week3;

import java.util.HashMap;

public class PunctuationCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Mary had a little lamb, her fleece was as white as snow, " +
                "and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";
  
  HashMap<Character, Integer> punctuationCounts = new HashMap<>();
  
  for (char ch : text.toCharArray()) {
      if (",.-!?;:'\"()[]{}".indexOf(ch) != -1) {
          punctuationCounts.put(ch, punctuationCounts.getOrDefault(ch, 0) + 1);
      }
  }
  
  System.out.println("Punctuation Count:");
  for (Character key : punctuationCounts.keySet()) {
      System.out.println(key + " : " + punctuationCounts.get(key));
  }

	}

}
