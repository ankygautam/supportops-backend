package com.supportops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.supportops.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
