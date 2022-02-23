## 추상 클래스에 대하여
추상클래스는 완전한 클래스가 아닙니다. body가 없는 클래스로써 클래스의 활용방법을 알 수 있는 파트입니다.<br>
추상 메서드, 클래스는 오로지 상속을 위해서 만들어 진 것이고 이것을 활용하는 방법을 봅시다!<br>
<br>
## 💥직접 공부해본 결과💥
추상 클래스는 항상 추상 메서드를 필요로 합니다. 추상메서드는 abstract 예약어를 사용합니다<br>
그리고 상위클래스를 상속 받을 때는 extends 예약어를 사용합니다. 이 예약어는 상위클래스의 메서드를 받을 수 있고 추가도 가능합니다.

```
public abstract class Computer {} //추상 클래스를 선언합니다.
abstract int add(int x, int y); //추상 메서드를 선언합니다.
```
이렇게 클래스 메서드를 선언하여 진행합니다. 기본적인 예시를 하나 코드를 넣어서 설명하겠습니다.

```
public abstract class Computer 
{
	public abstract void display();   <<변동 사항이 있으므로 추상메서드로 선언
	public abstract void typing();    
	
	public void turnOn()   <<일반 메서드로 선언을 해줍니다.
	{
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() <<일반 메서드로 선언을 해줍니다.
	{
		System.out.println("전원을 켭니다.");
	}
}
```
여기서 중요한 것은 display와 typing을 추상메서드로 선언을 한 것입니다. <br>
저 두개는 변동사항이 있으므로 일부러 추상메서드를 사용하여 유동적으로 사용하도록 합니다!<br>
그다음 turnon과 turnoff는 일반 메서드로 선언.

```
public class DeskTop extends Computer 
{

📌@Override
	public void display() //desktop을 재정의 하는 것입니다.
	{
		System.out.println("DeskTop display()");
	}

	📌@Override
	public void typing()// typing을 재정의 하는 것입니다.
	{
		System.out.println("DeskTop typing()");
	}
}
```
이 코드에서 다른 점은 아까 위에서 선언했던 추상메서드를 가져와서 다시 재정의를 해주어 다르게 설정을 합니다!
이런식으로 먼저 처음에 추상클래스와 여러번 수정이 필요한 메서드는 추상메서드로 선언을 해서 각각 클래스마다 다르게 설정합니다<br>
그 다음은 템플릿 메서드가 뭔지 final 예약어가 뭔지 알아보겠습니다.
<br>
```
final public void run()
{
  starcar();
  drive();
  stop();
  turnoff();
 }
```
final 예약어의 용도는  호출 용도입니다.  추상 메서드 사용하는 것을 final 예악어 안에 넣어 놓으면서 run()함수를 호출하면 순서대로 저들이 출력.<br>
일명 고정값입니다. 바뀌어서는 안되는 메서드를 저기에 넣어둡니다.<br>
그리고 이들은 3개의 사용 위치에 따라 적용하는 법이 다릅니다. 3가지의 위치는 아래쪽에 설명하겠습니다.<br>
```
변수 : final 변수는 상수를 의미합니다.
메서드: fianl 메서드는 하위 클래스에서 재정의 할 수 있습니다.
클래식: final 클래스는 상속할 수 없습니다.
```
예를 들어 하나의 예시 코드를 짜보도록 하겠습니다.

```
final int a = 10; //final로 상수를 선언하고 a=10이라는 값을 절대 바꿀수 없게 됩니다.
```

## 😥문제를 풀면서 어려웠던 순간?😥
이 파트를 공부해보면서 어려웠던 












