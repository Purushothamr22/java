class StationaryTester{
public static void main(String sportProducts[]){
	
	System.out.println("owner name is :" + Stationary.ownerName);
	System.out.println("owner address is :" + Stationary.address);
	
	Stationary.addProducts("book");
	Stationary.addProducts("pen");
	Stationary.addProducts("cap");
	Stationary.addProducts("pencil");
	Stationary.addProducts("scale");
	Stationary.addProducts("sticky notes");
	Stationary.addProducts("crayon");
	Stationary.addProducts("sketch pens");
	Stationary.addProducts("marker");
	Stationary.addProducts("charts");
	
	
	Stationary.getProducts();
}
}