class SupplimentsTester{
public static void main(String Products[]){
	
	System.out.println("owner address is :" + Suppliments.address);
	
	Suppliments.addProducts("omega-3");
	Suppliments.addProducts("vitamin capsule");
	Suppliments.addProducts("protein");
	Suppliments.addProducts("keratin");
	Suppliments.addProducts("aura nutrition");
	Suppliments.addProducts("groviva");
	Suppliments.addProducts("360 gut");
	Suppliments.addProducts("probotics gut");
	Suppliments.addProducts("bcaa powder");
	Suppliments.addProducts("healthy-u");
	
	
	Suppliments.getProducts();
}
}