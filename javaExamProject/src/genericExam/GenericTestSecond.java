package genericExam;

class GenericTestClassSecond <T>{
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
}

class ObjectTestClass{
	private Object obj;
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}
}

public class GenericTestSecond {

	public static void main(String[] args) {
			
// 1 -- 제네릭 클래스(Generic) 사용
		GenericTestClassSecond<String> genericObj = new GenericTestClassSecond<String>();
		genericObj.setObj("Hello");
		// 컴파일시 제네릭 타입이 String이기 떄문에 Integer형 데이터를 입력하려고 하면 에러가 발생한다.
		// genericObj.setObj(123);
		
		// 강제 형변환 불필요
		String str = genericObj.getObj();
		System.out.println(str);
		
// 2 -- Object형을 인스턴스변수로 갖는 클래스 사용
		ObjectTestClass objectObj = new ObjectTestClass();
		objectObj.setObj("World");
		// 강제 형변환 필요 (다운캐스팅)
		String str1 = (String) objectObj.getObj();
		System.out.println(str1);
		
	}
}
