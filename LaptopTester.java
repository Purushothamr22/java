class LaptopTester{
public static void main(String system[]){
System.out.println("main started");

/*Laptop laptop = new Laptop();
Laptop.computer();
Laptop.brandName = "Samsung";
Laptop.price = 30000.00;
Laptop.color = "Black";
Laptop.computer();

Laptop laptop1 = new Laptop();
Laptop.computer();
Laptop.brandName = "HP";
Laptop1.price = 40000.00;
Laptop2.color = "White";
Laptop.computer();

Laptop laptop2 = new Laptop();
Laptop.computer();
Laptop.brandName = "Asus";
Laptop2.price = 39000.00;
Laptop2.color = "Blue";
Laptop.computer();*/

Laptop laptop  = new Laptop("Samsung", 30000.00,"Black");
laptop.computer();
	   

Laptop laptop1  = new Laptop("HP", 40000.00,"White");
laptop1.computer();
	   
	   
Laptop laptop2  = new Laptop("Asus", 39000.00,"Blue");
laptop2.computer();

}
}