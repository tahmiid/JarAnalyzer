package ca.concordia.jaranalyzer;

//import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		APIFinder mf = new APIFinderImpl("");
		List<String> imports = new java.util.ArrayList<String>();
		imports.add("org.specs.runner.JUnit");
		Set<MethodInfo> matches = mf.findAllMethods(imports, "initialize", 0);
		System.out.println(matches);
	}

}
