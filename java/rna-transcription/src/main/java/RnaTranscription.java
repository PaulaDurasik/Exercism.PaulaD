import java.util.Scanner;

class RnaTranscription {
    //Scanner scanner = new Scanner(System.in);
    //String InputRna = scanner.nextLine();

    String transcribe(String dnaStrand) {
        StringBuilder strb = new StringBuilder(dnaStrand);
        for (int i=0;i<strb.length();i++) {
            char lit=strb.charAt(i);
            if (lit == 'C')
                strb.replace(i,i+1,"G");
            else if (lit == 'G')
                strb.replace(i,i+1,"C");
            else if (lit == 'T')
                strb.replace(i,i+1,"A");
            else if (lit == 'A')
                strb.replace(i,i+1,"U");
            else
                throw  new IllegalArgumentException("Invalid input");
        }
        return strb.toString();
    }

}
