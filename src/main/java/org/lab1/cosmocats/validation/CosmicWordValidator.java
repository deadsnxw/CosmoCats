package org.lab1.cosmocats.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CosmicWordValidator implements ConstraintValidator<CosmicWordCheck, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.trim().isEmpty()) {
            return true;
        }

        String lowerCaseValue = value.toLowerCase();
        return lowerCaseValue.contains("star") || lowerCaseValue.contains("galaxy") || lowerCaseValue.contains("comet");
    }
}


