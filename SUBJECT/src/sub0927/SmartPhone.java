package sub0927;

public class SmartPhone extends CellPhone
{
	private boolean isMonthlyFixedRate;
	private int monthlyFixedFee;

	public SmartPhone(String phoneNumber, int feePerCallTime){
		super(phoneNumber, feePerCallTime);
	}
	public SmartPhone(String phoneNumber, int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee){
		super(phoneNumber, feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}

	public void setIsMonthlyFixedRate(boolean isMonthlyFixedRate){
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}
	public void setMonthlyFixedFee(int monthlyFixedFee){
		this.monthlyFixedFee = monthlyFixedFee;
	}

	public boolean getIsMonthlyFixedRate(){
		return isMonthlyFixedRate;
	}
	public int setMonthlyFixedFee(){
		return monthlyFixedFee;
	}

	public void calculateTotalFee(){
		if(isMonthlyFixedRate == true){
			System.out.println("고객님은 "+monthlyFixedFee+" 정액 요금제입니다.");
			setTotalFee(monthlyFixedFee);
		}
		else
			super.calculateTotalFee();
	}
}