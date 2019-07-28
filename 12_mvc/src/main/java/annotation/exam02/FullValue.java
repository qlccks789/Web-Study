package annotation.exam02;

public @interface FullValue {
	String type() default "a";
	String name() default "b";
	String value() default "c";
}
