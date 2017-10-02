/**
 * This part responsible for abstract factory and state pattern
 *
 */

public class MDA_EFSM {
	State state;
	State ls[];
	
    public MDA_EFSM(Data d,String type) {
    	ls = new State[8];
    	ls[0] = new Start(d,type,this);
    	ls[1] = new S0(d,type,this);
    	ls[2] = new S1(d,type,this);	
    	ls[3] = new S2(d,type,this);
    	ls[4] = new S3(d,type,this);
    	ls[5] = new S4(d,type,this);
    	ls[6] = new S5(d,type,this);
    	ls[7] = new S6(d,type,this);
    	state = ls[0];
    }

    public void Activate(){
    	state.Activate();
    }
	public void Start(){
		state.Start();
	}
	public void PayType(int t){
		state.PayType(t);
	}
	public void Reject(){
		state.Reject();
	}
	public void Cancel(){
		state.Cancel();
	}
	public void Approved(){
		state.Approved();
	}
	public void StartPump(){
		state.StartPump();
	}
	public void Pump(){
		state.Pump();
	}
	public void StopPump(){
		state.StopPump();
	}
	public void SelectGas(int g){
		state.SelectGas(g);
	}
	public void Receipt(){
		state.Receipt();
	}
	public void NoReceipt(){
		state.NoReceipt();
	}
	public void stateChangeop(int id){
		state = ls[id];
	}
}
