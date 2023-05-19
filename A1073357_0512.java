import java.util.Random;
import java.util.Scanner;

public class A1073357_0512 {
	private static final int Pdumplings = 5000;// 豬肉水餃
	private static final int Bdumplings = 3000;// 牛肉水餃
	private static final int Vdumplings = 1000;// 蔬菜水餃
	private static final int MinOrder = 10;// 最少點單量
	private static final int MaxOder = 50;// 最多點單量

	private static int PdumplingsRemaining = Pdumplings;
	private static int BdumplingsRemaining = Bdumplings;
	private static int VdumplingsRemaining = Vdumplings;

	private static final Object lock = new Object();

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("請輸入顧客數目：");
		int numCustomers = Sc.nextInt();
		for (int i = 1; i <= numCustomers; i++) {
			int customerId = i;
			try {
				Thread.sleep(3000); // 在每位顧客點單前的停頓時間
				placeOrder(customerId);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Sc.close();
	}

	private static void placeOrder(int customerId) throws InterruptedException {
		Random random = new Random();
		int numDumplings = random.nextInt(MaxOder - MinOrder + 1) + MinOrder;
		int DType = random.nextInt(3) + 1;

		synchronized (lock) {
			switch (DType) {
			case 1: // 豬肉水餃
				if (PdumplingsRemaining >= numDumplings) {
					PdumplingsRemaining -= numDumplings;
					System.out.println("顧客 " + customerId + " 點了 " + numDumplings + " 顆豬肉水餃");
				} else {
					System.out.println("顧客 " + customerId + " 點的豬肉水餃數量不足");
				}
				break;
			case 2: // 牛肉水餃
				if (BdumplingsRemaining >= numDumplings) {
					BdumplingsRemaining -= numDumplings;
					System.out.println("顧客 " + customerId + " 點了 " + numDumplings + " 顆牛肉水餃");
				} else {
					System.out.println("顧客 " + customerId + " 點的牛肉水餃數量不足");
				}
				break;
			case 3: // 蔬菜水餃
				if (VdumplingsRemaining >= numDumplings) {
					VdumplingsRemaining -= numDumplings;
					System.out.println("顧客 " + customerId + " 點了 " + numDumplings + " 顆蔬菜水餃");
				} else {
					System.out.println("顧客 " + customerId + " 點的蔬菜水餃數量不足");
				}
				break;
			}
		}
	}
}
