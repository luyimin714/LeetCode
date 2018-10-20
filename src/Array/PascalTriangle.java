package Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0)
            return triangle;
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int i = 1; i < numRows; i++){
            List<Integer> row = new LinkedList<>();
            List<Integer> uprow = triangle.get(i-1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(uprow.get(j) + uprow.get(j-1));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }

//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> triangle = new LinkedList<>();
//        for (int i = 0; i < numRows; i++){
//            List<Integer> row = new LinkedList<>();
//            if(i > 0) {
//                List<Integer> uprow = triangle.get(i-1);
//                for (int j = 0; j <= i; j++) {
//                    if (j > 0 && j < i) {
//                        row.add(uprow.get(j) + uprow.get(j-1));
//                    } else {
//                        row.add(1);
//                    }
//                }
//                triangle.add(row);
//            }
//            else triangle.add(Arrays.asList(1));
//        }
//        return triangle;
//    }
}
