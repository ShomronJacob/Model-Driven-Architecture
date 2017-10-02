
public class SetInitialValues2 extends SetInitialValues {
	Data2 d;
	
	 public SetInitialValues2(Data data) {
	    	d=(Data2)data;
	 }
	 
	@Override
	public void SetInitialValues() {
		d.setL(0);
		d.setTotal(0);
	}

}
