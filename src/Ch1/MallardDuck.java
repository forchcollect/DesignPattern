package Ch1;

import Ch1.fly.FlyWithWings;
import Ch1.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("저는 물오리입니다");
	}
	
}