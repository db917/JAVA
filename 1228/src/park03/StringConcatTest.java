package park03;

public class StringConcatTest {
	public static void main(String[] args) {
		//구현클래스 활용
		String s1="hello";
		String s2="world";
		StringConcatImpl strCon= new StringConcatImpl();
		strCon.makeString(s1, s2);
		//람다식 활용
		StringConcat con=(s,v)->System.out.println(s+"..........."+v);
		con.makeString(s1, s2);
		
	}

	
}
