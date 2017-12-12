class DifferenceOfSquaresCalculator {
    int computeSquareOfSumTo(int input) {
        int sumSquare=0;
        for (int i = 0; i <=input ; i++) {
            sumSquare+=i;


        }return sumSquare*sumSquare;
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquare=0;
        for (int i = 0; i <=input ;i++) {
            sumOfSquare+=i*i;

        } return sumOfSquare;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input)-computeSumOfSquaresTo(input);
    }

}