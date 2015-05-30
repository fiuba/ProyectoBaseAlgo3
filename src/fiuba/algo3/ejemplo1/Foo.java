package fiuba.algo3.ejemplo1;

import java.util.ArrayList;
import java.util.HashMap;

public class Foo {

	// Los generic son chotos. No los quiero
	@SuppressWarnings("rawtypes")
	ArrayList array;
	
	public String doFoo() {
		return "Foo";
	}

	public String doBar() {
		return "Bar";
	}

	public int doLoop() {
				int x = 1;
		for (int i=1; i< 3; i++) {
			x++;
		}
		return x;
	}

}
