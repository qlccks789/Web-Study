package annotation.exam03;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//@Target(value=ElementType.TYPE)
@Target({
	ElementType.TYPE,
	ElementType.FIELD,
	ElementType.METHOD,
	ElementType.PARAMETER
})
public @interface MyTarget {

}




