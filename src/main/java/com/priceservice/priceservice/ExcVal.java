package com.priceservice.priceservice;

public class ExcVal {

	private Long exValId;
	private Currencies from;
	private Currencies to;
	private Integer exVal;

	public Long getExValId() {
		return exValId;
	}

	public void setExValId(Long exValId) {
		this.exValId = exValId;
	}

	public Currencies getFrom() {
		return from;
	}

	public void setFrom(Currencies from) {
		this.from = from;
	}

	public Currencies getTo() {
		return to;
	}

	public void setTo(Currencies to) {
		this.to = to;
	}

	public Integer getExVal() {
		return exVal;
	}

	public void setExVal(Integer exVal) {
		this.exVal = exVal;
	}

	public ExcVal(Long exValId, Currencies from, Currencies to, Integer exVal) {
		super();
		this.exValId = exValId;
		this.from = from;
		this.to = to;
		this.exVal = exVal;
	}

	public ExcVal() {
		super();
	}

}
