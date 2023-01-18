package part01;
import java.util.Objects;

public class Member {
	
	private int memverId;
	private String memverName;
	
	
	public Member(int memverId, String memverName) {
		super();
		this.memverId = memverId;
		this.memverName = memverName;
		
	}
	@Override
	public String toString() {
	
		return memverId+memverName;
    
	}

	
	
	public int getMemverId() {
		return memverId;
	}
	public void setMemverId(int memverId) {
		this.memverId = memverId;
	}
	public String getMemverName() {
		return memverName;
	}
	public void setMemverName(String memverName) {
		this.memverName = memverName;
	}

}
