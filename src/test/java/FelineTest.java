import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void eatMeatVerify() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyFeline() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensOneAmount() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensCount() {
        feline.getKittens(1);
        Assert.assertEquals(1, feline.getKittens());
    }
}
