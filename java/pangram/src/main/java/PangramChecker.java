import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase().trim();//usumwamy znaki i robimy litery od małek
        if (input.length() < 26)//określamy jeżeli ilość znaków w stringu jest mniejsza od ilości liter w alfabecie to rozwiązanie jest nieprawidłowe
            return false;
        else {
            for (char i = 'a'; i <= 'z'; i++) {//char od a do z
                if (input.indexOf(i) < 0) {//indexOf zwraca pozycję znaku// w tym przydaku kiedy nie będzie takiego znaku zwróci -1
                    return false;
                }
            }
        }
        return true;
    }
}



