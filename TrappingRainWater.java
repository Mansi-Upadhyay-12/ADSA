import java.util.*;
public class TrappingRainWater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] height = new int[n];
        for(int i =0 ; i<n ; i++){
            height[i] = sc.nextInt();
        }

        int l=0;
        int r=n-1;
        int leftmax=0;
        int rightmax=0;
        int trappedwater = 0;

        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>=leftmax){
                    leftmax=height[l];
                }
                else{
                    trappedwater += leftmax-height[l];
                }
                l++;
            }
            else{
                if(height[r] >=rightmax){
                    rightmax=height[r];

                }
                else{
                    trappedwater +=rightmax-height[r];
                }
                r--;
            }

          
        }
  System.out.println(trappedwater);
 }
}