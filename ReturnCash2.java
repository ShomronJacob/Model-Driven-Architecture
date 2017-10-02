
public class ReturnCash2 extends ReturnCash {
	
	Data2 d;
	
	public ReturnCash2(Data data) {
		d = (Data2)data;
	}

	@Override
	public void ReturnCash() {
		System.out.println("RETURN $"+ (d.getCash() - d.getTotal()) +" of CASH");

	}

}
