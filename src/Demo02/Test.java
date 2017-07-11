package Demo02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    String answer = null;
		    List doglist = new ArrayList();
		    DogBiz db = new DogBiz();
		    Dog dog = null;
		    do {
		    	dog = new Dog();
		    	System.out.println("请输入狗的名称:");
		    	String name = input.nextLine();
		    	System.out.println("请输入狗的品种:");
		    	String type = input.nextLine();
		    	dog.setName(name);
		    	dog.setStrain(type);
		    	doglist=db.add(dog);
		    	System.out.println("是否继续:");
		    	answer = input.nextLine();
		    }while(answer.equals("y"));
	        System.out.println("共计有" + doglist.size() + "条狗狗。");
	        System.out.println("分别是:");
	        for (int i = 0; i < doglist.size(); i++) {
	                           dog = (Dog) doglist.get(i);
	            System.out.println(dog.getName() + "\t"     
	                    + dog.getStrain());
	        }
	    }
}
