package mapExam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		// key : String�� , value : String��
		HashMap<String, String> map = new HashMap<String, String>();
		
// 1 -- ������ ����
		map.put("KIM", "Inchon");
		map.put("PARK", "Gangsu");
		map.put("LEE", "Suwon");
		map.put("HAN", "Itaewon");
		map.put("HONG", "Hannam");
// 2 -- null ������ ���� ����
		map.put(null, null);
		
// 3 -- ��� key ��ü�� Set�� ��ȯ
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("Key : " + key);
		}
// 4 -- ������ key�� �����ϴ��� Ȯ��
		System.out.println("HAN���� ������ key�� �ִ°� ? " + map.containsKey("HAN"));
		
// 5 -- ��� value ��ü�� Collection���� ��ȯ
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println("value : " + value);
		}
// 6 -- ������ value�� �����ϴ��� Ȯ��		
		System.out.println("Hannam ���� ������ value�� �ִ°� ? " + map.containsValue("Hannam"));
		
// 7 -- ������ key�� �ش��ϴ� value ����
		map.remove("HAN");
		
// 8 -- Map �ڷᱸ���� ��� ������(key/value) Ȯ�� 
		Set<String> keySeconds = map.keySet();
		for(String key : keySeconds) {
			System.out.println("Key : " + key + ", value : " + map.get(key));
		}
	}
}
