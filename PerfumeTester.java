class PerfumeTester{
public static void main(String clothCollection[]){
System.out.println("main started");
/*Perfume perfume = new Perfume();
perfume.design();
perfume.brandName = "Bella vita";
perfume.price = 100.00;
perfume.type = "liquid";
perfume.design();

Perfume perfume1 = new Perfume();
perfume1.design();
perfume1.brandName = "Beardo";
perfume1.price = 200.00;
perfume1.type = "gas";
perfume1.design();

Perfume perfume2 = new Perfume();
perfume2.design();
perfume2.brandName = "Fogg";
perfume2.price = 300.00;
perfume2.type = "liquid";
perfume2.design();*/
Perfume perfume  = new Perfume("Bella vita",100.00,"liquid");
perfume.design();
	   

Perfume perfume1  = new Perfume("Beardo",200.00,"gas");
perfume1.design();
	   
	   
Perfume perfume2  = new Perfume("Fogg",300.00,"liquid");
perfume2.design();

}
}