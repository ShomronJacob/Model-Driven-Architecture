public class Data2 extends Data {
	int regular_price;
	int premium_price;
	int super_price;
	int temp1;
	int temp2;
	int temp3;
	int Litre;
	int price;
	float cash;
	float temp_cash;
	int total;
	
	public void setdata(int a,int b,int c){
		temp1 = a;
		temp2 = b;
		temp3 = c;
	}

	public int getRprice() {
		return regular_price;
	}

	public void setRprice() {
		regular_price = temp1;
	}

	public int getPprice() {
		return premium_price;
	}

	public void setPprice() {
		premium_price = temp3;
	}

	public int getSprice() {
		return super_price;
	}

	public void setSprice() {
		super_price = temp2;
	}

	public int getL() {
		return Litre;
	}

	public void setL(int l) {
		Litre = l;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getCash() {
		return cash;
	}

	public void setCash() {
		this.cash = temp_cash;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public void setTempCash(float c){
		this.temp_cash = c;
	}
}

