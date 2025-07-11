import java.util.List;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class LionAlexTest {
    private LionAlex alex;

    @Mock
    private Feline feline;

    @BeforeEach
    public void createNewInstance() throws Exception {
        alex = new LionAlex(feline);
    }

    @Test
    public void getKittens() {
        int actual = alex.getKittens();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void getFriends() {
        List<String> list = alex.getFriends();
        int actual = list.size();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLiving() {
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";

        assertEquals(expected, actual);
    }

    @Test
    public void lionAlexIsCreate() {
        boolean actual = alex.doesHaveMane();

        assertTrue(actual);
    }
}