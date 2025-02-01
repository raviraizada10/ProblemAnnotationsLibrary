package com.customannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to store problem-related information.
 * It holds the problem link, problem number, and solution link.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ProblemInfo {
    String problemLink();
    String problemNumber();
    String solutionLink();
}