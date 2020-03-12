package gugudan;

public class objectgugudan {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			int[] result = new int[9];
			for (int j = 0; j < result.length; j++) {
				result[j] = i * (j + 1);
				System.out.println(result[j]);
			}
		}
	}
}

//		
//		
//		
//		System.out.println("2단");
//		int[] result = new int[9]; //2단을 구현하기 위해 크기가 9인 배열을 생성한다
//		for (int i = 0; i < result.length; i++) {
//			result[i] = 2 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//		System.out.println("3단");
//		int[] time3 = new int[9]; //3단을 구현하기 위해 크기가 9인 배열을 생성한다
//		for (int i = 0; i < result.length; i++) {
//			time3[i] = 3 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(time3[i]);
//		}
//		System.out.println("4단");
//		int[] time4 = new int[9]; //4단을 구현하기 위해 크기가 9인 배열을 생성한다
//		for (int i = 0; i < result.length; i++) {
//			time4[i] = 4 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(time4[i]);
//		}
//		System.out.println("5단");
//		int[] time5 = new int[9]; //5단을 구현하기 위해 크기가 9인 배열을 생성한다
//		for (int i = 0; i < result.length; i++) {
//			time5[i] = 5 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(time5[i]);
//		}
//		System.out.println("6단");
//		int[] time6 = new int[9]; //6단을 구현하기 위해 크기가 9인 배열을 생성한다
//		for (int i = 0; i < result.length; i++) {
//			time6[i] = 6 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(time6[i]);
//		}
//		System.out.println("7단");
//		int[] time7 = new int[9]; //7단을 구현하기 위해 크기가 9인 배열을 생성한다
//		for (int i = 0; i < result.length; i++) {
//			time7[i] = 7 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//		System.out.println("8단");
//		result = new int[9]; //8단을 구현하기 위해 크기가 9인 배열을 생성한다
//		for (int i = 0; i < result.length; i++) {
//			result[i] = 8 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//		System.out.println("9단");
//		result = new int[9]; //9단을 구현하기 위해 크기가 9인 배열을 생성한다
//		for (int i = 0; i < result.length; i++) {
//			result[i] = 9 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//	}
//}