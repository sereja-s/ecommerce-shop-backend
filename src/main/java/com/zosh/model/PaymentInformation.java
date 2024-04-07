package com.zosh.model;

import jakarta.persistence.*;

import java.time.LocalDate;

public class PaymentInformation {

	@Column(name = "cardholder_name")
	private String cardHolderName;

	@Column(name = "card_number")
	private String cardNumber;

	@Column(name = "expiration_date")
	private LocalDate expirationDate;

	@Column(name = "cvv")
	private String cvv;

}