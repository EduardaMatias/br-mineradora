package org.br.mineradora.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.br.mineradora.entity.QuotationEntity;


@ApplicationScoped // insere dentro do escopo de classes que serão gerenciadas pelo framework quarkus
public class QuotationRepository implements PanacheRepository<QuotationEntity> {}
