package ua.nure.task1;

import java.util.HashMap;
import java.util.Map;

public class Test5 {
	
	public static void main(String[] args) throws Exception {
		Map<Object, Object> map = new HashMap<>(4, 2.5f);

		for (int j = 0; j < 10; j++) {
			map.put(j, j);
		}

		MapViewer.print(map, true);
	}

}

/*
Console output:
--------------------------------------------------------------------------------
Capacity: 4
Load factor: 2.5
Threshhold: 10
=============
[0]List: Node|0=0| ==> Node|4=4| ==> Node|8=8|
[1]List: Node|1=1| ==> Node|5=5| ==> Node|9=9|
[2]List: Node|2=2| ==> Node|6=6|
[3]List: Node|3=3| ==> Node|7=7|
--------------------------------------------------------------------------------
*/