package mooc.com;

	public class PayTax {
		public static void main(String[] args) {
			Income[] incomes = new Income[] {
					new Income(3000),
					new Salary(7500) };
			System.out.println(totalTax(incomes));
		}

		public static double totalTax(Income[] incomes) {
			double total = 0;
			for(Income income: incomes) {
				total = total + income.getTax();
		}
			return total;
	}
}
	
	class Income {
		
		protected double income;
		public Income(double income) {
			this.income = income;
		}
		
		public double getTax() {
			return income * 0.1;
		}
	}
	
	class Salary extends Income {
		public Salary(double income) {
			super(income);
			// TODO Auto-generated constructor stub
		}	
		@Override
		public double getTax() {
			if(income <= 5000) {
				return 0;
			}
			return (income - 5000) * 0.2;
		}
	}

