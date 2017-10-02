public class GasPumpedMsg2 extends GasPumpedMsg {
	
	Data2 d;
	
	public GasPumpedMsg2(Data d) {
		this.d = (Data2)d;
	}

	@Override
	public void GasPumpedMsg() {
		System.out.println(d.getL() + " liters have been pumped");
	}

}

