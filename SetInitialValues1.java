public class SetInitialValues1 extends SetInitialValues {
	Data1 d;
	
	 public SetInitialValues1(Data data) {
	    	d=(Data1)data;
    }
	
	@Override
	public void SetInitialValues() {
		d.setG(0);
		d.setTotal(0);
	}

}
