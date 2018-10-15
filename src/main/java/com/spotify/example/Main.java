package com.spotify.example;

/** Application entry point. */
public final class Main {
  private Main() {}

  public static void main(final String... args) {
    System.out.println("hello!");

    final String[] x = new String[] {"one"};
    final String[] y = new String[] {"two"};
    if (x.equals(y)) {
      System.out.println("arrays are equal!");
    }

    new Exception();

    System.out.println("goodbye!");
  }
}
