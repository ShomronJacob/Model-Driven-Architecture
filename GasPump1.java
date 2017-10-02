public class GasPump1 {
	MDA_EFSM mem;
	Data1 d;
	AbstractFactory fac;
	
	public GasPump1(){
		fac = new AF1();
		d = (Data1) fac.DataObject();
		mem = new MDA_EFSM(d,"PUMP1");
	}
	
	public void Activate(float a,float b){
		if ((a>0)&&(b>0)) {
			d.setdata(a, b);
			mem.Activate();
		} 
	}
	public void Start(){
		mem.Start();
	}
	public void PayCredit(){
		mem.PayType(1);
	}
	public void Approved(){
		mem.Approved();
	}
	public void Reject(){
		mem.Reject();
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
	public void StartPump(){
		mem.StartPump();
	}
	public void PumpGallon(){
		mem.Pump();
	}
	public void StopPump(){
		mem.StopPump();
		mem.Receipt();

	}
}
	
