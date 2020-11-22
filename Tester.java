public class Tester {
    /*
    private static int gcd(int a, int b){

        for (int i = Math.min(a,b); i > 1; i--) {
          if ((a % i == 0) && (b % i == 0)) {
            return i;
          }
  
        }
        return 1;
      }
    */
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

        RationalNumber AB = new RationalNumber(3, 4);
        System.out.println("3 | " + AB.getNumerator());
        System.out.println("4 | " + AB.getDenominator());
        RationalNumber BA = AB.reciprocal();
        System.out.println(BA.toString());
        //System.out.println("1 | " +gcd(3,4));
        RationalNumber biggy = new RationalNumber(100,10);
        System.out.println(biggy.toString());
        RationalNumber biggest = new RationalNumber(4444444,1111111);
        System.out.println(biggest.toString());
        RationalNumber ABtimesBA = AB.multiply(BA);
        System.out.println(ABtimesBA.toString());

        RationalNumber dog = new RationalNumber(2,3);
        RationalNumber cat = new RationalNumber(1,4);
        RationalNumber cocogoat = dog.add(cat);
        System.out.println(cocogoat.toString());
        RationalNumber cocomilk = dog.subtract(cat);
        System.out.println(cocomilk.toString());



        
    }
}
