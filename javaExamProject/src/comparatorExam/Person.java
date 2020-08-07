package comparatorExam;

public class Person {
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