package sub1003;

import java.util.Vector;
import sub1003.DataFormatException;

public class Prob {

	public static void main(String[] args) {
		Vector bookList = new Vector();
		
		try {
			bookList.add(makeBook("Java Programming 기초 : 컴퓨터 : 35000"));
			bookList.add(makeBook("초보자를 위한 SQL : 컴퓨터 : 28000"));
			bookList.add(makeBook("HTML5 API 소개 : 컴퓨터 : 58000"));
			bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터 : 45000"));
			bookList.add(makeBook("JDBC Programming 기초 : 컴퓨터"));
			//bookList.add(makeBook("JSP Programming : 컴퓨터 : 56000"));
			System.out.println("<< 책 목록 >>");
			printBookList(bookList);
		}catch(DataFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static Book makeBook(String bookData) {
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