package sub0928;

public class Prob12 {

	public static void main(String[] args) {
		String url1 = "http://localhost/order?prodId=RPOD-001&prodName=������3&price=980000";
		String prodName = getParameter(url1, "prodName");
		System.out.println("��ǰ �̸� : "+ prodName);
		
		String url2 = "http://localhost/registUser?userId=USER-001&userName=ȫ�浿&address=����� ������&userAge=26";
		String userAddress = getParameter(url2, "address");
		System.out.println("ȸ�� �ּ� : "+userAddress);
	}
	
	private static String getParameter(String url, String paramName) {
		
		return (url.substring(url.indexOf(paramName)+paramName.length()+1)).
				substring(0, (url.substring(url.indexOf(paramName)+paramName.length()+1)).indexOf('&'));
	}

}