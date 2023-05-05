import org.junit.Test;
import spi.Robot;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ServiceLoader;


/**
 * @ClassName:JavaSPITest
 * @author:jirumutu
 * @date:10/01/2020
 * @description:TODO
 **/
public class JavaSPITest {
    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        //serviceLoader.forEach(Robot::sayHello);

        LocalDateTime date = LocalDateTime.now();
        String formatDate = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(formatDate);
    }
}
