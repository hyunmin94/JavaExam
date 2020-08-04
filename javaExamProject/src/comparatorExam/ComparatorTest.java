package comparatorExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Person {
	String name;
	int weight;

	public Person(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + "]";
	}
}
class ComparatorPerson implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		// ※ weight 변수를 이용한 정렬

// 1 -- 내림 차순 정렬
		int result = 1;
		if (o1.weight >= o2.weight)
			result = -1;
		return result;

// 2-- 오름 차순 정렬
//		int result = -1;
//		if (o1.weight >= o2.weight)
//			result = 1;
//		return result;

	}
}
public class ComparatorTest {
	public static void main(String[] args) {

		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("HAN", 160));
		personList.add(new Person("HONG", 170));
		personList.add(new Person("KIM", 180));
		
		// 정렬 전 데이터 확인
		for(Person person : personList) {
			System.out.println("정렬 전 : " + person);
		}
		
// 1 -- List의 sort 메서드를 이용한 정렬
		// personList.sort(new comparatorPerson());

// 2 -- Collections의 sort 메서드를 이용한 정렬
		Collections.sort(personList, new ComparatorPerson());
		
		// 정렬 후 데이터 확인
		Iterator<Person> itp = personList.iterator();
		while (itp.hasNext()) {
			System.out.println("정렬 후 : " + itp.next());
		}
	}
}
