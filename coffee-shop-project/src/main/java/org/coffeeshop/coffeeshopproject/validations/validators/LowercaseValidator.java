package org.coffeeshop.coffeeshopproject.validations.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.coffeeshop.coffeeshopproject.validations.constraint.Lowercase;

public class LowercaseValidator implements ConstraintValidator<Lowercase, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null) return true;
        return value.equals( value.toLowerCase() );
    }
}
