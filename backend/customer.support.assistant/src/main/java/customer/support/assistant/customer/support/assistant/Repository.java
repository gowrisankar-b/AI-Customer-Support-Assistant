package customer.support.assistant.customer.support.assistant;

import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Logs, Long> {
}
