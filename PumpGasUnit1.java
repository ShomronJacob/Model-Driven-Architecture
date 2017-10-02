public class PumpGasUnit1 extends PumpGasUnit {
	Data1 d;

	public PumpGasUnit1(Data data) {
	    	d=(Data1)data;
	}
	
	@Override
	public void PumpGasUnit() {
		d.setG(d.getG()+1);
		d.setTotal(d.getPrice()*d.getG());
	}

}

