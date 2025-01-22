package kadai_018;

public class Kato_Chapter18 {
//親クラス
	
	//フィールド
	String familyName ="加藤";
	String givenName;
	String address ="東京都中野区〇×";

	//メソッド
	//共通の紹介を出力する
	public  void outputcommonIntroduce() {
	 System.out.println("名前は" + familyName + givenName + "です");
	 System.out.println("住所は" + address + "です");
	 

    }

    //個別の紹介を出力する
 	public void eachIntroduce() {
		
	}
 	
 	//紹介を実行する
	public void execIntroduce() {
		outputcommonIntroduce();
		eachIntroduce();
	} 
}
