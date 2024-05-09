package BT;

import java.io.File;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập đường dẫn tới file:");
		String filePath = scanner.nextLine();

		File file = new File(filePath);

		if (file.exists() && file.isFile()) {
			long fileSizeInBytes = file.length();
			double fileSizeInKB = (double) fileSizeInBytes / 1024;
			double fileSizeInMB = fileSizeInKB / 1024;

			System.out.println("Độ lớn của file: " + fileSizeInBytes + " bytes");
			System.out.println("Độ lớn của file: " + fileSizeInKB + " KB");
			System.out.println("Độ lớn của file: " + fileSizeInMB + " MB");
		} else {
			System.out.println("File không tồn tại hoặc không phải là file!");
		}

		scanner.close();
	}
}
