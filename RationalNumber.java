public class RationalNumber extends Number
  {
    private int numerator, denominator;
  
    /**Initialize the RationalNumber with the provided values
    *  if the denominator is 0, make the fraction 0/1 instead
    *  If the denominator is negative, negate both numerator and denominator
    *@param nume the numerator
    *@param deno the denominator
    */
    public RationalNumber(int nume, int deno){
      //super(0.0);//this value is ignored! 
      if (deno == 0 || nume == 0) {
        numerator = 0;
        denominator = 1;
      }
      else if (deno < 0) {
        numerator = nume *-1;
        denominator = deno * -1;
      }
      else {
        numerator = nume;
        denominator = deno;
      }
      reduce();

    }
  
    public double getValue(){
      double num1 = Double.valueOf(numerator);
      double num2 = Double.valueOf(denominator);
      return(num1 / num2);
    }
  
    /**
    *@return the numerator
    */
    public int getNumerator(){
      return numerator;
    }
    /**
    *@return the denominator
    */
    public int getDenominator(){
      return denominator;
    }
    /**
    *@return a new RationalNumber that has the same numerator
    *and denominator as this RationalNumber but reversed.
    */
    public RationalNumber reciprocal(){
      RationalNumber result = new RationalNumber(denominator, numerator);
      return result;
    }
    /**
    *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
    */
    public boolean equals(RationalNumber other){
      int num = other.getNumerator();
      int den = other.getDenominator();
      if ((numerator == num) && (denominator == den)) {
        return true;
      }
      return false;
    }
  
  
    /**
    *@return the value expressed as "3/4" or "8/3"
    */
    public String toString(){
      return numerator + "/" + denominator;
    }
  
    /**Calculate the GCD of two integers.
    *@param a the first integers
    *@param b the second integer
    *@return the value of the GCD
    */
    private static int gcd(int a, int b){
      /*use euclids method or a better one*/
      for (int i = Math.min(a,b); i > 1; i--) {
        if ((a % i == 0) && (b % i == 0)) {
          return i;
        }

      }
      return 1;
    }
  
    /**
    *Divide the numerator and denominator by the GCD
    *This must be used to maintain that all RationalNumbers are
    *reduced after construction.
    */
    private void reduce(){
      int gcf = gcd(Math.abs(numerator), Math.abs(denominator));
      numerator = numerator / gcf;
      denominator = denominator / gcf;
  
    }
    /******************Operations Return a new RationalNumber!!!!****************/
    /**
    *Return a new RationalNumber that is the product of this and the other
    */
    public RationalNumber multiply(RationalNumber other){
      int a = numerator * other.getNumerator();
      int b = denominator * other.getDenominator();
      RationalNumber result = new RationalNumber(a,b);
      result.reduce();
      return result;
    }
  
    /**
    *Return a new RationalNumber that is the this divided by the other
    */
    public RationalNumber divide(RationalNumber other){
      RationalNumber recip = other.reciprocal();
      RationalNumber first = new RationalNumber(numerator, denominator);
      RationalNumber result = recip.multiply(first);
      result.reduce();
      return result;
    }
  
    /**
    *Return a new RationalNumber that is the sum of this and the other
    */
    public RationalNumber add(RationalNumber other){
      int A1 = numerator;
      int A2 = denominator;
      int B1 = other.getNumerator();
      int B2 = other.getDenominator();
      int commondeno = gcd(denominator, other.getDenominator());
      int denoA = A2 / commondeno;
      int denoB = B2 / commondeno;
      A1 = A1 * denoB;
      A2 = A2 * denoB;
      B1 = B1 * denoA;
      B2 = B2 * denoA;
      RationalNumber result = new RationalNumber((A1+B1), A2);
      result. reduce();
      return result;

    }
    /**
    *Return a new RationalNumber that this minus the other
    */
    public RationalNumber subtract(RationalNumber other){
      int A1 = numerator;
      int A2 = denominator;
      int B1 = other.getNumerator();
      int B2 = other.getDenominator();
      int commondeno = gcd(denominator, other.getDenominator());
      int denoA = A2 / commondeno;
      int denoB = B2 / commondeno;
      A1 = A1 * denoB;
      A2 = A2 * denoB;
      B1 = B1 * denoA;
      B2 = B2 * denoA;
      RationalNumber result = new RationalNumber((A1-B1), A2);
      result.reduce();
      return result;
    }
  } 