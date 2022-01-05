package ibf2021.d11.day11;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class Day11Application {


        public static void main(String[] args) {
            SpringApplication app = new SpringApplication(Day11Application.class);
            String port = "8000";
            ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
            if (cliOpts.containsOption("port")) {
                port = cliOpts.getOptionValues("port").get(0); // get the first value
            }
            if (System.getenv("PORT")!=null){
                port = System.getenv("PORT");
            }
            app.setDefaultProperties( Collections.singletonMap("server.port", port));
            System.out.printf("Application started on port %s\n",port);
            app.run(args);
        }
    }


