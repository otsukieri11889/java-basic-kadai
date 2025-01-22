package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{
	

	// コンストラクタの追加
    public KatoTaro_Chapter18() {
        setGivenName("太郎"); // ここで名前をセット
    }

    //Override
	public void eachIntroduce() {
        System.out.println("私はKJavaが得意です");
    }

    // ローカル変数ではなく、クラスのフィールドに値をセット
    void setGivenName(String givenName) {
        this.givenName = givenName;
	}
	
}
