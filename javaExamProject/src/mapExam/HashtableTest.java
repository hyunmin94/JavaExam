package mapExam;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashtableTest {

	public static void main(String[] args) {
		
		// key : String형 , value : Integer형
		Hashtable<String, Integer> map = new Hashtable<String, Integer>();
		
// 1 -- 데이터 삽입
		map.put("KIM",  160);
		map.put("PARK", 170);
		map.put("LEE", 165);
		map.put("HAN", 170);
		map.put("HONG", 180);
		
// 2 -- null 데이터 삽입 불가 (에러 발생)
		// map.put("KANG", null);
		
// 3 -- 모든 key 객체를 Set로 반환
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("Key : " + key);
		}
// 4 -- 지정한 key가 존재하는지 확인		
		System.out.println("HAN으로 지정된 key가 있는가 ? " + map.containsKey("HAN"));
		
// 5 -- 모든 value 객체를 Collection으로 반환
		Collection<Integer> values = map.values();
		for(int value : values) {
			System.out.println("value : " + value);
		}
// 6 -- 지정한 value가 존재하는지 확인		
		System.out.println("160으로 지정된 value가 있는가 ? " + map.containsValue(160));
		
// 7 -- 지정한 key에 해당하는 value 삭제
		map.remove("HAN");
		
// 8 -- Map 자료구조에 모든 데이터(key/value) 확인 
		Set<String> keySeconds = map.keySet();
		for(String key : keySeconds) {
			System.out.println("Key : " + key + ", value : " + map.get(key));
		}
	}
}
