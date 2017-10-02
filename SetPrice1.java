public class SetPrice1 extends SetPrice {

	 public SetPrice1(Data data) {
	    	d=data;
	 }
	 
	@Override
	public void SetPrice(int g) {
		if(g==1){
			((Data1)d).setPrice(((Data1)d).getRprice());
			System.out.println("Regular gas has been selected");
		} else if(g==2) {
			((Data1)d).setPrice(((Data1)d).getSprice());
			System.out.println("Super gas has been selected");
		}
	}

}

