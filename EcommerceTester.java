class EcommerceTester{
public static void main(String sportProducts[]){
	
	System.out.println("application name is :" + Ecommerce.appName);
	
	Ecommerce.addProducts("mobile");
	Ecommerce.addProducts("laptop");
	Ecommerce.addProducts("pendrive");
	Ecommerce.addProducts("sd card");
	Ecommerce.addProducts("hard disk");
	Ecommerce.addProducts("ssd");
	Ecommerce.addProducts("ethnic ware");
	Ecommerce.addProducts("shoes");
	Ecommerce.addProducts("casual wear");
	Ecommerce.addProducts("denim ware");
	
	
	Ecommerce.getProducts();
}
}