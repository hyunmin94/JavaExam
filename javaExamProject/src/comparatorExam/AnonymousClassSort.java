package comparatorExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AnonymousClassSort {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("HAN", 160));
		personList.add(new Person("HONG", 170));
		personList.add(new Person("KIM", 180));

		// ���� �� ������ Ȯ��
		for (Person person : personList) {
			System.out.println("���� �� : " + person);
		}

		// �͸�Ŭ������ Ȱ���� �������� ����
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// 1 -- ���� ���� ����
				int result = 1;
				if (o1.weight >= o2.weight)
					result = -1;
				return result;

				// 2-- ���� ���� ����
//				int result = -1;
//				if (o1.weight >= o2.weight)
//					result = 1;
//				return result;
			}
		});

		// ���� �� ������ Ȯ��
		Iterator<Person> itp = personList.iterator();
		while (itp.hasNext()) {
			System.out.println("���� �� : " + itp.next());
		}
	}
}
