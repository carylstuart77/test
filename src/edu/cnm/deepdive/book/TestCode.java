package edu.cnm.deepdive.book;

public class TestCode {

  public static void main(String args[]) {

    int i = 4;
    int t = 0;

    while (i > 0) {
      for (int j = 0; j < i; j++)
        t = t + 1;
      System.out.println("Hey!" + i);
      i--;
    }
    System.out.println("Total: " + t);

  }
}
//public class TestCode {
//
//  protected int doSomething(int input) {
//    return input * input;
//  }
//
//}
//
//public class Advanced extends TestCode {
//
//  protected int doSomething(int input) {
//    return super.doSomething(input) * input;
//  }
//
//  public static void main(String[] args) {
//    System.out.println(new Advanced().doSomething(2));
//  }
//
//}
//
//public class TestCode {
//
//  public static void main(String args[]) {
//
//    int[] values = {12, 5, 7, 20, 50};
//
//    for (int i = 0; i < values.length; i++) {
//      values[i] += i;
//      System.out.println(values[i]);
//    }
//  }
//}
//public class TestCode {
//
//  public static void main(String args[]) {
//    for (int i = 0; i < 15; i++) {
//      System.out.println(i);
//    }
//  }
//}
//public class TestCode {
//
//  private static long sum(int limit) {
//    return (limit <= 0) ? 0 : (limit * limit + sum(limit - 2));
//  }
//
//  public static void main(String[] args) {
//    System.out.println(sum(4) + sum(5));
//}
//
//}
//public class TestCode {
//
//  public static void main(String args[]) {
//
//    boolean condition = false;
//
//    if (condition)
//      ;
//
//    {
//      System.out.println("Here we are!");
//    }
//  }
//}
//public class TestCode {
//
//    private static long sum(int limit) {
//      return (limit <= 0) ? 0 : (limit * limit + sum(limit - 2));
//    }
//
//  public static void main(String[] args) {
//    System.out.println(sum(4) + sum(5));
//  }
//}

//public class TestCode {
//
//  public static void main(String[] args) {
//    for (
//        int i = 1;
//        i < 100;
//        i *= 5)
//      System.out.println(i);
//  }
//}
//public class TestCode {
//
//  public static void main(String[] args) {
//    for (int i = 0; i < 10; i++) {
//      System.out.println(i);
//      System.out.println((i+3) % 11);
//      if ((i + 3) % 11 == 0)
//        System.out.println((i+3) % 11);
//        break;
//    }
//  }
//}
//public class TestCode {
//
//  public void someMethod() {
//  }
//
//  abstract void anotherMethod();
//
//}
//
//public class Basic {
//
//  protected int doSomething(int input) {
//    return input * input;
//  }
//
//}
//public class TestCode {
//
//  protected int doSomething(int input) {
//    return input * input;
//  }
//
//}

//public class Advanced extends TestCode {
//
//  protected int doSomething(int input) {
//    return super.doSomething(input) * input;
//  }
//
//  public static void main(String[] args) {
//    System.out.println(new Advanced().doSomething(2));
//  }
//
//}
//class MySuperClass {
//
//  MySuperClass(int val) {
//    System.out.printf("Instantiating MySuperClass with an argument value of %d%n", val);
//  }
//
//}
//
//public class MySubClass extends MySuperClass {
//
//  MySubClass(int val) {
//
//    System.out.printf("Instantiating MySubClass with an argument value of %d%n", val);
//  }
//
//  public static void main(String[] args) {
//    MySubClass instance = new MySubClass(10);
//  }
//
//}
//class TestCode {
//
//  public static void main(String[] args) {
//
//    boolean condition = false;
//
//    if (condition)
//    {
//      System.out.println("Here we are!");
//    }
//  }
//}
//
//public class TestCode {
//
//  //public static void main(String[] args) {
//    public void call ()
//    {
//      System.out.println("TestCode.call");
//    }
//  }
//
//  class B extends TestCode {
//
//    public void call() {
//      System.out.println("B.call");
//    }
//  }
//
//  class Program {
//
//    public static void main(String[] args) {
//
//      // Reference new B class by A type.
//      TestCode a = new B();
//      // Invoke B.call from A class instance.
//      a.call();
//    }
//  }