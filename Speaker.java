class Speaker{
static boolean isConnected ;
static int maxVolume= 10;
static int presentVolume=5;
static int minVolume;


   public static boolean onOrOff(){
   
   System.out.println("inside onOrOff methord");
    if(isConnected== false){
	  isConnected = true;
	  System.out.println("the speaker is connected : " + isConnected);
	}
   else if(isConnected== true){
   isConnected= false;
   System.out.println("the speaker is connected : " + isConnected);

   }
   return isConnected;
   }
   
    public static void increaseVolume(){
		System.out.println("inside increaseVolume() " );
		if(isConnected==true){
			if(presentVolume<maxVolume){
				presentVolume=presentVolume+1;
				System.out.println("the volume is : " + presentVolume);
			}
			else{
			System.out.println("the maxVolume reached " );
			}
		}
		else{
			System.out.println("the device is off ");
		}
		System.out.println("end of increaseVolume() " );
		return ;
	}   
   
	public static void decreaseVolume(){
		System.out.println("Inside decreaseVolume()");
		if(isConnected== true){
			if(presentVolume>minVolume){
				presentVolume= presentVolume-1;
				System.out.println("the presentVolume is : "+presentVolume);
			}
			else{
				System.out.println("Minimum Value reached");
			}
		}
		else {
			System.out.println("The Device is off");
		}
		System.out.println("end of decreaseVolume()");
		return ;
	}
}




