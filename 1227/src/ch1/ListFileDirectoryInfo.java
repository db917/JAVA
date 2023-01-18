package ch1;

import java.io.File;

public class ListFileDirectoryInfo {
	public static void main(String[] args) {
		File myDir = new File("d:/work");
		File[] list = myDir.listFiles();
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i].getName());
			if (list[i].isDirectory())
				System.out.println("\t\tDIR");
			else
				System.out.println("\t\tFILE");
		}
	}
}