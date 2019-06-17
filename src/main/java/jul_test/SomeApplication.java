package jul_test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SomeApplication {

    public static void main(String[] args) {
        boolean storeStrongLinkDuringConfigurationProcess = false; // try true/false

        Log log = null;
        if (storeStrongLinkDuringConfigurationProcess) {
            log = LogFactory.getLog(SomeApplication.class);
        }

        SpringApplication.run(SomeApplication.class, args);

        if (log != null) {
            log = null;
        }
    }

}
