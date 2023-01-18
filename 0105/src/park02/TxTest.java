package park02;

import java.util.HashMap;
import java.util.Map;

import park01.Member;

public class TxTest {
	public static void main(String[] args) {
		BoardService service = new BoardService();

		HashMap<String, Object> map = service.boardWrite();

		if (map != null) {
			System.out.println("글쓰기  OK");
			Member mb=(Member)map.get("member");
			System.out.println(mb);
			Board bd=(Board)map.get("board");
			System.out.println(bd);
			
		} else {
			System.out.println("글쓰기 Fail");
		}
	}

}
