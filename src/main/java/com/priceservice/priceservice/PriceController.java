package com.priceservice.priceservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
		
		List<Price> priceList = new ArrayList<Price>();

		@GetMapping("/price/details/{productId}")
		public Price getPriceDetails(@PathVariable("productId") Long productid) {
			
			Price price = getPrice(productid);
			
			return price;
		}

		private Price getPrice(Long productid) {
			populatePriceList();
			for(Price p : priceList) {
				if(productid.equals(p.getProductId())) {
					return p;
				}
			}
			return null;
		}

		private void populatePriceList() {
			priceList.add(new Price(201L,101L,1999,999));
			priceList.add(new Price(202L,102L,199,99));
			priceList.add(new Price(203L,103L,1999,699));
		}	

}