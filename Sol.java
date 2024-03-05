class Sol {
    public static void main(String ind[]) {
        array();
    }

    public static void array() {
        int arr1[] = {1,2,3,4,5,6};
        int target = 10 ;

 for (int i = 0; i < arr1.length; i++) {
  for (int j = i + 1; j < arr1.length; j++) {
  if (arr1[i] + arr1[j] == target) {
 System.out.println(i + " , " + j);
   }
  }
  }
 }
}
