package da.springframework.mongostockquoteservice.service;

import da.springframework.mongostockquoteservice.domain.QuoteHistory;
import da.springframework.mongostockquoteservice.model.Quote;
import reactor.core.publisher.Mono;

public interface QuoteHistoryService {

    Mono<QuoteHistory> saveQuoteToMongo(Quote quote);
}
