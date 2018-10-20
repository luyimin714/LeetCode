package Array;

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r){
            maxarea = Math.max(Math.min(height[l],height[r]) * (r-l), maxarea);
            if (height[l] < height[r])
                l++;
            else r--;
        }
        return maxarea;
    }
//        int N = height.length;
//
//        int[][] areas = new int[N][N];
//        for (int i = 0; i < N; i++)
//            for (int j = i; j < N; j++)
//                areas[i][j] = Math.min(height[i],height[j]) * Math.abs(i - j);
//
//        int MAX = 0;
//        for (int i = 0; i < N; i++)
//            for (int j = i; j < N; j++)
//                MAX = Math.max(areas[i][j],MAX);
//        return MAX;
//        int maxarea = 0, l = 0, r = height.length - 1;
//        while (l < r){
//            maxarea = Math.max(Math.min(height[l],height[r]),maxarea) * (r-l);
//            if (height[l] < height[r])
//                l++;
//            else r--;
//        }
//        return maxarea;
//    }

}