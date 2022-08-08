package spring.mvc.session12.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import spring.mvc.session12.entity.MyStock;

@Component
public class MyStockValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// 先判斷傳進來的 clazz 是否是 MyClass 類
		return MyStock.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// 基礎驗證
		ValidationUtils.rejectIfEmpty(errors, "symbol", "mystock.symbol.notEmpty");
		ValidationUtils.rejectIfEmpty(errors, "price", "mystock.price.notEmpty");
		ValidationUtils.rejectIfEmpty(errors, "amount", "mystock.amount.notEmpty");
		
		// 進階驗證
		
		
		
	}

	
}
