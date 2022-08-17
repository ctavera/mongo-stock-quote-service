package da.springframework.mongostockquoteservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document
public class QuoteHistory {

    @Id
    private String id;
    private String ticker;
    private BigDecimal price;
    private Instant instant;
}
