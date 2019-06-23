package com.exceptionhandling.error.validator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class AuthorValidator implements ConstraintValidator<Author, String> {

    List<String> authors = Arrays.asList("Rama Raja", "Anil Suram", "Dannarapu ", "Srikanth");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        return authors.contains(value);

    }
}