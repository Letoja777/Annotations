package sample;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		
		DoSomething obj = new DoSomething();
		
        Class<?> cls = DoSomething.class;
        Method[] methods = cls.getDeclaredMethods();
        
        for (Method method:methods) {
            if (method.isAnnotationPresent(Test.class)) {
            	Test test = method.getAnnotation(Test.class);

            	obj.addition(test.a(), test.b());
            	obj.multiplication(test.a(), test.b());
            	}
            }
        }

}