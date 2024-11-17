package in.sunnyit;

import java.lang.reflect.Field;

public class Test {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		Class<?> clz = Class.forName("in.sunnyit.User");
		
		Object object = clz.newInstance();
		
		
		Field ageField = clz.getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.set(object, 40);
		
		User u= (User) object;
		int age = u.getAge();
		System.out.println("User Age ::"+age);
		
	}
	
}
