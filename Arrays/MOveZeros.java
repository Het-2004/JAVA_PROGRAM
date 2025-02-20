class moveZeroes {
    public void moveZeroes(int[] nums) {
        
        int n = nums.length; 

        int i = 0; // place positive number
        int j = 0; // move in array 

        // STEP 1 - MOVE positive elements at the start 
        while(j < n)
        {
            if(nums[j] != 0)
            {
                nums[i] = nums[j];
                i++;
            }

            j++;
        }

        // STEP 2 - Move zero's at the end 
        while(i < n)
        {
            nums[i] = 0;
            i++;
        }
    }
}