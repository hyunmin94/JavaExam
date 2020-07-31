package casting;

public class DownCastingTest {

	public static void main(String[] args) {
		
//		※ 런타임 에러 발생(ClassCastException)
//		Child child = (Child) new Parent();
		
//		※ 업캐스팅
		Parent parent = new Child();
//		※ 업캐스팅된 참조변수를 이용하여 다운캐스팅
		Child child = (Child) parent;
		
		child.parentMethod();
		child.childMethod();
	}
}




