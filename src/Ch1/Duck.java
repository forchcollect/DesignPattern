package Ch1;

import Ch1.fly.FlyBehavior;
import Ch1.quack.QuackBehavior;

public abstract class Duck {
	
	//Duck�� ����ϴ� Ŭ�������� �������̽� ������ ������ ��ӹ޾� ����մϴ�.
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
		System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ����");
	}	
}