package customer.support.assistant.customer.support.assistant;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "chat_logs")
@Data
@NoArgsConstructor
public class Logs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String query;

    @Column(columnDefinition = "TEXT")
    private String response;

    @Column(name = "input_type", length = 20)
    private String inputType;

    private LocalDateTime timestamp;
}
