
package sample;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	public int a();

	public int b();

}