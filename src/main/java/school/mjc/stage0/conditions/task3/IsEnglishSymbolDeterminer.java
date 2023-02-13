package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if(symbol == 'a' || symbol == 'e' || symbol == 'i' ||
                symbol == 'o' || symbol == 'u' || symbol == 'A' ||
                symbol == 'E' || symbol == 'I' || symbol == 'O' ||
                symbol == 'U'){
            System.out.println("Vowel");
        }
        else if ((symbol >='a' && symbol <='z') || (symbol >='A' && symbol <='Z')){
            System.out.println("Consonant");
        } else{
            System.out.println("wrong alphabet!");
        }
    }
}
