class singleton{
  protected singleton(){}; // only this class and sub-classes have acesss to this.
  public static singleton singletoninstance=new singleton();
  public static singleton getinstance(){
      return singletoninstance;
  }
}
