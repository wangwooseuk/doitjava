package example;

/* ó�� �ΰ��� �迭 ��Ҹ� �ʱ�ȭ�� ���¿���
 * ������ �迭 ��Ҵ� ���� ��� ��Ģ�� ���� ä��� 
 * �迭�� ���
 * int arr[10] = {1,2};
 * ����° ��� = ù��° ��� + �ι�° ���
 * 
 * �ε����� ���� ���� �� �ε��� ���� ���ؼ� �����ϰ�
 * arr�� ���� ��� ����ϼ���.
 */
public class ArrayEx04 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
