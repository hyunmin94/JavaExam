package stringExam;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		
// 1 -- 기본 구분자 : \t\n\r
		StringTokenizer defaultTokens = new StringTokenizer("write once \t run \r anywhere");
		while (defaultTokens.hasMoreTokens()) {
			System.out.println(defaultTokens.nextToken());
		}

// 2 -- 구분자 : #/-
		StringTokenizer delimTokens = new StringTokenizer("write#once/run-anywhere", "#/-");
		while (delimTokens.hasMoreElements()) {
			System.out.println(delimTokens.nextElement());
		}

// 3 -- 구분자를 포함한 토큰 추출 : #/-
		StringTokenizer returnDelimsTokens = new StringTokenizer("write#once/run-anywhere", "#/-", true);
		
// 4 -- 토큰의 갯수 반환 
		System.out.println(returnDelimsTokens.countTokens());
		while (returnDelimsTokens.hasMoreTokens()) {
			System.out.println(returnDelimsTokens.nextToken());
		}
	}
}
