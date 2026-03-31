package ex1_overriding;

public class PratTimeEmployee extends Employee{
	
	private int pay;
	private int time;
	
	public PratTimeEmployee (String name, int pay, int time) {
		super(name);
		this.pay = pay;
		this.time = time;
	}
	
	@Override
	public int getPay() {
		return pay * time;
	}
}
