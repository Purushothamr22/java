class Restaurant{

   public static void main(String menu[]){
   
   String restaurantName = "Red Olives multicuisine";
   String restaurantlocation = "Mumbai , India";
   
   String startersMenu[] = {"B.B.Q PANEER","VEG CHEESE KI TIKKI","VEG IN SCHEZEAN SAUCE","MURGH HAZZARE KEBAB","GREEN GARLIC FISH","BREADED CALAMARI"};
   String mainCourseMenu[] = {"VEG JAIPURI","PANEER LABABDAR","VEG VGRATIN","GRILLED CHICKEN BUTTER CHICKEN","MUTTON ROGAN JOSH","FISH IN BASIL CHILLY", "CHICKEN BIRYANI"};
   String dessertsMenu[] = {"LASSI","FRESH CUT FRUITS","GULAB JAMUN","CHEESE CAKE","ICE CREAMS","PASTERIES","RASMALI","JELABI"};
   
   int startersMenuPricing[] = {350,400,300,400,350,400};
   int mainCourseMenuPricing[] = {600,500,600,500,500,650,700};
   int dessertsMenuPricing[] = {250,200,150,200,250,300,350,200};
   
   System.out.println("Restaurant Name : " + restaurantName);
   System.out.println("Restaurant Location : " + restaurantlocation);

   
   System.out.println("Starters avilable are : ");
   
   for(int index = 0;index < startersMenu.length;index++){
   System.out.println(n startersMenu[index] + "-------------------------    " + startersMenuPricing[index]);
   }
 
    System.out.println("Main Course avilable are : ");

   for(int index = 0;index < startersMenu.length;index++){
   System.out.println(  mainCourseMenu[index] + "--------------------------" + mainCourseMenuPricing[index]);
	}
	
   System.out.println("Desserts avilable are : ");

   for(int index = 0;index < startersMenu.length;index++){
   System.out.println(  dessertsMenu[index] + "-----------------------------" + dessertsMenuPricing[index]);
   }
   
   }

}