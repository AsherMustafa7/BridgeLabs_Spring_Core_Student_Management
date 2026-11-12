
package com.asher.Student_management.Validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;

@Constraint(validatedBy = DepartmentValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDepartment {

    String message() default "Invalid department";

    Class<?>[] groups() default {};

    Class<? extends jakarta.validation.Payload>[] payload() default {};
}
