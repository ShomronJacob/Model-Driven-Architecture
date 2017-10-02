public class PrintReceipt2 extends PrintReceipt {
	Data2 d;
	
	public PrintReceipt2(Data data) {
		d = (Data2)data;
	}
	
	@Override
	public void PrintReceipt() {
		System.out.println("RECEIPT:");
		System.out.println("Total number of Litres pumped are: "+d.getL());
		System.out.println("Total: $"+d.getTotal());
	}

}
