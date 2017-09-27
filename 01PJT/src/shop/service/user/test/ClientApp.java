package shop.service.user.test;

import shop.service.user.Client;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client("§æ§æ§æ", "1234", 0, false);
		System.out.println("¿Ã∏ß : "+client.getName());
		System.out.println(client);
	}

}