/*
 *    변수 : 한개의 데이터를 저장하는 메모리 공간의 이름 
 *    --------
 *       = 지역변수 (메소드안에 선언하는 변수)
 *         Stack공간에 저장 , {}을 종료하면 자동으로 사라지는 변수 
 *         단점) 초기화가 없는 상태기 때문에 반드시 초기화후에 사용한다 
 *         = scope 사용범위 {}안에서만
 *       -------------------------------------------------- 
 *       = 매개변수 : 메소드 
 *       = 공유변수 : 클래스 
 *       = 멤버변수 :
 *    -----------------------------------------------------
 *    변수 => 데이터형 
 *             |
 *            기본형 (자바지원)
 *              정수 : byte , ***int , long 
 *              실수 : ***double
 *              문자 : char
 *              논리 : ***boolean 
 *            참조형 (사용자 정의) => 배열,클래스
 *    -----------------------------------------------------
 *    데이터 가공 
 *    => 연산자 
 *       단항연산자 
 *         ++ , (type)=>클래스의 형변환, !  
 *         --- 전치,후치
 *       이항연산자 
 *         +,-,*,/,% 
 *         ==,!= , < , > , <= ,>=
 *         && , ||
 *         += , = , -=
 *         
 *         => 1. char는 연산시 정수형으로 변경 
 *            2. int이하는 연산시에 int
 *            3. 모든 연산은 같은 데이터형만 할 수 있다 (자동 형변환)
 *            4. 비교연산자는 기본형 가능하다 
 *               boolean은 ==,!=만 사용이 가능 
 *               문자열은 비교연산자를 사용하지 않는다 
 *            5. && , ||는 효율적인 연산을 한다 
 *             false &&
 *             true || 
 *             ---------
 *             += ==> 
 *             int a=10;
 *             a+=10 ===>  a=a+10 
 *               
 *    데이터 흐름 
 *    => 제어문 
 *    -----------------------------------------------------
 *    데이터를 관련된 것끼리 묶어서 관리 : 배열 , 클래스
 *                            (같은 데이터) (다른 클래스) 
 *    관련된 명령어끼리 묶어서 처리 : 메소드 
 *    --------------------------------------------------+ Component(class)
 *    데이터만 묶은 클래스 :  ~VO 
 *    기능만 묶는 클래스  : ~DAO , ~Manager , ~Service
 *    혼합 클래스 : ~Model , ~Controller
 */
public class 제어문_정리 {

}
