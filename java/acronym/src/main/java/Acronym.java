class Acronym {

    private final String phrase;

    Acronym(String phrase) {

        this.phrase = phrase;
    }

    String get() {
        StringBuilder acronym = new StringBuilder();
        String[] acr = phrase.split("[\\W+]");
        for (String a : acr) {
            if (!a.isEmpty()) {
                acronym.append(a.substring(0, 1));
            }


        }
        return acronym.toString().toUpperCase();

    }
}
