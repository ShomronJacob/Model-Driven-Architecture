
public class StoreData1 extends StoreData {

    public StoreData1(Data data) {
    	d=data;
    }
	@Override
	public void StoreData() {
		((Data1)d).setRprice();
		((Data1)d).setSprice();
		System.out.println("Gas Pump has been activated now");
	}

}
