package com.customannotation;


import com.customannotation.enums.ProblemTag;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ProblemCategory {
    ProblemTag[] value(); // Multiple categories
}
