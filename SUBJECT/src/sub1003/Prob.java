package sub1003;

import java.util.Vector;
import sub1003.DataFormatException;

public class Prob {

	public static void main(String[] args) {
		Vector bookList = new Vector();
		
		try {
			bookList.add(makeBook("Java Programming ���� : ��ǻ�� : 35000"));
			bookList.add(makeBook("�ʺ��ڸ� ���� SQL : ��ǻ�� : 28000"));
			bookList.add(makeBook("HTML5 API �Ұ� : ��ǻ�� : 58000"));
			bookList.add(makeBook("JDBC Programming ���� : ��ǻ�� : 45000"));
			//bookList.add(makeBook("JDBC Programming ���� : ��ǻ��"));
			bookList.add(makeBook("JSP Programming : ��ǻ�� : 56000"));
			System.out.println("<< å ��� >>");
			printBookList(bookList);
		}catch(DataFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static Book makeBook(String bookData) throws DataFormatException {
		String[] str = bookData.split(" : ");
		Book book = new Book();
		if(str.length != 3) {
			throw new DataFormatException(str[0]);
		}
		else {
			book.setTitle(str[0]);
			book.setKind(str[1]);
			book.setRentalPrice(Integer.parseInt(str[2]));
		}
		return book;
	}
	
	private static void printBookList(Vector bookList) {
		Book book;
		for(int i=0;i<bookList.size();i++) {
			System.out.println(bookList.get(i));
		}
	}
}