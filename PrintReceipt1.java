public class PrintReceipt1 extends PrintReceipt {
	Data1 d;
	
	public PrintReceipt1(Data data) {
		d = (Data1)data;
	}
	
	@Override
	public void PrintReceipt() {
		System.out.println("RECEIPT:");
		System.out.println("Total number of Gallons pumped are: "+d.getG());
		System.out.println("Total is: $"+d.getTotal());
	}

}
