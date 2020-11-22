public class Tester {
    public static void main(String args[]) {
        RealNumber a = new RealNumber(15);
        RealNumber b = new RealNumber(15.00000001);
        RealNumber c = new RealNumber(-30);
        RealNumber d = new RealNumber(16);
        System.out.println("15 & 15.00000001 --> true |" + a.equals(b));
        System.out.println("15 & -30 --> false |" + a.equals(c));
        System.out.println("15 & 16 --> false |" + a.equals(d));
        RealNumber sumac = a.add(b);
        System.out.println(sumac);
    }
}
