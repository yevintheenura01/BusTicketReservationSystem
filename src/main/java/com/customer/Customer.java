package com.customer;

public class Customer {
	private int id;
	private String CardHolderName;
	private String CardNumber;
	private String CVC;
	private String Expiry;
	
	public Customer(int id, String CardHolderName, String CardNumber, String CVC, String Expiry) {
		
		this.id = id;
		this.CardHolderName = CardHolderName;
		this.CardNumber = CardNumber;
		this.CVC = CVC;
		this.Expiry = Expiry;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardHolderName() {
		return CardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		CardHolderName = cardHolderName;
	}

	public String getCardNumber() {
		return CardNumber;
	}

	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}

	public String getCVC() {
		return CVC;
	}

	public void setCVC(String cVC) {
		CVC = cVC;
	}

	public String getExpiry() {
		return Expiry;
	}

	public void setExpiry(String expiry) {
		Expiry = expiry;
	}

	

	

	
	
	
}
