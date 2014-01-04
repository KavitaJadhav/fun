public class HelloWorld{
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.sayHello(args[0]);
	}
}
class Greeter{
	public void sayHello(String name){
		System.out.println("Hello "+name);
	}
}
