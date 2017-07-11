package Demo01;

public abstract class Pet {
	protected String name = "无名氏";
	protected int health = 100;
	protected int love = 0;
	
	public abstract void eat();  
	
	
	public Pet() {	
	}
	
	public Pet(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getLove() {
		return love;
	}
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.name + 
				"，健康值是"	+ this.health + "，和主人的亲密度是"
				+ this.love + "。");
	}
}

