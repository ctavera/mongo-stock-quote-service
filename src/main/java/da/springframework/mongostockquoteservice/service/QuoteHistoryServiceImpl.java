package da.springframework.mongostockquoteservice.service;

import da.springframework.mongostockquoteservice.domain.QuoteHistory;
import da.springframework.mongostockquoteservice.model.Quote;
import da.springframework.mongostockquoteservice.repositories.QuoteHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class QuoteHistoryServiceImpl implements QuoteHistoryService {

    private final QuoteHistoryRepository quoteHistoryRepository;

    @Override
    public Mono<QuoteHistory> saveQuoteToMongo(Quote quote) {
        return quoteHistoryRepository.save(QuoteHistory.builder()
                .ticker(quote.getTicker())
                .price(quote.getPrice())
                .instant(quote.getInstant())
                .build());
    }
}
