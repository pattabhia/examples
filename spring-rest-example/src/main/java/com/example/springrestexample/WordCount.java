package com.example.springrestexample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Duration;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
*
* @author: siva0964134
*/
public class WordCount {

	public static final String DELIM = ",.?:;!' - ";

	public static void main(String args[]) throws Exception {
		Instant start = Instant.now();
		Map<String, Integer> occurrence = new LinkedHashMap<String, Integer>();
		FileReader fr = new FileReader("C:\\mylab\\examples\\spring-rest-example\\src\\main\\java\\com\\example\\springrestexample\\macbeth.txt");
		BufferedReader br = new BufferedReader(fr);
		for (String macbeth; (macbeth = br.readLine()) != null;) {
			StringTokenizer st = new StringTokenizer(macbeth, DELIM);
			while (st.hasMoreTokens()) {
				String word = st.nextToken().toLowerCase();
				if (word.length() > 4) {
					if (occurrence.get(word) == null)
						occurrence.put(word, 1);
					else
						occurrence.put(word, occurrence.get(word) + 1);
				}
			}
		}
		secondCommonWord(occurrence);
		Instant finish = Instant.now();
		System.out.println(String.format("TOTAL TIME ->%s %s", Duration.between(start,finish).toMillis(),"ms"));
	}

	private static void secondCommonWord(Map<String, Integer> occurrence) {
		int first = 0;
		int second = 0;
		for (int wordCount : occurrence.values()) {
			if (first < wordCount) {
				second = first;
				first = wordCount;
			} else if (second < wordCount) {
				second = wordCount;
			}
		}
		for (Map.Entry<String, Integer> entry : occurrence.entrySet()) {
			if (entry.getValue().equals(second)) {
				System.err.println(
						"Second most Common Word in MacBeth is: " + entry.getKey() + " at " + entry.getValue());
			}
		}
	}
}
