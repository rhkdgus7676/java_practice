
public class AccountingIfApp {

	public static void main(String[] args) {
		double ValueOfSupply = Double.parseDouble(args[0]);	
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = ValueOfSupply*vatRate;
		double total = ValueOfSupply+ValueOfSupply*0.1;
		double expense = ValueOfSupply*expenseRate;
		double income = ValueOfSupply - ValueOfSupply*expenseRate;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
		if(income > 10000.0) {
		 dividend1 = income * 0.5;
		 dividend2 = income * 0.3;
		 dividend3 = income * 0.2;
		}else {
		 dividend1 = income * 1;
		 dividend2 = income * 0;
		 dividend3 = income * 0;
		}
		System.out.println("Value of supply : "+ ValueOfSupply );				
		System.out.println("VAT : "+VAT );		
		System.out.println("TOTAL : "+total );		
		System.out.println("Expense : "+ expense );
		System.out.println("Income : "+ income );		
		System.out.println("Dividend1 : "+ dividend1 );	
		System.out.println("Dividend2 : "+ dividend2 );		
		System.out.println("Dividend3 : "+ dividend3 );
	}

}
