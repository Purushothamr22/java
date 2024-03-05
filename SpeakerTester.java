class SpeakerTester{
public static void main(String skc[]){
	
  boolean isConnected = Speaker.onOrOff();
   System.out.println("finally speaker is connected : " + isConnected);
   Speaker.increaseVolume();
   Speaker.decreaseVolume();
   
   
  boolean isConnected1 = Speaker.onOrOff();
   System.out.println("finally speaker is connected : " +  isConnected1);
   
}

} 