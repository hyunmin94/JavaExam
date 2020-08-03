package genericExam;

class GenericTestClass <T>{
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
}

public class GenericTest {
	
	public static void main(String[] args) {
		GenericTestClass<Integer> genericObj = new GenericTestClass<>();
		
		// 컴파일시 오류 발생
		// GenericTestClass<int> genericObj = new GenericTestClass<>();
	}
}

