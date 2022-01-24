package sec02.exam01_none_generic_type;

//generic을 안써서 매번 타입 언급해야함
public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get();
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}

}
