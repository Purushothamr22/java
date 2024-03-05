class DecathlonTester{
public static void main(String sportProducts[]){
	
	System.out.println("owner name is :" + Decathlon.ownerName);
	System.out.println("owner address is :" + Decathlon.address);
	
	Decathlon.addProducts("cycle");
	Decathlon.addProducts("sport shoes");
	Decathlon.addProducts("scate board");
	Decathlon.addProducts("cricket bat");
	Decathlon.addProducts("football");
	Decathlon.addProducts("basketball");
	Decathlon.addProducts("cricket ball");
	Decathlon.addProducts("tents");
	Decathlon.addProducts("t-shirts");
	Decathlon.addProducts("trekking shoes");
	
	
	Decathlon.getProducts();
}
}