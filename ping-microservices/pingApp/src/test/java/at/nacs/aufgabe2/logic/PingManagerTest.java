package at.nacs.aufgabe2.logic;

import at.nacs.aufgabe2.persistence.domain.Ping;
import at.nacs.aufgabe2.persistence.repository.PingRepository;
import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;

@SpringBootTest
@ConfigurationProperties("dataset")
class PingManagerTest {


  @MockBean
  PingRepository pingRepository;

  @SpyBean
  PingManager pingManager;

  @Setter
  @Getter
  Ping pingt;

  @Test
  void savaPing() {
    Ping ping = pingManager.savaPing(pingt);
    System.out.println(ping.getId());
    Assertions.assertTrue(ping.getId().equals(" "));
  }
}