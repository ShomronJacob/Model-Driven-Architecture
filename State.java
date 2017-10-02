/**
 * This part responsible for state pattern
 *
 */
public abstract class State {
	Operation op;
	MDA_EFSM efsm;
	
	public State(Data ds , String type,MDA_EFSM efsm){
		this.efsm = efsm;
		op = new Operation(ds,type);
	}
	
	public abstract void Activate();
	public abstract void Start();
	public abstract void PayType(int t);
	public abstract void Reject();
	public abstract void Cancel();
	public abstract void Approved();
	public abstract void StartPump();
	public abstract void Pump();
	public abstract void StopPump();
	public abstract void SelectGas(int g);
	public abstract void Receipt();
	public abstract void NoReceipt();
	
}
