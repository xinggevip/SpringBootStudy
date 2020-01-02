import com.qiangssvip.Application;
import com.qiangssvip.config.MyProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MyPropertiesTest {
    @Autowired
    private MyProperties myProperties;

    @Test
    public void test(){
        System.out.println(myProperties);
    }
}
