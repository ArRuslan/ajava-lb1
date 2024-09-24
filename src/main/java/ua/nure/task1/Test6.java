package ua.nure.task1;

import java.util.HashMap;
import java.util.Map;

public class Test6 {
	
	public static void main(String[] args) throws Exception {
		Map<Object, Object> map = new HashMap<>(4, 1);

		map.put(new K(1), 1);
		map.put(new K(2), 2);
		map.put(new K(3), 3);

		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);

		MapViewer.print(map, true);
	}

}

/*
Console output:
--------------------------------------------------------------------------------
Capacity: 8
Load factor: 1.0
Threshhold: 8
=============
[0]null
[1]List: Node|1=1|
[2]List: Node|K(1)=1| ==> Node|K(2)=2| ==> Node|K(3)=3| ==> Node|2=2|
[3]List: Node|3=3|
[4]null
[5]null
[6]null
[7]null
--------------------------------------------------------------------------------
*/