package mapExam;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashtableTest {

	public static void main(String[] args) {
		
		// key : String�� , value : Integer��
		Hashtable<String, Integer> map = new Hashtable<String, Integer>();
		
// 1 -- ������ ����
		map.put("KIM",  160);
		map.put("PARK", 170);
		map.put("LEE", 165);
		map.put("HAN", 170);
		map.put("HONG", 180);
		
// 2 -- null ������ ���� �Ұ� (���� �߻�)
		// map.put("KANG", null);
		
// 3 -- ��� key ��ü�� Set�� ��ȯ
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("Key : " + key);
		}
// 4 -- ������ key�� �����ϴ��� Ȯ��		
		System.out.println("HAN���� ������ key�� �ִ°� ? " + map.containsKey("HAN"));
		
// 5 -- ��� value ��ü�� Collection���� ��ȯ
		Collection<Integer> values = map.values();
		for(int value : values) {
			System.out.println("value : " + value);
		}
// 6 -- ������ value�� �����ϴ��� Ȯ��		
		System.out.println("160���� ������ value�� �ִ°� ? " + map.containsValue(160));
		
// 7 -- ������ key�� �ش��ϴ� value ����
		map.remove("HAN");
		
// 8 -- Map �ڷᱸ���� ��� ������(key/value) Ȯ�� 
		Set<String> keySeconds = map.keySet();
		for(String key : keySeconds) {
			System.out.println("Key : " + key + ", value : " + map.get(key));
		}
	}
}
