public abstract class Number
{

  public abstract double getValue();
  public int compareTo(Number other){
    double thi = this.getValue() * 1000000;
    double oth = other.getValue() * 1000000;
    return Math.round(thi) == Math.round(oth) ? 0 : this.getValue() > other.getValue() ? 1 : -1;
  }
  public boolean equals(Number other)
  {
    return this.compareTo(other) == 0;
  }
}
