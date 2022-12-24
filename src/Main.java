import habr.vector.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vector v = new Vector(1, 2, 5);
        Vector v2 = new Vector(4, 8, 1);
        System.out.println(VectorService.calcVectorLength(v));
        System.out.println(VectorService.calcScalarProduct(v, v2));
        System.out.println(VectorService.calcVectorProduct(v, v2));
        System.out.println(VectorService.calcAngleBetweenVectors(v, v2));
        System.out.println(VectorService.calcVectorSum(v, v2));
        System.out.println(VectorService.calcVectorDifference(v, v2));
        System.out.println(Arrays.toString(VectorService.generateNVectors(10)));
    }
}