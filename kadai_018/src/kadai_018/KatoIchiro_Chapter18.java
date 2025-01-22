package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18{
	
	// コンストラクタの追加
    public KatoIchiro_Chapter18() {
        setGivenName("一郎"); // ここで名前をセット
    }

    //Override
	public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }

    // ローカル変数ではなく、クラスのフィールドに値をセット
    void setGivenName(String givenName) {
        this.givenName = givenName;
	}
	
}
