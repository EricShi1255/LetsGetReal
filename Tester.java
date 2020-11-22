public class Tester {
    public static void main(String args[]) {
        RealNumber a = new RealNumber(15);
        RealNumber b = new RealNumber(15.00000001);
        RealNumber c = new RealNumber(-30);
        RealNumber d = new RealNumber(16);
        System.out.println("15 & 15.00000001 --> true |" + a.equals(b));
        System.out.println("15 & -30 --> false |" + a.equals(c));
        System.out.println("15 & 16 --> false |" + a.equals(d));
        RealNumber sumac = a.add(c);
        System.out.println("-15 | " + sumac.getValue());
        RealNumber atimesc = a.multiply(c);
        System.out.println("-450 |" + atimesc);
        RealNumber cdividea = c.divide(a);
        System.out.println("-2 |" + cdividea);

        RationalNumber aa = (3,4);
        System.out.println("3 | " + aa.getDenomminator());
        System.out.println("4 | " + aa.getNumerator());
    }
}
