package com.example;

import java.util.List;

import com.example.library.*;

class Example<T> {

  private T t;

  Example(Fooer<? extends T> fooer) {
    t = fooer.foo();
  }

}

