package br.com.rinhabackend.domain.model;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.data.annotation.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Introspected
@MappedEntity
public record Transaction(@Id @AutoPopulated @Nullable @MappedProperty("id") UUID id, Integer amount, TransactionType type, String description, @DateCreated LocalDateTime createdAt, @Nullable @Relation(Relation.Kind.MANY_TO_ONE) @MappedProperty("client_id") Client client) {
    public Transaction(Integer amount, TransactionType type, String description, Client client) {
        this(null, amount, type, description, null, client);
    }
}
