
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double ValueOfSupply = Double.parseDouble(args[0]);	
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = ValueOfSupply*vatRate;
		double total = ValueOfSupply+ValueOfSupply*0.1;
		double expense = ValueOfSupply*expenseRate;
		double income = ValueOfSupply - ValueOfSupply*expenseRate;
		
		
		System.out.println("Value of supply : "+ ValueOfSupply );				
		System.out.println("VAT : "+VAT );		
		System.out.println("TOTAL : "+total );		
		System.out.println("Expense : "+ expense );
		System.out.println("Income : "+ income );		
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		
		int i = 0;
		while(i<dividendRates.length) {
			System.out.println("Dividend : "+ income * dividendRates[i]);
			i = i+1;
		}
		
		
		
			
	}

}

