public class AF2 extends AbstractFactory {

	@Override
	public StoreData StoreData(Data d) {
		return new StoreData2(d);
	}

	@Override
	public PayMsg PayMsg() {
		return new PayMsg2();
	}

	@Override
	public StoreCash StoreCash(Data d) {
		return new StoreCash1(d);
	}

	@Override
	public DisplayMenu DisplayMenu() {
		return new DisplayMenu2();
	}

	@Override
	public RejectMsg RejectMsg() {
		return new RejectMsg1();
	}

	@Override
	public SetPrice SetPrice(Data d) {
		return new SetPrice2(d);
	}

	@Override
	public ReadyMsg ReadyMsg() {
		return new ReadyMsg1();
	}

	@Override
	public SetInitialValues SetInitialValues(Data d) {
		return new SetInitialValues2(d);
	}

	@Override
	public PumpGasUnit PumpGasUnit(Data d) {
		return new PumpGasUnit2(d);
	}

	@Override
	public GasPumpedMsg GasPumpedMsg(Data d) {
		return new GasPumpedMsg2(d);
	}

	@Override
	public StopMsg StopMsg() {
		return new StopMsg2();
	}

	@Override
	public PrintReceipt PrintReceipt(Data d) {
		return new PrintReceipt2(d);
	}

	@Override
	public CancelMsg CancelMsg() {
		return new CancelMsg1();
	}

	@Override
	public ReturnCash ReturnCash(Data d) {
		return new ReturnCash2(d);
	}

	@Override
	public Data DataObject() {
		return new Data2();
	}
}
