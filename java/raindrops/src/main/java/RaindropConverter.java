class RaindropConverter {

    String convert(int number) {
        StringBuilder numbe = new StringBuilder();
        if (number % 3 == 0)
            numbe.append("Pling");

        if (number % 5 == 0)
            numbe.append("Plang");

        if (number % 7 == 0)
            numbe.append("Plong");

        if (numbe.length() < 1)
            numbe.append(number);

        return numbe.toString();
    }

}


