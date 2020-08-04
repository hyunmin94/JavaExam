package mapExam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		// key : String형 , value : String형
		HashMap<String, String> map = new HashMap<String, String>();
		
// 1 -- 데이터 삽입
		map.put("KIM", "Inchon");
		map.put("PARK", "Gangsu");
		map.put("LEE", "Suwon");
		map.put("HAN", "Itaewon");
		map.put("HONG", "Hannam");
// 2 -- null 데이터 삽입 가능
		map.put(null, null);
		
// 3 -- 모든 key 객체를 Set로 반환
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("Key : " + key);
		}
// 4 -- 지정한 key가 존재하는지 확인
		System.out.println("HAN으로 지정된 key가 있는가 ? " + map.containsKey("HAN"));
		
// 5 -- 모든 value 객체를 Collection으로 반환
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println("value : " + value);
		}
// 6 -- 지정한 value가 존재하는지 확인		
		System.out.println("Hannam 으로 지정된 value가 있는가 ? " + map.containsValue("Hannam"));
		
// 7 -- 지정한 key에 해당하는 value 삭제
		map.remove("HAN");
		
// 8 -- Map 자료구조에 모든 데이터(key/value) 확인 
		Set<String> keySeconds = map.keySet();
		for(String key : keySeconds) {
			System.out.println("Key : " + key + ", value : " + map.get(key));
		}
	}
}
