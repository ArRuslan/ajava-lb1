package ua.nure.task1;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
	
	public static void main(String[] args) throws Exception {
		Map<Integer, Integer> map = new HashMap<>(4, 1);

		map.put(1, 1);
		map.put(2, 2);

		MapViewer.print(map, true);
		System.out.println("------------------");
		MapViewer.print(map, false);
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
[1]List: Node|1=1|
[2]List: Node|2=2|
[3]null
------------------
Capacity: 4
Load factor: 1.0
Threshhold: 4
=============
[1]List: Node|1=1|
[2]List: Node|2=2|
--------------------------------------------------------------------------------
*/
