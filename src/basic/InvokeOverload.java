package basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class InvokeOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<?>[] collections = {new HashSet<String>(), new ArrayList<String>(),new HashMap<String,String>().values()};
		printDriver pd = new printDriver();
		for(Collection<?> collection : collections) {
			System.out.println(pd.getType(collection));
		}
	}

}

class printDriver{
	public String getType(Collection<?> collections) {
		return "Super:collection";
	}
	public String getType(ArrayList<?> collections) {
		return "Super:ArrayList";
	}
	public String HashSet(Collection<?> collections) {
		return "Super:HashSet";
	}
}
