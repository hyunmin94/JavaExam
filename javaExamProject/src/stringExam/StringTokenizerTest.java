package stringExam;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		
// 1 -- �⺻ ������ : \t\n\r
		StringTokenizer defaultTokens = new StringTokenizer("write once \t run \r anywhere");
		while (defaultTokens.hasMoreTokens()) {
			System.out.println(defaultTokens.nextToken());
		}

// 2 -- ������ : #/-
		StringTokenizer delimTokens = new StringTokenizer("write#once/run-anywhere", "#/-");
		while (delimTokens.hasMoreElements()) {
			System.out.println(delimTokens.nextElement());
		}

// 3 -- �����ڸ� ������ ��ū ���� : #/-
		StringTokenizer returnDelimsTokens = new StringTokenizer("write#once/run-anywhere", "#/-", true);
		
// 4 -- ��ū�� ���� ��ȯ 
		System.out.println(returnDelimsTokens.countTokens());
		while (returnDelimsTokens.hasMoreTokens()) {
			System.out.println(returnDelimsTokens.nextToken());
		}
	}
}
