package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToWordList {

	public static void main(String[] args) {
		String aSentance = "she doesn't have this";
		System.out.println(getWordList(aSentance));
	}

	
	public static List<String> getWordList(String aSentance) {
		List<String> wordList = new ArrayList<String>();
		wordList = Arrays.asList(aSentance.split(" "));
		return wordList;
	}
}


Output:
[she, doesn't, have, this]
