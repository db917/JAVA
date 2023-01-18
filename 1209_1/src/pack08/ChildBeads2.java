package pack08;

public class ChildBeads2 {

	int num;
	static int[] arr = new int[2];// 플레이어 수
	private int beads;// 보유 구슬15

	public ChildBeads(int beads, int num) {
		this.num = num;
		arr[(num - 1)] = beads;
		this.beads += beads;

	}

	public void showArrInfo() {
		for (int a = num-1; a < 2;) {// a=플레이어 수
			
			System.out.println(arr[a]);
			System.out.println("----------");
			break;

		}
	}

	public void obtainBead(ChildBeads child2, int i) {
		
	
		
		
	}
}
/////////////////////////////////////////////////////////////
