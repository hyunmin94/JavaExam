package comparatorExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LambdaSort {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("HAN", 160));
		personList.add(new Person("HONG", 170));
		personList.add(new Person("KIM", 180));

		// 정렬 전 데이터 확인
		for (Person person : personList) {
			System.out.println("정렬 전 : " + person);
		}

		// 람다표현식을 활용한 내림차순 정렬
		Collections.sort(personList, (Person o1, Person o2) -> {
			// 1 -- 내림 차순 정렬
			int result = 1;
			if (o1.weight >= o2.weight)
				result = -1;
			return result;

			// 2-- 오름 차순 정렬
//				int result = -1;
//				if (o1.weight >= o2.weight)
//					result = 1;
//				return result;
		});

		// 정렬 후 데이터 확인
		Iterator<Person> itp = personList.iterator();
		while (itp.hasNext()) {
			System.out.println("정렬 후 : " + itp.next());
		}
	}
}
