
public class RationalNumber extends Number {
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno == 0)
    {
      denominator = 1;
      numerator = 0;
    }else{
      denominator = deno;
      numerator = nume;
    }
  }

  public double getValue(){
    return ((double)this.numerator) / this.denominator;
  }
  /**
  *@return the numerator
  */
  public int getNumerator(){
    return this.numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return this.denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(this.denominator, this.numerator);
  }

  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (this.denominator = 0) {return Integer.toString(this.numerator);}
    return Integer.toString(this.numerator) + "/" + Integer.toString(this.denominator);
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    int thing = 1;
    for (int i = 1; i <= Math.min(a, b); i ++ ) {
      if(a % i == 0 && b % i == 0)
      {
        thing = i;
      }
    }
    return thing;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int thing = gcd(this.numerator, this.denominator);
    this.numerator = this.numerator / thing;
    this.denominator = this.denominator / thing;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    if (this.numerator == 0 && other.numerator == 0)
    {
      return true;
    }
    this.reduce();
    other.reduce();
    return this.numerator == other.numerator && this.denominator == other.denominator;

  }

  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(this.numerator * other.numerator, this.denominator * other.denominator);
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return new RationalNumber(this.numerator * other.denominator, other.numerator * this.denominator);
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return new RationalNumber(this.numerator * other.denominator + other.numerator * this.denominator , this.denominator * other.denominator);
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return new RationalNumber(this.numerator * other.denominator - other.numerator * this.denominator , this.denominator * other.denominator);
  }
}
