package at.nacs.aufgabe2.logic;

import at.nacs.aufgabe2.persistence.domain.Ping;
import at.nacs.aufgabe2.persistence.repository.PingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@RefreshScope
public class PingManager {

  private final PingRepository pingRepository;
  @Value("${dataset.message}")
  private String message;


  public Ping call() {
    String uuid = UUID.randomUUID().toString();
    LocalDateTime now=LocalDateTime.now();
    Ping ping = Ping.builder()
                    .id(uuid)
                    .message(message)
                    .timeStempel(now)
                    .build();
    savaPing(ping);
    return ping;
  }

  private Ping savaPing(Ping ping){
    return pingRepository.save(ping);
  }
}
