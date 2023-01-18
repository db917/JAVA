package park1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassTest {
	// static Class class;
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(ClassTest.class);

		// 컴파일시 로딩없이 실행중에 동적으로 클래스 바인딩한다.(장점)
		// 로컬(프로젝트)에 클래스가 없고 원격으로 클래스가 존재시 사용(장점)
		Class cls = Class.forName("java.lang.String");

		Constructor[] cons = cls.getConstructors();
		for (Constructor co : cons)
			System.out.println(co);

		Method[] mth = cls.getMethods();
		for (Method m : mth)
			System.out.println(m);
	}

}
