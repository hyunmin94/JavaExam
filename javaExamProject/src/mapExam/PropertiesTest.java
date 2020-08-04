package mapExam;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
// 1 -- 데이터 삽입 : setProperty 메서드, put 메서드
		prop.setProperty("KIM", "Inchon");
		prop.put("CHOI","Anyang");
		prop.setProperty("PARK", "Gangsu");
		prop.setProperty("LEE", "Suwon");
		prop.setProperty("HAN", "Itaewon");
		prop.setProperty("HONG", "Hannam");
		
// 2 -- Properties에 있는 모든 key를 Enumeration<Object>로 반환
		Enumeration<Object> enuKeys = prop.keys();
		while(enuKeys.hasMoreElements()) {
			System.out.println("keys : " + enuKeys.nextElement());
		}
		
// 3 -- Properties에 있는 모든 key를 Enumeration<?> 로 반환
		Enumeration<?> enuNames = prop.propertyNames();
		while(enuNames.hasMoreElements()) {
			System.out.println("propertyNames : " + enuNames.nextElement());
		}
	
// 4 -- Properties에 있는 모든 key를 Set<String> 로 반환
		Set<String> setstringPropertyNames = prop.stringPropertyNames();
		Iterator<String> its = setstringPropertyNames.iterator();
		while(its.hasNext()) {
			System.out.println("stringPropertyNames : " + its.next());
		}
		
// 5 -- Properties에 있는 모든 key를 Set<Object> 로 반환
		Set<Object> setKeys = prop.keySet();
		Iterator<Object> itk = setKeys.iterator();
		while(itk.hasNext()) {
			System.out.println("keySet : " + itk.next());
		}
		
// 6 -- Properties에 있는 모든 value를 Enumeration<Object> 로 반환
		Enumeration<Object> enuValues = prop.elements();
		while(enuValues.hasMoreElements()) {
			System.out.println("elements : " + enuValues.nextElement());
		}

// 7 -- Properties에 있는 모든 value를 Collection<Object> 로 반환
		Collection<Object> colValues = prop.values();
		Iterator<Object> itv = colValues.iterator();
		while(itv.hasNext()) {
			System.out.println("keySet : " + itv.next());
		}
		
// 8 -- 해당하는 key의 value 값을 변경 
		System.out.println("변경 전 HAN의 위치 : "+ prop.get("HAN"));
		System.out.println(prop.replace("HAN", "Itaewon", "Gunsan"));
		System.out.println("변경 후 HAN의 위치 : "+ prop.getProperty("HAN"));
	}
}
