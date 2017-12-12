public class Hamming {

    private final String leftStrand;
    private final String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand=leftStrand;
        this.rightStrand=rightStrand;
        if(leftStrand.length()!=rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
        int distance=0;
        for ( int i = 0; i <leftStrand.length() ; i++) {
            if(leftStrand.charAt(i)!=rightStrand.charAt(i)){
                distance++;
            }

        }return distance;
    }

}
