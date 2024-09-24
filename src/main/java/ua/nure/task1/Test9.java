package ua.nure.task1;

import java.util.HashMap;
import java.util.Map;

public class Test9 {
	
	public static void main(String[] args) throws Exception {
		Map<Object, Object> map = new HashMap<>(4, 1);
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		for (int j = 0; j < 12; j++) {
			map.put(new K(j), j);
		}
		map.put(66, 66);
		MapViewer.print(map, false);
	}

}

/*
Console output (the order of the nodes may differ from the one given):
--------------------------------------------------------------------------------
Capacity: 64
Load factor: 1.0
Threshhold: 64
=============
[1]List: Node|1=1|
[2]Tree: TreeNode|K(3)=3|
       -- TreeNode|K(1)=1|
         -- TreeNode|2=2|
             -- TreeNode|K(4)=4|
           -- TreeNode|K(8)=8|
             -- TreeNode|K(6)=6|
               -- TreeNode|K(9)=9|
       -- TreeNode|K(0)=0|
         -- TreeNode|K(5)=5|
           -- TreeNode|K(7)=7|
             -- TreeNode|K(11)=11|
           -- TreeNode|K(2)=2|
             -- TreeNode|K(10)=10|
               -- TreeNode|66=66|
[3]List: Node|3=3|
[4]List: Node|4=4|
--------------------------------------------------------------------------------
*/
