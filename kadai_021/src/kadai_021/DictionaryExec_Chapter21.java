package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
 
		
		System.out.println("appleの意味は" + Dictionary_Chapter21.dictionary.get("apple"));
		System.out.println("bananaの意味は" + Dictionary_Chapter21.dictionary.get("banana"));
		System.out.println("grapeの意味は" + Dictionary_Chapter21.dictionary.get("grape"));
		
		String Error = Dictionary_Chapter21.dictionary.get("orange");
		if (Error == null) {
			System.out.println("orangeは辞書に存在しません");
		}
	}
}
