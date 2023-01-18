package park02;

public class LambdaTest2  {
	//람다로 최대값구하기
	public static void main(String[] args) {
		MyNumber myNum = (x,y)->(x>y?x:y);
		
		System.out.println("최대값="+myNum.getMax(10, 7));
			
			
		}


	}


