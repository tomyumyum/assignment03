/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: PascalsTriangleGenerator.java
 * Author: Java Foundation
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment03PartD;

public class PascalsTriangleGenerator {

    public PascalsTriangleGenerator() {
    }

    public int[] computeRow(int rowToCompute) {
        int[] value = new int[rowToCompute];

        for (int i = 0; i < rowToCompute; i++) {
            value[i] = pascalValue(rowToCompute -1,i);
        }
        return value;
    }
    private int pascalValue(int start, int end){
        if (end == 0){
            return 1;
        }
        else if (end == start) {
            return 1;
        }
        else {
            return pascalValue(-1,1) + pascalValue(start -1, end);
        }
    }
}
