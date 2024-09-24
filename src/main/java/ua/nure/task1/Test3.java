package ua.nure.task1;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
	
	public static void main(String[] args) throws Exception {
		Map<Object, Object> map = new HashMap<>(4, 1);

		for (int j = 0; j < 4; j++) {
			map.put(j, j);
		}

		MapViewer.print(map, true);
	}

}

/*
Console output:
--------------------------------------------------------------------------------
Capacity: 4
Load factor: 1.0
Threshhold: 4
=============
[0]List: Node|0=0|
[1]List: Node|1=1|
[2]List: Node|2=2|
[3]List: Node|3=3|
--------------------------------------------------------------------------------
*/
