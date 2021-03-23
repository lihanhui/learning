import java.lang.reflect.Method;
public class ClassForNameExample {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("java.awt.Point");
			if(c instanceof java.awt.Point){
				System.out.println("instance of java.awt.Point");
			} 
			System.out.println("name = " + c.getName());
			System.out.println("package = " + c.getPackage());
			Method[] methods = c.getDeclaredMethods();
			System.out.println("----- Class methods ---------------");
			for (Method method : methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
