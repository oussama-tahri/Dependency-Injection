package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    Calcul calcul;

    @Test
    public void testSomme(){
        calcul = new Calcul();
        double a = 5; double b = 5;
        double expected = 10;
        double results = calcul.somme(a,b);

        Assert.assertTrue("it should be equals", results == expected);
    }
}
