package Leetcode; 
public class MinimumDistance {
        public int minimumDistance(int[] nums) {
        // int ans = Integer.MAX_VALUE;
        // int n = nums.length;
        // if(n<=2) return -1;
        // for(int i=0;i<n;i++)
        //     for(int j=i+1;j<n;j++)
        //         if(nums[i]==nums[j])
        //             for(int k=j+1;k<n;k++)
        //                 if(nums[j]==nums[k])
        //                     ans = Math.min(ans,2*(k-i));
        // return ans == Integer.MAX_VALUE?-1:ans; 
        int len = nums.length;
        int[] last2 = new int[len];
        int res = 200;

        for (int i = 0; i < len; i++) {
            int val = nums[i] - 1;
            int pos = i + 1, pack = last2[val];
            int old = pack & 255, cur = pack >> 8;

            last2[val] = cur | (pos << 8);

            if (old > 0)
                res = Math.min(res, (pos - old) << 1);
        }

        return res == 200 ? -1 : res;
    } 
    public static void main(String[] args){

    }
}
