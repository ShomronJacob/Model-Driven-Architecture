public class Data1 extends Data {
	float regular_price;
	float super_price;
	float temp1;
	float temp2;
	float Tprice;
	float Galn;
	float total;
	
	public void setdata(float a,float b){
		temp1 = a;
		temp2 = b;
	}
	
	public float getRprice() {
		return regular_price;
	}

	public void setRprice() {
		regular_price = temp1;
	}

	public float getSprice() {
		return super_price;
	}

	public void setSprice() {
		super_price = temp2;
	}

	public float getPrice() {
		return Tprice;
	}

	public void setPrice(float f) {
		this.Tprice = f;
	}

	public float getG() {
		return Galn;
	}

	public void setG(float f) {
		Galn = f;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float f) {
		this.total = f;
	}

}
