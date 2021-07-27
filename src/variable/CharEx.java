package variable;

public class CharEx {
    public static void main(String[] args){
        char c1 = 'A';  //65
        char c2 = 'h';  //48
        char c3 = 'a';  //97
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);  //+"\n" 붙혀도 줄이동 가능
        System.out.println();
        System.out.println("Take on Me");
        System.out.println(Integer.parseInt("123"));
        System.out.print(c1+1);  //c1(char 2 byte) + 1(int 4byte) 라서 char 6byte를 초과 int로 계산됨
        System.out.print(++c1);
    }
}
