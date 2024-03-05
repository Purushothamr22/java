class MedicalShopTester{
public static void main(String sportProducts[]){
	
	System.out.println("owner name is :" + MedicalShop.ownerName);
	System.out.println("owner address is :" + MedicalShop.address);
	
	MedicalShop.addProducts("medical instruments");
	MedicalShop.addProducts("needles and syringes");
	MedicalShop.addProducts("dressings");
	MedicalShop.addProducts("anaesthesia supplies");
	MedicalShop.addProducts("sterilization");
	MedicalShop.addProducts("disinfectants");
	MedicalShop.addProducts("dialysis supplies");
	MedicalShop.addProducts("gloves");
	MedicalShop.addProducts("hearing aids");
	MedicalShop.addProducts("mask");
	
	
	MedicalShop.getProducts();
}
}