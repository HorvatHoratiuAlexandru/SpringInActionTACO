package com.horatiu.TacoApp.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

@Data
public class TacoOrder {
	
	private static final long seriaVersionUID = 1L;
	private long id;
	private Date PlacedAt;
	
	@NotBlank(message="Delivery name is required")
	private String deliveryName;
	@NotBlank(message="Delivery name is required")
	private String deliveryStreet;
	@NotBlank(message="Delivery name is required")
	private String deliveryCity;
	@NotBlank(message="Delivery name is required")
	private String deliveryState;
	@NotBlank(message="Delivery name is required")
	private String deliveryZip;
	@CreditCardNumber(message="Not a valid credit card number")
	private String ccNumber;
	@Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$"
			, message ="Must be formatted MM/YY")
	private String ccExpiration;
	@Digits(integer=3, fraction=0, message="Invalit CVV")
	private String ccCVV;
	
	private List<Taco> tacos = new ArrayList<>();
	
	public void addTaco(Taco taco) {
		this.tacos.add(taco);
	}

}
