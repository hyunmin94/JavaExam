package collectionExam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		// Set 객체 생성
		Set<String> s = new HashSet<String>();
		
		// Set에 요소 추가 
		s.add("HAN");
		s.add("PARK");
		s.add("KIM");
		s.add("LEE");
		s.add("HAN");
		s.add("HAN");
		
		// 중복된 요소는 제거된걸 알 수 있다.
		System.out.println("toString 메서드 전체 출력 : " + s);
		
		// for-each 문을 활용한 요소 출력
		for(String name : s) {
			System.out.println("foreach : " + name);
		}
		
		// Iterator 를 활용한 요소 출력
		Iterator<String> its = s.iterator();
		while(its.hasNext()){
			String name = its.next();
			System.out.println("iterator : " + name);
		}
		
		// Set의 요소가 비었는지 확인
		System.out.println("Set가 비어있는가 ? " + s.isEmpty()); 
		
		// Set의 확인하고자 하는 요소가 존재하는지 확인
		System.out.println("Set에 HAN 요소가 존재하는가? " + s.contains("HAN"));
		
		// Set의 요소의 갯수 확인
		System.out.println("Set의 요소 갯수는 ? " + s.size());
		
		// Set의 원하는 요소 삭제(순서가 없기 때문에 요소명으로 삭제한다)
		s.remove("HAN");
		System.out.println("HAN 요소를 삭제 후 데이터 확인  : " + s);	
		
		// Set의 전체요소 삭제
		s.clear();
		System.out.println("전체 요소를 삭제 후 데이터 확인: " + s);		
	}
}
