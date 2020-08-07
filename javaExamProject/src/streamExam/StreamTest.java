package streamExam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {

// 0.1  Collection�� stream �޼��带 �̿��Ͽ� Stream ���
		List<String> list = Arrays.asList("HAN", "HAN", "KANG", "KIM", "PARK", "HWANG");

// 1 -- forEach �޼���		
		list.stream().forEach(s -> System.out.println("forEach : " + s));

// 2 -- map �޼���
		list.stream().map(s -> s.toLowerCase()).forEach(s -> System.out.println("map : " + s));

// 3 -- collect �޼���
		String collectStr = list.stream().collect(Collectors.joining(" "));
		System.out.println("collect : " + collectStr);

// 4 -- distinct �޼���
		list.stream().distinct().forEach(s -> System.out.println("distinct : " + s));

// 5 -- filter �޼���
		list.stream().filter(s -> s.startsWith("H")).forEach(s -> System.out.println("filter : " + s));

// 6 -- sorted() �޼���
		list.stream().sorted() // ��������
				// .sorted(Comparator.reverseOrder()) // ��������
				.forEach(s -> System.out.println("sorted : " + s));

// 0.2  Arrays Ŭ������ stream �޼��带 �̿��Ͽ� Stream ���
		int[] intArr = { 5, 4, 3, 2, 2, 9 };

// 7 -- count �޼���
		long count = Arrays.stream(intArr).count();
		System.out.println("���� : " + count);

// 8 -- average �޼���
		double average = Arrays.stream(intArr).average().getAsDouble();
		System.out.println("��� : " + average);

// 9 -- max �޼���
		int max = Arrays.stream(intArr).max().getAsInt();
		System.out.println("�ִ밪 : " + max);

// 10 --min �޼���
		int min = Arrays.stream(intArr).min().getAsInt();
		System.out.println("�ּڰ� : " + min);

// 11 --sum �޼���
		int sum = Arrays.stream(intArr).sum();
		System.out.println("�հ� : " + sum);

// 12 --limit �޼���
		Arrays.stream(intArr).limit(3).forEach(n -> System.out.println("limit : " + n));
	}
}
