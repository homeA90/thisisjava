package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.A;

public class C {
	A a1 = new A(true);
	// A a2 = new A(1); // 해당 생성자는 default 로 되어 있으므로 같은 패키지 안에서만 사용가능하다.
	// A a3 = new A("문자열"); // 해당 생성자는 private르 되어 있으므로 사용이 불가하다.
}
