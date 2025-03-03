package Daily_Leet_Code;

public class ContainerWithMostWater11 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
           
            int water = Math.min(height[left], height[right]) * (right - left);
            maxWater = Math.max(maxWater, water);


            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));

    }
}
