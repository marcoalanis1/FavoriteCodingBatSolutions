public int[] copyEvens(int[] nums, int count) {
  int[] evens_Found = new int[count];
  int evens_Counter = 0;
  for (int i = 0; i < nums.length && evens_Counter < evens_Found.length; i++){
   if (nums[i] % 2 == 0){
    evens_Found[evens_Counter] = nums[i];
    evens_Counter += 1;}
   }
   
  return evens_Found;
}