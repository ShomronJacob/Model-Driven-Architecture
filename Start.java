public class Start extends State {

	public Start(Data d, String type, MDA_EFSM mda_EFSM) {
		super(d, type, mda_EFSM);
	}

	@Override
	public void Activate() {
		op.StoreData();
		efsm.stateChangeop(1);
	}

	@Override
	public void Start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void PayType(int t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Reject() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Cancel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Approved() {
		// TODO Auto-generated method stub

	}

	@Override
	public void StartPump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Pump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void StopPump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SelectGas(int g) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Receipt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void NoReceipt() {
		// TODO Auto-generated method stub

	}

}
