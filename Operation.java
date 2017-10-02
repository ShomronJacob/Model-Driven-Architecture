/**
 * This part responsible for abstract factory and strategy pattern
 *
 */
public class Operation {
	StoreData strdata;
	PayMsg pmsg;
	StoreCash scash;
	DisplayMenu dmenu;
	RejectMsg rmsg;
	SetPrice setp;
	ReadyMsg readymsg;
	SetInitialValues setval;
	PumpGasUnit pumpgunit;
	GasPumpedMsg gaspumpmsg;
	StopMsg stopmsg;
	PrintReceipt printrec;
	CancelMsg cancelmsg;
	ReturnCash returncash;
	AbstractFactory fac;
	
	public Operation(Data d,String type){
		if(type.equals("PUMP1")){
			fac = new AF1();
		}
		else if(type.equals("PUMP2")){
			fac = new AF2();
		}
		strdata = fac.StoreData(d);
		pmsg = fac.PayMsg() ;
		scash = fac.StoreCash(d);
		dmenu = fac.DisplayMenu();
		rmsg = fac.RejectMsg();
		setp = fac.SetPrice(d);
		readymsg = fac.ReadyMsg();
		setval = fac.SetInitialValues(d);
		pumpgunit = fac.PumpGasUnit(d);
		gaspumpmsg = fac.GasPumpedMsg(d);
		stopmsg = fac.StopMsg();
		printrec = fac.PrintReceipt(d);
		cancelmsg = fac.CancelMsg();
		returncash = fac.ReturnCash(d);
	}
	
	public void StoreData(){
		strdata.StoreData();
	}
	
	public void PayMsg(){
		pmsg.PayMsg();
	}
	
	public void StoreCash(){
		scash.StoreCash();
	}
	
	public void DisplayMenu(){
		dmenu.DisplayMenu();
	}
	
	public void RejectMsg(){
		rmsg.RejectMsg();
	}
	
	public void SetPrice(int g){
		setp.SetPrice(g);
	}
	
	public void ReadyMsg(){
		readymsg.ReadyMsg();
	}
	
	public void SetInitialValues(){
		setval.SetInitialValues();
	}
	
	public void PumpGasUnit(){
		pumpgunit.PumpGasUnit();
	}
	
	public void GasPumpedMsg(){
		gaspumpmsg.GasPumpedMsg();
	}
	
	public void StopMsg(){
		stopmsg.StopMsg();
	}
	
	public void PrintReceipt(){
		printrec.PrintReceipt();
	}
	
	public void CancelMsg(){
		cancelmsg.CancelMsg();
	}
	
	public void ReturnCash(){
		returncash.ReturnCash();
	}
}
