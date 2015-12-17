package com.example;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerArgumentResolver implements ArgumentResolver {

	@Override
	public Argument resolve(InputStream stream) {
		int a = 0;
		int b = 0;
		try (Scanner scanner = new Scanner(stream);) {
			a = scanner.nextInt();
			b = scanner.nextInt();			
		}
		return new Argument(a, b);
	}

}
