class singleton {
  protected singleton() {}
  ; // only this class and sub-classes have acesss to this.

  public static singleton singletoninstance;

  public static singleton getinstance() {
    if (singletoninstance == null) {
      singletoninstance = new singleton();
    }
    return singletoninstance;
  }
}
