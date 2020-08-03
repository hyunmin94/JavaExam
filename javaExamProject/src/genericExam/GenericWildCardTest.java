package genericExam;

class GenericWildCardClass <T>{
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
}

class Pet{}
class Dog extends Pet{}
class Cat extends Pet{}

public class GenericWildCardTest {
	
	public static void staticMethod(GenericWildCardClass<?> obj) {}
	public static void staticMethodSecond(GenericWildCardClass<? extends Pet> obj) {}
	public static void staticMethodThird(GenericWildCardClass<? super Dog> obj) {}
	
	public static void main(String[] args) {
		
// 1--  Object�� Object�� �ڽ�Ŭ���� ��� ��� ����
		staticMethod(new GenericWildCardClass<Object>());
		staticMethod(new GenericWildCardClass<String>());
		staticMethod(new GenericWildCardClass<Integer>());
		
// 2 -- Pet�� Pet�� �ڽ�Ŭ������ Dog, CatŬ������ ��밡��
		staticMethodSecond(new GenericWildCardClass<Pet>());
		staticMethodSecond(new GenericWildCardClass<Dog>());
		staticMethodSecond(new GenericWildCardClass<Cat>());
		// ����
		// staticMethodSecond(new GenericWildCardClass<Object>());
		
// 3 -- Dog�� Dog�� �θ�Ŭ������ Pet Ŭ������ ��밡��
		staticMethodThird(new GenericWildCardClass<Pet>());
		staticMethodThird(new GenericWildCardClass<Dog>());
		// ����
		// staticMethodThird(new GenericWildCardClass<Cat>());
	}	
}
