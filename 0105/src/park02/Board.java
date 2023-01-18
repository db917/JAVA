package park02;

import java.sql.Connection;
import java.util.Date;

public class Board{
	 private int b_no;
	 private String b_id;
	 private String b_title;
	 private String b_contents;
	 private Date b_date;
	 
	 
	 @Override
	public String toString() {
		String str="";
		str+="글번호: "+b_no;
		str+=", 글쓴이: "+b_id;
		str+=", 제목: "+b_title;
		str+=", 내용: "+b_contents;
		str+=", 날짜: "+b_date;
		return str;
	}
	 
	 
	 public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public String getB_id() {
		return b_id;
	}
	public void setB_id(String b_id) {
		this.b_id = b_id;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_contents() {
		return b_contents;
	}
	public void setB_contents(String b_contents) {
		this.b_contents = b_contents;
	}
	public Date getB_date() {
		return b_date;
	}
	public void setB_date(Date b_date) {
		this.b_date = b_date;
	}


}
