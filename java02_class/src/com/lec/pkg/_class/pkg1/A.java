package com.lec.pkg._class.pkg1;

import com.lec.pkg._class.pkg2.C;

// class level에서 접근제한자는 public과 defalut 만 정의 가능
// class에 접근제한자를 정의하지 않으면 default(기본값)로 선언된다.
// B.java는 동일패키지(pkg1)안에 default로 선언된 클래스
// C.java는 다른패키지(pkg2)에 public으로 선언된 클래스
// A에서 B와 C를 어떻게 접근할 것인가?
// - 동일 패키지안에서 public과 default로 선언된 클래스는 제한없이 접근가능
// - 다른 패키지안에서 public으로 선언된 클래스는 import후에 접근가능하지만
//   default로 선언된 클래스는 접근불가
// C에서 A와 B에 어떻게 접근할 것인가?
//  - 다른 패키지의 public class는 접근 가능
//  - 다른 패키지의 defalut class는 접근 불가
public class A {
	B b;
	C c;
}
