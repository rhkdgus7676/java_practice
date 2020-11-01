
public class AccountingMethodApp {

	public static double vatRate;
	public static double valueOfSupply;
	public static double expenseRate;
	

	public static void main(String[] args) {
		valueOfSupply = 10000.0; // Double.parseDouble(args[0]); 
		vatRate = 0.1;		
		expenseRate = 0.3;
		
		print();
	}

	public static void print() {
		System.out.println("Value of supply : "+ valueOfSupply );				
		System.out.println("VAT : "+getVAT() );		
		System.out.println("TOTAL : "+getTotal() );		
		System.out.println("Expense : "+ getExpense() );
		System.out.println("Income : "+ getIncome() );		
		System.out.println("Dividend1 : "+ getDividend1() );	
		System.out.println("Dividend2 : "+ getDividend2() );		
		System.out.println("Dividend3 : "+ getDividend3() );
	}

	public static double getDividend3() {
		return getIncome() * 0.2;
	}

	public static double getDividend2() {
		return getIncome() * 0.3;
	}

	public static double getDividend1() {
		return getIncome() * 0.5;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply*expenseRate;
	}

	public static double getTotal() {
		return valueOfSupply+getVAT();
	}

	//code that defines method
	public static double getVAT() {
		return valueOfSupply*vatRate;
	}

}
