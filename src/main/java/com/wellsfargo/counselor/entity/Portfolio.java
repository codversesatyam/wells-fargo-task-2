package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private Long portfolioId;

    @Column(nullable = false)
    private Long clientId;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    public Portfolio(Long portfolioId, Long clientId, LocalDateTime creationDate) {
        this.portfolioId = portfolioId;
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
