package mapExam;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
// 1 -- ������ ���� : setProperty �޼���, put �޼���
		prop.setProperty("KIM", "Inchon");
		prop.put("CHOI","Anyang");
		prop.setProperty("PARK", "Gangsu");
		prop.setProperty("LEE", "Suwon");
		prop.setProperty("HAN", "Itaewon");
		prop.setProperty("HONG", "Hannam");
		
// 2 -- Properties�� �ִ� ��� key�� Enumeration<Object>�� ��ȯ
		Enumeration<Object> enuKeys = prop.keys();
		while(enuKeys.hasMoreElements()) {
			System.out.println("keys : " + enuKeys.nextElement());
		}
		
// 3 -- Properties�� �ִ� ��� key�� Enumeration<?> �� ��ȯ
		Enumeration<?> enuNames = prop.propertyNames();
		while(enuNames.hasMoreElements()) {
			System.out.println("propertyNames : " + enuNames.nextElement());
		}
	
// 4 -- Properties�� �ִ� ��� key�� Set<String> �� ��ȯ
		Set<String> setstringPropertyNames = prop.stringPropertyNames();
		Iterator<String> its = setstringPropertyNames.iterator();
		while(its.hasNext()) {
			System.out.println("stringPropertyNames : " + its.next());
		}
		
// 5 -- Properties�� �ִ� ��� key�� Set<Object> �� ��ȯ
		Set<Object> setKeys = prop.keySet();
		Iterator<Object> itk = setKeys.iterator();
		while(itk.hasNext()) {
			System.out.println("keySet : " + itk.next());
		}
		
// 6 -- Properties�� �ִ� ��� value�� Enumeration<Object> �� ��ȯ
		Enumeration<Object> enuValues = prop.elements();
		while(enuValues.hasMoreElements()) {
			System.out.println("elements : " + enuValues.nextElement());
		}

// 7 -- Properties�� �ִ� ��� value�� Collection<Object> �� ��ȯ
		Collection<Object> colValues = prop.values();
		Iterator<Object> itv = colValues.iterator();
		while(itv.hasNext()) {
			System.out.println("keySet : " + itv.next());
		}
		
// 8 -- �ش��ϴ� key�� value ���� ���� 
		System.out.println("���� �� HAN�� ��ġ : "+ prop.get("HAN"));
		System.out.println(prop.replace("HAN", "Itaewon", "Gunsan"));
		System.out.println("���� �� HAN�� ��ġ : "+ prop.getProperty("HAN"));
	}
}
