package com.zengyin.peactice20180110;

public class SapeShipDelegation {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	public SapeShipDelegation(String name){
		this.name = name;
	}
	public void up(int velocity){
		controls.up(velocity);
	}
	public void down(int velocity){
		controls.down(velocity);
	}
	public void left(int velocity){
		controls.left(velocity);
	}
	public void right(int velocity){
		controls.right(velocity);
	}
	public void forward(int velocity){
		controls.forward(velocity);
	}
	public void turboBoost(){
		controls.turboBoost();
	}
	public static void main(){
		SapeShipDelegation sc = new SapeShipDelegation("NSEA");
	}
	
}
