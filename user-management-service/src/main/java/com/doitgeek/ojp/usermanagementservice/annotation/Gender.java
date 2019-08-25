package com.doitgeek.ojp.usermanagementservice.annotation;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Validates given gender. Gender must be 'M' => Male OR 'F' => Female OR 'O' => Others.
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GenderValidator.class)
@Documented
public @interface Gender {
    String message() default "Gender must be valid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        Gender[] value();
    }
}

class GenderValidator implements ConstraintValidator<Gender, Character> {
    @Override
    public boolean isValid(Character gender, ConstraintValidatorContext context) {
        if(gender == null)
            return true;
        return gender.equals('M') || gender.equals('F') || gender.equals('O');
    }

    @Override
    public void initialize(Gender constraintAnnotation) {

    }
}