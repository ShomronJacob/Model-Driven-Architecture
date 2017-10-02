public class PumpGasUnit2 extends PumpGasUnit {
	Data2 d;

	public PumpGasUnit2(Data data) {
	    	d=(Data2)data;
	}
	
	@Override
	public void PumpGasUnit() {
		d.setL(d.getL()+1);
		d.setTotal(d.getPrice()*d.getL());
	}

}
