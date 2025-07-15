package com.supportops.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.supportops.model.Ticket;
import com.supportops.repository.TicketRepository;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketRepository ticketRepository;

    public TicketController(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
}
