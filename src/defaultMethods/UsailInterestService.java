package defaultMethods;

import java.security.InvalidParameterException;

public class UsailInterestService implements InterestService{
	
	private double interestRate;
	
	public UsailInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
