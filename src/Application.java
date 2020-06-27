
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// boolean variables
		
		
		boolean isHotOutside = true;
		
		if (isHotOutside == true) {
			System.out.println("It's a scorcher today");
		} else {
			System.out.println("Not bad weather we're having");
		}
		
		
		boolean isWeekday = true;
		
		if (isWeekday == true) {
			System.out.println("It's a school day");
		} else {
			System.out.println("Yay! It's the weekend");
		}

	
		boolean hasMoneyInPocket = false;
		
		if (hasMoneyInPocket == true) {
			System.out.println("I have money in my pocket");
		} else {
			System.out.println("My pockets are empty");
		}
		
		
		// variables (non-boolean)
		
				double costOfMilk = 2.85;
				double moneyInWallet = 6.50;
				int thirstLevel = 2; // on a scale of 1-10


		//scenarios
				
		boolean  shouldBuyIceCream = isHotOutside && hasMoneyInPocket; 
		System.out.println(shouldBuyIceCream);	
				
		if (shouldBuyIceCream == true) {
			System.out.println("I should buy ice cream");
			} else {
				System.out.println("No ice cream today");
			}
		
		
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println(willGoSwimming);
		
		if (willGoSwimming == true) {
			System.out.println("Let's swim");
			} else {
				System.out.println("No swimming today");
			}
		
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		System.out.println(isAGoodDay);
		
		if (isAGoodDay == true) {
			System.out.println("It's a good day");
			} else {
				System.out.println("Today is okay");
			}
		
		
		boolean willBuyMilk = (moneyInWallet >= (2*costOfMilk)) && 
				isHotOutside && (thirstLevel >3);
				System.out.println(willBuyMilk);
				
		if (willBuyMilk == true) {
			System.out.println("Let's buy some milk");
			} else {
			    System.out.println("No Milk today");
			}
				
		
	}

}




