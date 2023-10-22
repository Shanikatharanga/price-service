package com.priceservice.priceservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
public class PriceController {
		
		List<Price> priceList = new ArrayList<Price>();
		
		WebClient webClient = WebClient.create();

		@GetMapping("/price/details/{productId}")
		public Mono<Price> getPriceDetails(@PathVariable("productId") Long productid) {
			
			Mono<Price> price = Mono.just(getPrice(productid));
			
			
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
			priceList.clear();
			priceList.add(new Price(201L,101L,1999,999));
			priceList.add(new Price(202L,102L,199,99));
			priceList.add(new Price(203L,103L,1999,699));
		}	

}
