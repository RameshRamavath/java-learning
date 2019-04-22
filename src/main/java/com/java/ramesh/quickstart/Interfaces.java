package com.java.ramesh.quickstart;

public interface Interfaces {

    // Interfaces and Abstraction helps further to organize code in better way.
    // Interfaces are actually the contract b/w classes -->
     // Interface just tell us what to Do and not How!

    // If a class implements an interface and
    // does not provide method bodies for all functions specified in the interface, then class must be declared abstract.

    // interfaces are abstract methods

    // humans can't fly -- so with this Interface we can restrict who is capable of fly

    // Or fly method is only available for classes which implements this interface

    // A class can extend only one Class
    // But, an interface can be implemented by multiple classes


    public void fly();

    // why we use Interfaces?
       // to achieve total abstraction
    // to achieve multiple inheritance (classes can't)
    // to achieve loose coupling
    // then when to use Abstract classes ??
       // abstract classes may contain non-final variables, whereas variables in interface are final, public and static.
}
