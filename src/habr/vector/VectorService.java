package habr.vector;

public class VectorService {
    public static double calcVectorLength(Vector vector){
        return Math.sqrt(vector.getX() * vector.getX() + vector.getY() * vector.getY() + vector.getZ() * vector.getZ());
    }

    public static double calcScalarProduct(Vector vector, Vector vector2){
        return vector.getX() * vector2.getX() + vector.getY() * vector2.getY() + vector.getZ() * vector2.getZ();
    }

    public static Vector calcVectorProduct(Vector vector, Vector vector2){
        return new Vector(
                vector.getZ() * vector2.getX() - vector.getX() * vector2.getZ(),
                vector.getY() * vector2.getZ()- vector.getZ() * vector2.getY(),
                vector.getX() * vector2.getY() - vector.getY() * vector2.getX());
    }

    public static double calcAngleBetweenVectors(Vector vector, Vector vector2){
        return calcScalarProduct(vector, vector2) / (calcVectorLength(vector) * calcVectorLength(vector2));
    }

    public static Vector calcVectorSum(Vector vector, Vector vector2){
        return new Vector(
                vector.getX() + vector2.getX(),
                vector.getY() + vector2.getY(),
                vector.getZ() + vector2.getZ());
    }

    public static Vector calcVectorDifference(Vector vector, Vector vector2){
        return new Vector(
                vector.getX() - vector2.getX(),
                vector.getY() - vector2.getY(),
                vector.getZ() - vector2.getZ());
    }

    public static Vector[] generateNVectors(int n){
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
}
