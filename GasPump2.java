public class GasPump2 {
	MDA_EFSM mem;
	Data2 d;
	AbstractFactory fac;
	
	public GasPump2(){
		fac = new AF2();
		d = (Data2) fac.DataObject();
		mem = new MDA_EFSM(d,"PUMP2");
	}
	
	public void Activate(int a,int b,int c){
		if ((a>0)&&(b>0)) {
			d.setdata(a, b, c);
			mem.Activate();
		} 
	}
	public void Start(){
		mem.Start();
	}
	public void PayCash(float c){
		if(c>0){
			d.setTempCash(c);
			mem.PayType(2);
		}
	}
	public void Cancel(){
		mem.Cancel();
	}
	public void Regular(){
		mem.SelectGas(1);
	}
	public void Super(){
		mem.SelectGas(2);
	}
	public void Premium(){
		mem.SelectGas(3);
	}
	public void StartPump(){
		mem.StartPump();
	}
	public void PumpLiter(){
		if(d.getCash() < ((d.getL()+1)*d.getPrice())){
			mem.StopPump();
		} else {
			mem.Pump();
		}
	}
	public void Stop(){
		mem.StopPump();
	}
	public void Receipt(){
		mem.Receipt();
	}
	public void NoReceipt(){
		mem.NoReceipt();
	}
}
