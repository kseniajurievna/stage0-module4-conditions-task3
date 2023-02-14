package school.mjc.stage0.conditions.task3;
import java.util.logging.Logger;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        Logger logger = Logger.getGlobal();
        if(first % second == 0){
            logger.info("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }
}
