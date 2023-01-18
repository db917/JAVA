


package pack08;



public class BeadsGame {
	int num;
	String name;
	
	public static void main(String[] args) {
		
	
		//구슬 15개 소유한 어린이1
		ChildBeads child1=new ChildBeads(15);

		//구슬 10개 소유한 어린이2
		ChildBeads child2=new ChildBeads(10);
	
		//어린이1이 어린이2한테 5개 구슬 획득
		child1.obtainBead(child2,5);
		
//		
//		//어린이2이 어린이1한테 10개 구슬 획득 어린이1 10/어린이2 15
//		child2.obtainBead(child1,10);
//		
//		
//		//어린이2이 어린이1한테 20개 구슬 획득 어린이1 0/어린이2 25 
//		child2.obtainBead(child1,10);
//		child1.sdhsmhowBeadNum();			// 보유 구슬 0개
//		child2.showBeadNum();			// 보유 구슬 25개
//	
	
	}


}
