package ex11;

public class Computer extends TangibleAsset {
	String makerName;
	double weight;
	public Computer
		(String name, int price, String color, String makeName) {
		super(name, price, color);
		this.makerName = makeName;
	}
	public String getMakerName() { return this.makerName; }
	@Override
	public void setWeight(double weight) {
		this.weight = weight;
		
	}
}
