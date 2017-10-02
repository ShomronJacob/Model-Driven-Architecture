public class SetPrice2 extends SetPrice {

	 public SetPrice2(Data data) {
	    	d=data;
	 }
	 
	@Override
	public void SetPrice(int g) {
		if(g==1){
			((Data2)d).setPrice(((Data2)d).getRprice());
			System.out.println("Regular gas has been selected");
		} else if(g==2) {
			((Data2)d).setPrice(((Data2)d).getSprice());
			System.out.println("Super gas has been selected");
		} else if(g==3) {
			((Data2)d).setPrice(((Data2)d).getPprice());
			System.out.println("Premium gas has been selected");
		}
	}

}
