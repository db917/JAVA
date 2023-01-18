package part01;

public class Student implements Cloneable {

	private int studentNum;
	private String studentName;

	public Student(int studentNum, String studentName) {
		super();
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("인스턴스가 소멸되었다.");
	}

	@Override
	public String toString() {
		return studentName + "," + studentNum;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student cmp = (Student) obj;
			if (this.studentNum == cmp.studentNum) {
				if (this.studentName.equals(cmp.studentName)) {

					return true;
				}

			}
		}
		return super.equals(obj);
	}

}
