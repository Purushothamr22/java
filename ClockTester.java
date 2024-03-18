class ClockTester{
public static void main(String time[]){
	 
	        /*Clock clock = new Clock();
			clock.displayInfo();
	                clock.brandName = "Sonata";
			clock.shape = "Round";
			clock.price = 1200.00;
			clock.color = "White";
			clock.material = "Metal";
			clock.displayInfo();

			
		Clock clock1 = new Clock();
			clock1.displayInfo();
	                clock1.brandName = "Titan";
			clock1.shape = "Square";
			clock1.price = 1000.00;
			clock1.color = "Gray";
			clock1.material = "Silver";
			clock1.displayInfo();
			
			
		Clock clock2 = new Clock();
			clock2.displayInfo();
			clock2.brandName = "HMT";
			clock2.shape = "Rectangle";
			clock2.price = 1500.00;
			clock2.color = "Blue";
			clock2.material = "Titanium";
			clock2.displayInfo();*/

			
			Clock clock = new Clock("Sonata","Round",1200.00,"White","Metal" );
			clock.watch();
			
			Clock clock1 = new Clock("Titan", "Square",1000.00,"Gray","silver" );
			clock1.watch();
			
			Clock clock2 = new Clock("HMT","Rectangle",1500.00 ,"Blue","Titanium");
			clock2.watch();
	 }
}