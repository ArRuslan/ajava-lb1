package ua.nure.task1;

import java.util.HashMap;
import java.util.Map;

public class Test8 {
	
	public static void main(String[] args) throws Exception {
		Map<Object, Object> map = new HashMap<>(4, 1);

		for (int j = 0; j < 12; j++) {
			map.put(new K(j), j);
		}

		MapViewer.print(map, false);
	}

}

/*
Console output (The order of the nodes may differ from the one given):
--------------------------------------------------------------------------------
Capacity: 64
Load factor: 1.0
Threshhold: 64
=============
[2]Tree: TreeNode|K(7)=7|
       -- TreeNode|K(1)=1|
         -- TreeNode|K(9)=9|
           -- TreeNode|K(6)=6|
               -- TreeNode|K(11)=11|
             -- TreeNode|K(3)=3|
           -- TreeNode|K(5)=5|
             -- TreeNode|K(8)=8|
               -- TreeNode|K(10)=10|
       -- TreeNode|K(2)=2|
         -- TreeNode|K(4)=4|
           -- TreeNode|K(0)=0|
--------------------------------------------------------------------------------
*/