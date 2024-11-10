package com.javaprograms.collections;

public class Demo2DimenArray {
		public static void main(String[] args) {
			int[][] ay = { { 51, 52 }, { 53, 54 }, { 55, 56 } };

			String[][] aa = { { "admin1", "admin123" }, { "admin2", "admin123" }, { "admin3", "admin123" } };

			for (int i = 0; i < aa.length; i++) {
				for (int j = 0; j < aa.length - 1; j++) {
					System.out.println(aa[i][j]);

					if (aa[i][j] == "admin2") {
						aa[i][j + 1] = "hyd123";
						System.out.println("After changing the admin2 password ------");
						System.out.println(aa[i][j + 1]);
					}

				}
			}
}
}