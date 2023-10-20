package com.priceservice.priceservice;

public class Price {

	private Long priceId;
	private Long productId;
	private Integer originalPrice;
	private Integer discountPrice;

	public Long getPriceId() {
		return priceId;
	}

	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Integer originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Integer getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Integer discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Price(Long priceId, Long productId, Integer originalPrice, Integer discountPrice) {
		super();
		this.priceId = priceId;
		this.productId = productId;
		this.originalPrice = originalPrice;
		this.discountPrice = discountPrice;
	}

	public Price() {
		super();
	}

}
