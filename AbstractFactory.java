/**
 * This part responsible for abstract factory pattern
 *
 */
public abstract class AbstractFactory {
	public abstract StoreData StoreData(Data d);
	public abstract PayMsg PayMsg();
	public abstract StoreCash StoreCash(Data d);
	public abstract DisplayMenu DisplayMenu();
	public abstract RejectMsg RejectMsg();
	public abstract SetPrice SetPrice(Data d);
	public abstract ReadyMsg ReadyMsg();
	public abstract SetInitialValues SetInitialValues(Data d);
	public abstract PumpGasUnit PumpGasUnit(Data d);
	public abstract GasPumpedMsg GasPumpedMsg(Data d);
	public abstract StopMsg StopMsg();
	public abstract PrintReceipt PrintReceipt(Data d);
	public abstract CancelMsg CancelMsg();
	public abstract ReturnCash ReturnCash(Data d);
	public abstract Data DataObject();
}
