package br.com.rinhabackend.infraestructure.rest.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;

@Serdeable
@Introspected
public record CreateTransactionResponse(@JsonProperty("limite") Integer limit, @JsonProperty("saldo") Integer balance) {
}
