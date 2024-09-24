package ua.nure.task1;

import java.util.HashMap;
import java.util.Map;

public class Test7 {
	
	public static void main(String[] args) throws Exception {
		Map<Object, Object> map = new HashMap<>(4, 1);

		map.put(2, 2);
		map.put(new K(0), 0);
		map.put(6, 6);
		map.put(new K(1), 1);

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
[1]null
[2]List: Node|2=2| ==> Node|K(0)=0| ==> Node|6=6| ==> Node|K(1)=1|
[3]null
--------------------------------------------------------------------------------
*/