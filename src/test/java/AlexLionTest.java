import com.example.AlexLion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AlexLionTest {

    @Test
    public void getKittensAmount() throws Exception {
        AlexLion alexLion = new AlexLion();
        Assert.assertEquals(0, alexLion.getKittens());
    }

    @Test
    public void getFriendsVerify() throws Exception {
        AlexLion alexLion = new AlexLion();
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), alexLion.getFriends());
    }

    @Test
    public void getPlaceOfLivingNewYork() throws Exception {
        AlexLion alexLion = new AlexLion();
        Assert.assertEquals("Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }
}
