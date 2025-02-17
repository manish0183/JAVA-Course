// O(n^2)
class Solution {
    public static int[] twoSum(int nums[], int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{}; 
    }
}

// O(N) Time & O(N) Space : Hashmap to check another no
// class Solution {
//     public static int[] twoSum(int nums[], int target) {
//         HashMap <Integer,Integer> map = new HashMap<>();
//         int ans[] = new int[2];
//         for(int i=0; i<nums.length; i++){
//             int num = nums[i];
//             int need = target - num;
//             if(map.containsKey(need)){
//                 ans[0] = map.get(need);
//                 ans[1] = i;
//                 return ans;
//             }else{
//                 map.put(num, i);
//             }
//         }

//         return ans;
//     }
// }


// O(n * log n)  to sort the array
// and then apply 2 pointer 
 