package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{
 
	

	// コンストラクタの追加
    public KatoHanako_Chapter18() {
        setGivenName("花子"); // ここで名前をセット
    }

    @Override
	public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }

     // ローカル変数ではなく、クラスのフィールドに値をセット
    void setGivenName(String givenName) {
        this.givenName = givenName;

	}
}


