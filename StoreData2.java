public class StoreData2 extends StoreData {

    public StoreData2(Data data) {
    	d=data;
    }
	@Override
	public void StoreData() {
		((Data2)d).setRprice();
		((Data2)d).setSprice();
		((Data2)d).setPprice();
		System.out.println("Gas Pump has been activated now");
	}

}
