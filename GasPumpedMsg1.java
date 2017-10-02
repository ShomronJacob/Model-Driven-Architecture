public class GasPumpedMsg1 extends GasPumpedMsg {
	
	Data1 d;
	
	public GasPumpedMsg1(Data d) {
		this.d = (Data1)d;
	}

	@Override
	public void GasPumpedMsg() {
		System.out.println(d.getG() + " gallons have been pumped");
	}

}

