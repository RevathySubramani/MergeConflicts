package Configuration;

public class LearnConfigProperties {

	public static void main(String[] args) {
		System.out.println(ConfigurationManager.configuration().getURL()); //using the class, calling the interface to get the property values
		System.out.println(ConfigurationManager.configuration().timeOut());

	}
}
