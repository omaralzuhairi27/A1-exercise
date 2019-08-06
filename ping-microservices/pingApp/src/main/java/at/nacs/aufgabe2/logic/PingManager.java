package at.nacs.aufgabe2.logic;

import at.nacs.aufgabe2.persistence.domain.Ping;
import at.nacs.aufgabe2.persistence.repository.PingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PingManager {

  private final PingRepository pingRepository;

  public Ping call() {
    String uuid = UUID.randomUUID().toString();
    LocalDateTime now=LocalDateTime.now();
    Ping ping = Ping.builder()
                    .id(uuid)
                    .message("PING")
                    .timeStempel(now)
                    .build();
    savaPing(ping);
    return ping;
  }

  public void savaPing(Ping ping){
    pingRepository.save(ping);
  }
}
