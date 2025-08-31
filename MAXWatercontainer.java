import java.util.*;
public class MAXWatercontainer{
  public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int[] height = new int[n];
 for(int i = 0; i < n; i++){
    height[i]= sc.nextInt();
     }

int l=0;
int r = n-1;
int maxarea = 0;

while(l<r){
   int area = Math.min(height[l],height[r])*(r-l);
   if (area>maxarea){
    maxarea= area;
   }

   if(height[l]<height[r]){
    l++;
   }

   else{
    r--;
   }
}
  System.out.println(maxarea);
   
  }}