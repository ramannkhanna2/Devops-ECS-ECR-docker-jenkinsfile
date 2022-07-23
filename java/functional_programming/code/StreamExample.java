package lab3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList(new String[] { "cat", "mat", "rat", "sat", "ate", "bet" });
		List<String> lettersA = numbers.stream().filter(StreamExample::filterA).collect(Collectors.toList());
	}

	static boolean filterA(String input) {
		return input.contains("a");
	}
}
