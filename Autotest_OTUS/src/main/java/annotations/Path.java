package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // эти метаданные я хочу получать в рантайме (когда я запускаю мои тесты)
@Target(ElementType.TYPE) // эту аннотацию я буду вешать на тип (на Класс)
public @interface Path {
    String value() default "";
}
