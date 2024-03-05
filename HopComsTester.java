class HopComsTester{
public static void main(String fruits[]){
	
	System.out.println("owner name is :" + HopComs.ownerName);
	System.out.println("owner address is :" + HopComs.address);
	
	
	HopComs.addFruits("apple");
	HopComs.addFruits("orange");
	HopComs.addFruits("Watermelon");
	HopComs.addFruits("musk melon");
	HopComs.addFruits("mango");
	HopComs.addFruits("grape");
	HopComs.addFruits("butter fruit");
	HopComs.addFruits("jackfruit");
	HopComs.addFruits("tomato");
	HopComs.addFruits("pomogranate");
	
	
	HopComs.getFruits();
}
}