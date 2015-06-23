package week3.day2.inner;

public class Outer {
  private int outerField;
  private int x = 18;

  private static int staticField;

  public void setOuterField(int outerField) {
    this.outerField = outerField;
  }

  public void outerMethod() {
    System.out.println("In outer class" + outerField);
  }

  public class Inner {
    private int innerField;
    private int x = 8;

    public void innerMethod() {
      System.out.println("In inner class. Field = " + innerField);
    }

    public void setInnerField(int innerField) {
      this.innerField = innerField;
    }

    public void showOuterField(){
      System.out.println(outerField);
    }

    public void showX(){
      System.out.println(Outer.this.x);
    }
  }


  public static class Nested{

    public void nestedMethod(){
      System.out.println(staticField);
    }
  }

}
