package ua.nure.task1;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
	
	public static void main(String[] args) throws Exception {
		Map<Object, Object> map = new HashMap<>(4, 1);

		map.put(1, 1);
		map.put(2, 2);

		map.put(5, 5);
		map.put(7, 7);

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
[0]null
[1]List: Node|1=1| ==> Node|5=5|
[2]List: Node|2=2|
[3]List: Node|7=7|
--------------------------------------------------------------------------------
*/
