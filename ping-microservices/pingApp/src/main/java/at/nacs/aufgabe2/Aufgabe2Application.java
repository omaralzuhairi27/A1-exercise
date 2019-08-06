package at.nacs.aufgabe2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Aufgabe2Application {

  public static void main(String[] args) {
    SpringApplication.run(Aufgabe2Application.class, args);
  }

}
