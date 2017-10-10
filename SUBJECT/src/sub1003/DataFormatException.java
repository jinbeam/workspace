package sub1003;

public class DataFormatException extends RuntimeException{
	
	
	public DataFormatException(String str) {
		super(str+"책 정보는 변환할 수 없는 데이터 포맷입니다.");
	}
	
	
}