package BT;

import java.io.File;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập đường dẫn tới thư mục hoặc file:");
		String path = scanner.nextLine();

		File file = new File(path);

		if (file.exists()) {
			if (file.isDirectory()) {
				deleteDirectory(file);
			} else {
				deleteFile(file);
			}
		} else {
			System.out.println("Thư mục hoặc file không tồn tại!");
		}

		scanner.close();
	}

	private static void deleteDirectory(File directory) {
		File[] files = directory.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					deleteDirectory(file);
				} else {
					deleteFile(file);
				}
			}
		}
		if (directory.delete()) {
			System.out.println("Xoá thư mục thành công!");
		} else {
			System.out.println("Không thể xoá thư mục!");
		}
	}

	private static void deleteFile(File file) {
		if (file.delete()) {
			System.out.println("Xoá file thành công!");
		} else {
			System.out.println("Không thể xoá file!");
		}
	}
}
