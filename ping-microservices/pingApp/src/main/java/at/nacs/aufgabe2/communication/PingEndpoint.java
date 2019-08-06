package at.nacs.aufgabe2.communication;


import at.nacs.aufgabe2.logic.PingManager;
import at.nacs.aufgabe2.persistence.domain.Ping;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
@RequiredArgsConstructor
public class PingEndpoint {

  private final PingManager pingManager;

  @GetMapping
  Ping get() {
    return pingManager.call();
  }

}
