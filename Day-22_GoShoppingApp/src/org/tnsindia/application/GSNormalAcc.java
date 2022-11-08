package org.tnsindia.application;

import org.tnsindia.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		
	}

	@Override
	public String toString() {
		return "GSNormalAcc []";
	}
	

}
