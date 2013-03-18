package com.example.exe1;

public class Result {
	int nbrCorrAns;
	int nbrWroAns;
	int nbrQue;
	
	public Result() {
		nbrCorrAns = 0;
		nbrWroAns = 0;
		nbrQue = 0;
	}
	
	public void incCorrAns() {
		nbrQue++;
		nbrCorrAns++;
	}
	
	public void decCorrAns() {
		nbrQue++;
		nbrWroAns++;
	}
	
	public int getNbrCorrAns() {
		return nbrCorrAns;
	}
	
	public int getNbrWroAns() {
		return nbrWroAns;
	}
	
	public int getNbrQue() {
		return nbrQue;
	}
}
