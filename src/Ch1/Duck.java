package Ch1;

import Ch1.fly.FlyBehavior;
import Ch1.quack.QuackBehavior;

public abstract class Duck {
	
	//Duck을 상속하는 클래스에서 인터페이스 형식의 변수를 상속받아 사용합니다.
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() { }
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
	}	
}