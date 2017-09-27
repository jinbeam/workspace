package sub0928;

class FindMinusException extends IllegalArgumentException {
	String str ="";
	public FindMinusException() {
		str = "��ȭ";
	}
	public FindMinusException(int i) {
		str = "����";
	}
	public String getMessage() {
		return  str+"�ð��Է¿���";
	}
	
	
}


public class CellPhone {
	private String model;
	private double battery;
	
	public CellPhone(String model) {
		this.model = model;
	}

	void call(int time) throws FindMinusException{
		if(time<0) {
			throw new FindMinusException();
		}
		else {
			System.out.println("��ȭ �ð� : "+time+" ��");
			battery -= time*0.5;
			if(battery<0) {
				battery = 0;
			}
		}
	}
	
	void charge(int time) throws FindMinusException{
		if(time<0) {
			throw new FindMinusException(1);
		}
		else {
			System.out.println("�����ð� : "+time+" ��");
			battery += time*3;
			if(battery>100) {
				battery = 100;
			}
		}
	}
	
	public void printBattery() {
		System.out.println("���� ���͸� �� : "+battery);
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof CellPhone) {
			if(((CellPhone) obj).model == this.model) {
				return true;
			}
			else {
				return false;
			}
		}
		else
			return false;
	}
}