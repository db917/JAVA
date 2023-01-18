package pack05;
//클래스(설계도)--->인스턴스화-->new 객체(인스턴스): 제품
public class Student {
	// 특징:속성:필드:맴버
	//인스턴스 변수:인스턴스 내부에 할당.
	String name;
	int sNo;// 학번
	int age;// 나이
	double height;//키
	//클래스 변수 : 같은 이름의 변수는 클래스에 1번만 할당:생성할 수 있는 고유변수.
	static String scName;//클래스안에서도 초기화가능하다.static String scName="예시";
//	 static final String SCNAME; final을 넣으면 최종값 
	//적용으로 상수가된다 값이 변하지않음,변수가 대문자로 보이며 값이 변하면 안된데는 변수에 적용한다. 
	
	// 행위 : 메소드(특정 클레스에 들어가있는 함수를 메소드_소속이있는 함수)
	// 자바에서는 함수가 클레스 밖에존재할수 없음 그러므로 자바에는 메소드없음
	void study() {
		int hour=4; //지역변수 local variable
		System.out.println(name+"가 "+hour+"시간 공부를 한다.");

	}

	void exam() {
		System.out.println(name+"가 시험을 본다.");

	}

}
