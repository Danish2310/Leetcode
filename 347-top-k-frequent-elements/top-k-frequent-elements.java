class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int n=nums.length;
        int[] ans=new int[k];
        // int l=1;
        Arrays.sort(nums);

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> keys=new ArrayList<>(map.keySet());
        keys.sort((a,b)-> map.get(b)-map.get(a));
        for(int i=0;i<k;i++){
            ans[i]=keys.get(i);
            // i++;
        }

        // int[] an = Arrays.copyOf(ans, k);

        return ans;


        


    // HashMap<Integer,Integer> map=new HashMap<>();
        // HashSet<Integer> set=new HashSet<>(k);
        // int index=0;
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // HashSet<Integer> set=new HashSet<>(map.values);
        // for(int i=0;i<k;i++){
        //     ans[i]=set.get(i)
        // }
        // ans=Arrays.copyof(set);
    }
    }
    // ans[0]=nums[0];
    //         for(int r=1;r<n;r++){
    //             if(nums[l]!=nums[r]){
    //                 if(l<k){
    //                 ans[l]=nums[r];
    //                 l++;
    //                 }
    //                 else{
    //                     return ans;
    //                 }
    //             }
    //         }
    //         return ans;