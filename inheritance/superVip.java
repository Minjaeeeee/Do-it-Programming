----위의 코드는 생략----

public VIPCustomer()
{
  super(); //컴파일러가 자동으로 추가해준다. 상위클래스의 Customer()가 호출됨 
           //즉 상위클래스의 생성자가 호출된다는 것!
  customerGrade = "VIP"
  bonusRatio = 0.05;
  saleRatio = 0.1;
  System.out.println("VIPCustomer() 생성자 호출합니다");
}

----아래코드 생략----
