package org.clapper.classutil;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 *   Simple Method annotation to test that 
 *    annotations are picked up correctly
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodExample {
   String methodStrField();
   int methodIntField() default 200;
}
