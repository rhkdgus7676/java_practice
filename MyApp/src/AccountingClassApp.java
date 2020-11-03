class Accounting{
	public  double vatRate;
	public  double valueOfSupply;
	public  double expenseRate;
	
	public  void print() {
		System.out.println("Value of supply : "+ valueOfSupply );				
		System.out.println("VAT : "+getVAT() );		
		System.out.println("TOTAL : "+getTotal() );		
		System.out.println("Expense : "+ getExpense() );
		System.out.println("Income : "+ getIncome() );		
		System.out.println("Dividend1 : "+ getDividend1() );	
		System.out.println("Dividend2 : "+ getDividend2() );		
		System.out.println("Dividend3 : "+ getDividend3() );
	}

	public  double getDividend3() {
		return getIncome() * 0.2;
	}

	public  double getDividend2() {
		return getIncome() * 0.3;
	}

	public  double getDividend1() {
		return getIncome() * 0.5;
	}

	public  double getIncome() {
		return valueOfSupply - getExpense();
	}

	public  double getExpense() {
		return valueOfSupply*expenseRate;
	}

	public  double getTotal() {
		return valueOfSupply+getVAT();
	}

	//code that defines method
	public  double getVAT() {
		return valueOfSupply*vatRate;
	}
}
public class AccountingClassApp {

	

	public  void main(String[] args) {
		
//		Accounting.valueOfSupply = 10000.0; // Double.parseDouble(args[0]); 
//		Accounting.vatRate = 0.1;		
//		Accounting.expenseRate = 0.3;		
//		Accounting.print();
		
		//instance
		
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 50000.0;
		a2.vatRate = 0.3;
		a2.expenseRate = 0.5;
		a2.print();
		
		
	}

	

}
