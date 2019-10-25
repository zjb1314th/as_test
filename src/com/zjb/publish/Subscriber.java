package com.zjb.publish;

public abstract class Subscriber {

	public void subscribe() {
		Pubilsher.add(this);
	};
	
	public void cancel() {
		Pubilsher.remove(this);
	};
	
	public abstract void doAction();
}
