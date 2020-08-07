package streamExam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {

// 0.1  Collection의 stream 메서드를 이용하여 Stream 얻기
		List<String> list = Arrays.asList("HAN", "HAN", "KANG", "KIM", "PARK", "HWANG");

// 1 -- forEach 메서드		
		list.stream().forEach(s -> System.out.println("forEach : " + s));

// 2 -- map 메서드
		list.stream().map(s -> s.toLowerCase()).forEach(s -> System.out.println("map : " + s));

// 3 -- collect 메서드
		String collectStr = list.stream().collect(Collectors.joining(" "));
		System.out.println("collect : " + collectStr);

// 4 -- distinct 메서드
		list.stream().distinct().forEach(s -> System.out.println("distinct : " + s));

// 5 -- filter 메서드
		list.stream().filter(s -> s.startsWith("H")).forEach(s -> System.out.println("filter : " + s));

// 6 -- sorted() 메서드
		list.stream().sorted() // 오름차순
				// .sorted(Comparator.reverseOrder()) // 내림차순
				.forEach(s -> System.out.println("sorted : " + s));

// 0.2  Arrays 클래스의 stream 메서드를 이용하여 Stream 얻기
		int[] intArr = { 5, 4, 3, 2, 2, 9 };

// 7 -- count 메서드
		long count = Arrays.stream(intArr).count();
		System.out.println("갯수 : " + count);

// 8 -- average 메서드
		double average = Arrays.stream(intArr).average().getAsDouble();
		System.out.println("평균 : " + average);

// 9 -- max 메서드
		int max = Arrays.stream(intArr).max().getAsInt();
		System.out.println("최대값 : " + max);

// 10 --min 메서드
		int min = Arrays.stream(intArr).min().getAsInt();
		System.out.println("최솟값 : " + min);

// 11 --sum 메서드
		int sum = Arrays.stream(intArr).sum();
		System.out.println("합계 : " + sum);

// 12 --limit 메서드
		Arrays.stream(intArr).limit(3).forEach(n -> System.out.println("limit : " + n));
	}
}
