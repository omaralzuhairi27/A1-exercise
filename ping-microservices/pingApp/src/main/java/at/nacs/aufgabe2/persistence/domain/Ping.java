package at.nacs.aufgabe2.persistence.domain;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
public class Ping {
  private String id;
  private String message;
  private LocalDateTime timeStempel;


}
