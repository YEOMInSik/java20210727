package variable;

public class JungsuEx {
    byte b1;
    short s1;
    int i1;
    long l1;


    public JungsuEx() { }  //리턴타입이 없고 클래스명과 같으면서 메소드 형태를 띄는것이 생성자라고 한다

    public static void main(String[] args){
        JungsuEx j = new JungsuEx();  //new(생성연산자)뒤의 JungsuEx()는 생성자(원래는 변수와 메소드만 들어감)
        byte b2= (byte) 130;
        System.out.println(j.b1);
        System.out.println(j.s1);
        System.out.println(j.i1);
        System.out.println(j.l1);
        System.out.println(b2);
        System.out.println(j.b1 + b2);
        System.out.println(j.s1 + b2);
        j.i1 = 130 + j.s1;
        j.s1 = (short) j.i1;  //큰데서 작은데로 (명시적 형변환)
        j.i1 = (int) j.s1;    //작은데서 큰데로 (묵시적 형변환 => 생략가능)
        System.out.println(j.i1);
        j.l1 = 100_000_000_000l;
        System.out.println(j.l1);

    }
}

