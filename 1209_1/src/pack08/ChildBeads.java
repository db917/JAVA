package pack08;


public class ChildBeads {
	int beads;
	String us;
	public ChildBeads(int beads) {
	this.beads=beads;
	}
	public void obtainBead(ChildBeads child, int get) {
		System.out.println(child+"한테"+get+"획득");
		beads += get;
	}
	

}
