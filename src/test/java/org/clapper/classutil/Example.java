package org.clapper.classutil;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 *   Simple annotation to test that 
 *    annotations are picked up correctly
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Example {

	 String exampleStrField();
	 int exampleIntField() default 100;
}
