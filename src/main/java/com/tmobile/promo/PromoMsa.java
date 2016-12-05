package com.tmobile.promo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class PromoMsa {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    

    @RequestMapping(value="/{promoId}", method=RequestMethod.GET)
    ResponseEntity<Promo> getInfo(@PathVariable String promoId) {
    	Promo promo=new Promo();
    	promo.setPromoId(promoId);
    	promo.setPromoCode("333");
        return new ResponseEntity<Promo>(promo, HttpStatus.OK);
    }
    
    @RequestMapping(value="/enroll", method=RequestMethod.POST)
    ResponseEntity<Promo> enroll(@RequestBody Promo promo) {
        return new ResponseEntity<Promo>(promo, HttpStatus.OK);
    }
}
