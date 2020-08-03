package collectionExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// List 객체 생성
		List<String> list = new ArrayList<String>();
		
		// List에 요소 추가 (index를 지정하지 않으면 순차적으로 추가된다) 
		list.add("HAN");
		list.add("PARK");
		list.add("KIM");
		list.add("LEE");
		list.add("HAN");
		list.add("HAN");
		
		// List에 원하는 위치에 데이터 삽입
		System.out.println("데이터 삽입 전 데이터 확인 : " + list);
		list.add(1,"CHOI");
		System.out.println("데이터 삽입 후 데이터 확인 : " + list);
		
		// for-each 문을 활용한 요소 출력
		for(String name : list) {
			System.out.println("foreach : " + name);
		}
		
		// Iterator 를 활용한 요소 출력
		Iterator<String> its = list.iterator();
		while(its.hasNext()){
			String name = its.next();
			System.out.println("iterator : " + name);
		}
		
		// List를 배열로 변환
		Object[] arr = list.toArray();
		System.out.println("List 객체를 배열로 변환 후 데이터 확인 : " + Arrays.toString(arr));
		
		// List의 첫번째 인덱스(0)의 요소 반환
		System.out.println("List의 첫번째 인덱스 위치에 있는 요소는? " + list.get(0));
		
		// List의 요소가 비었는지 확인
		System.out.println("List가 비어있는가 ?" + list.isEmpty()); 
		
		// List의 확인하고자 하는 요소가 존재하는지 확인
		System.out.println("List에 HAN 요소가 존재하는가?" + list.contains("HAN"));
		
		// List의 요소의 갯수 확인
		System.out.println("List의 요소 갯수는 ?" + list.size());
		
		// List에 원하는 위치에 데이터 삽입
		System.out.println("데이터 수정 전 데이터 확인 : " + list);
		list.set(1,"KANG");
		System.out.println("데이터 수정 후 데이터 확인 : " + list);
		
		// List의 요소명으로 원하는 요소 삭제
		list.remove("HAN");
		System.out.println("HAN 요소 삭제 후 데이터 확인 : " + list);	
		
		// List의 요소의 인덱스로 원하는 요소 삭제
		list.remove(0);
		System.out.println("첫번째 인덱스의 요소 삭제 후 데이터 확인 : " + list);	
		
		// List의 전체요소 삭제
		list.clear();
		System.out.println("전체 요소 삭제 후 데이터 확인 : " + list);
	}
}
