package com.app.reactivestack.messages.service;

import com.app.reactivestack.messages.domain.Message;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MessageService {
    Mono<Message> save(Message message);

    Mono<Message> delete(String id);

    Mono<Message> update(String id, Message message);

    Flux<Message> findByThreadId(String threadId);

    Flux<Message> findAll();

    Mono<Message> findById(String id);
}
