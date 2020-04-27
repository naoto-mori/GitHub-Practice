package test;

import java.util.Scanner;

public class Test000 {

	public static void main(String[] args) {
		System.out.println("こんにちは");
		System.out.println("こんばんは"); //倉橋が追加[2020-04-27-16:10]

		//倉橋が追加[2020-04-27-16:23]
		System.out.println("Scannerクラスをインポートするぜ！！");
		Scanner sc = new Scanner(System.in);
		System.out.println("あなたの名前を入力してくれ！！：");
		String name = sc.nextLine();

		System.out.println("あなたの名前は " + name + " だぜ！！！\nこれで勘弁して森さん・・・。(息絶える)");

		System.out.println("強くいきて！倉橋さん！！");//2020/04/27[mori]

	}

}
