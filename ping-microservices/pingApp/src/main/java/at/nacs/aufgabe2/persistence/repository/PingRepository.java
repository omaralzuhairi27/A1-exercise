package at.nacs.aufgabe2.persistence.repository;


import at.nacs.aufgabe2.persistence.domain.Ping;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PingRepository extends MongoRepository<Ping,String> {
}
