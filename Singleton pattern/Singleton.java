class singleton{
  private singleton(){};
  public static singleton singletoninstance;
  public static singleton getinstance(){
      if(singletoninstance == null){
          singletoninstance = new singleton();
      }
      return singletoninstance;
  }
}
