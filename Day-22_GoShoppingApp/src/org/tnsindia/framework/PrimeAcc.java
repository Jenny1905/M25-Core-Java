package org.tnsindia.framework;

public abstract class PrimeAcc extends ShopAcc{
	
	private boolean isPrime;
	static final private float deliveryCharges=0.0f;
	//constructor
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
		
	}
	public void bookProduct(float charges)
	{
		System.out.println("Account NO:"+this.getAccNo()+","+"Account Name:"+this.getAccNm()
		+","+"Charges is: "+this.getCharges());
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	
	
}
