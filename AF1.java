public class AF1 extends AbstractFactory {

	@Override
	public StoreData StoreData(Data d) {
		return new StoreData1(d);
	}

	@Override
	public PayMsg PayMsg() {
		return new PayMsg1();
	}

	@Override
	public StoreCash StoreCash(Data d) {
		return new StoreCash1(d);
	}

	@Override
	public DisplayMenu DisplayMenu() {
		return new DisplayMenu1();
	}

	@Override
	public RejectMsg RejectMsg() {
		return new RejectMsg1();
	}

	@Override
	public SetPrice SetPrice(Data d) {
		return new SetPrice1(d);
	}

	@Override
	public ReadyMsg ReadyMsg() {
		return new ReadyMsg1();
	}

	@Override
	public SetInitialValues SetInitialValues(Data d) {
		return new SetInitialValues1(d);
	}

	@Override
	public PumpGasUnit PumpGasUnit(Data d) {
		return new PumpGasUnit1(d);
	}

	@Override
	public GasPumpedMsg GasPumpedMsg(Data d) {
		return new GasPumpedMsg1(d);
	}

	@Override
	public StopMsg StopMsg() {
		return new StopMsg1();
	}

	@Override
	public PrintReceipt PrintReceipt(Data d) {
		return new PrintReceipt1(d);
	}

	@Override
	public CancelMsg CancelMsg() {
		return new CancelMsg1();
	}

	@Override
	public ReturnCash ReturnCash(Data d) {
		return new ReturnCash1(d);
	}

	@Override
	public Data DataObject() {
		return new Data1();
	}


}
