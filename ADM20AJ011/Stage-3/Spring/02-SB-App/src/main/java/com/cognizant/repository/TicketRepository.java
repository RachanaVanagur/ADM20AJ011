package com.cognizant.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TicketRepository {
	public TicketRepository() {
		System.out.println("--- TicketRepository :: Constructor -----");
	}
}
