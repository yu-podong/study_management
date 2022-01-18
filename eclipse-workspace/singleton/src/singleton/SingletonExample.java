package singleton;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}
		else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

}

//Singleton : 클래스가 객체 하나만 생성할 수 있는 패턴