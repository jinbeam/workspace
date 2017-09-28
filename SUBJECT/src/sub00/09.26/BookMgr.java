import java.util.Arrays;

class BookMgr
{
	Book[] booklist;

	BookMgr(Book[] booklist){
		//this.booklist = booklist;
		this.booklist = Arrays.copyOf(booklist, booklist.length);
	}

	public void printBookList(){
		for(int i=0; i<booklist.length; i++)
		{
			System.out.println(booklist[i].getTitle());
		}
	}

	public void printTotalPrice(){
		int sum=0;
		for(int i=0;i<booklist.length;i++){
			sum += booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : "+ sum);
	}
}