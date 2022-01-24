package exam01_hashset;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Member) { //instanceof: 객체 타입 확인 연산자
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age) ;
		} else {
			return false;
		}
	}

	public int hashCode() { //object class 안에 들어있는 메소드
		return name.hashCode() + age;
	}
}
