package kadai_015;

public class CarExec_Chapter15 {
    public static void main(String[] args) {
    	
    	//インスタンス化
    	Car_Chapter15  car = new Car_Chapter15(1,10);
    	
    	
    	//車クラスのearChangeメソッドを実行する
    	car.gearChange(3);
    			
        //車クラスのrunメソッドを実行する
        car.run();
        
    }
}