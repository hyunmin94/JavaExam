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
		
// 1--  Object와 Object의 자식클래스 모두 사용 가능
		staticMethod(new GenericWildCardClass<Object>());
		staticMethod(new GenericWildCardClass<String>());
		staticMethod(new GenericWildCardClass<Integer>());
		
// 2 -- Pet와 Pet의 자식클래스인 Dog, Cat클래스만 사용가능
		staticMethodSecond(new GenericWildCardClass<Pet>());
		staticMethodSecond(new GenericWildCardClass<Dog>());
		staticMethodSecond(new GenericWildCardClass<Cat>());
		// 에러
		// staticMethodSecond(new GenericWildCardClass<Object>());
		
// 3 -- Dog와 Dog의 부모클래스인 Pet 클래스만 사용가능
		staticMethodThird(new GenericWildCardClass<Pet>());
		staticMethodThird(new GenericWildCardClass<Dog>());
		// 에러
		// staticMethodThird(new GenericWildCardClass<Cat>());
	}	
}
