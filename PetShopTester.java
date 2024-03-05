class PetShopTester{
public static void main(String sportProducts[]){
	
	System.out.println("owner name is :" + PetShop.ownerName);
	System.out.println("owner address is :" + PetShop.address);
	
	PetShop.addItems("pedegree");
	PetShop.addItems("belt");
	PetShop.addItems("dog biscuits");
	PetShop.addItems("toys");
	PetShop.addItems("cages");
	PetShop.addItems("aquariums");
	PetShop.addItems("treats");
	PetShop.addItems("collars");
	PetShop.addItems("leashes");
	PetShop.addItems("beds");
	
	
	PetShop.getItems();
}
}