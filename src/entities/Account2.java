package entities;

import exception.ex.model.excepetions.AccountException;

public class Account2 {
	
		private Integer number;
		private String holder;
		private Double balance;
		private Double withDrawLimit;
		
		public Account2() {
			
		}
		
		public Account2(Integer number, String holder, Double balance, Double withDrawLimit) {
			this.number = number;
			this.holder = holder;
			this.balance = balance;
			this.withDrawLimit = withDrawLimit;
		}

		public Integer getNumber() {
			return number;
		}

		public void setNumber(Integer number) {
			this.number = number;
		}

		public String getHolder() {
			return holder;
		}

		public void setHolder(String holder) {
			this.holder = holder;
		}

		public Double getBalance() {
			return balance;
		}

		public Double getWithDrawLimit() {
			return withDrawLimit;
		}

		public void setWithDrawLimit(Double withDrawLimit) {
			this.withDrawLimit = withDrawLimit;
		}
			
		public void deposit(Double amount) {
			this.balance += amount;
		}
		
		public void withdraw(Double amount) throws AccountException {
			if(amount > this.withDrawLimit ) {
				throw new AccountException ("The amount exceeds withdraw limits");
			}
			
			if( this.balance == 0 || this.balance - amount < 0) {
				throw new AccountException ("Not enough balance");
			}

			this.balance -= amount;
		}
		
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
			return super.toString();
		}
}
