public abstract class Number{

  public abstract double getValue();
  public int compareTo(Number other){
    return this.getValue() == other.getValue() ? 0 : this.getValue() > other.getValue() ? 1 : -1;
  }
  public boolean equals(Number other){
    return this.compareTo(other) == 0;
}
