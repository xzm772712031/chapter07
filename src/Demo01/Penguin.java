package Demo01;

public class Penguin extends Pet {
	private String sex;
	
	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	
	public void print() {
		super.print();
		System.out.println("性别是 " + this.sex + "。");
	}
	
	public void eat() {
		super.health = super.health + 5;
		System.out.println("企鹅" + super.name + "吃饱啦！健康值增加5。");
	}	
}
