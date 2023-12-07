package com.ltp.workbook31.validation;

import com.ltp.workbook31.Constants;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UsernameValidator implements ConstraintValidator<Username, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {


//        Pattern pattern = Pattern.compile("[^a-z0-9 ]");
//        Matcher matcher = pattern.matcher(value);
//        boolean badCharacters = matcher.find(); //false if characters are a-z or 0-9


        for (char cs : value.toCharArray()) {

            if(Character.isUpperCase(cs)){
                return false;
            }

            for (char c : Constants.SPECIAL_CHARACTERS) {
                if (cs == c) {
                    return false;
                }
            }
        }
        return true;
    }
}
