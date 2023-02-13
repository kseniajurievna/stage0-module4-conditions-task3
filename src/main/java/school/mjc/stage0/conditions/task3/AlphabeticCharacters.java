package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if((character >='a' && character <='z') || (character >='A' && character <='Z')){
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }

    }
}
