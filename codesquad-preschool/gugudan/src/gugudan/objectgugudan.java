package gugudan;

public class objectgugudan {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "��");
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
//		System.out.println("2��");
//		int[] result = new int[9]; //2���� �����ϱ� ���� ũ�Ⱑ 9�� �迭�� �����Ѵ�
//		for (int i = 0; i < result.length; i++) {
//			result[i] = 2 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//		System.out.println("3��");
//		int[] time3 = new int[9]; //3���� �����ϱ� ���� ũ�Ⱑ 9�� �迭�� �����Ѵ�
//		for (int i = 0; i < result.length; i++) {
//			time3[i] = 3 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(time3[i]);
//		}
//		System.out.println("4��");
//		int[] time4 = new int[9]; //4���� �����ϱ� ���� ũ�Ⱑ 9�� �迭�� �����Ѵ�
//		for (int i = 0; i < result.length; i++) {
//			time4[i] = 4 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(time4[i]);
//		}
//		System.out.println("5��");
//		int[] time5 = new int[9]; //5���� �����ϱ� ���� ũ�Ⱑ 9�� �迭�� �����Ѵ�
//		for (int i = 0; i < result.length; i++) {
//			time5[i] = 5 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(time5[i]);
//		}
//		System.out.println("6��");
//		int[] time6 = new int[9]; //6���� �����ϱ� ���� ũ�Ⱑ 9�� �迭�� �����Ѵ�
//		for (int i = 0; i < result.length; i++) {
//			time6[i] = 6 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(time6[i]);
//		}
//		System.out.println("7��");
//		int[] time7 = new int[9]; //7���� �����ϱ� ���� ũ�Ⱑ 9�� �迭�� �����Ѵ�
//		for (int i = 0; i < result.length; i++) {
//			time7[i] = 7 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//		System.out.println("8��");
//		result = new int[9]; //8���� �����ϱ� ���� ũ�Ⱑ 9�� �迭�� �����Ѵ�
//		for (int i = 0; i < result.length; i++) {
//			result[i] = 8 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//		System.out.println("9��");
//		result = new int[9]; //9���� �����ϱ� ���� ũ�Ⱑ 9�� �迭�� �����Ѵ�
//		for (int i = 0; i < result.length; i++) {
//			result[i] = 9 * (i + 1);
//		}
//		for (int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//	}
//}