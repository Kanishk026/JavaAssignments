
// Inheritance is a fundamental concept in object-oriented programming (OOP) where one class (child or subclass) inherits properties (fields) and behaviors (methods) from another class (parent or superclass). It allows for code reusability and establishes a hierarchical relationship between classes.

// Code Reusability: Common functionality can be written once in the superclass and reused in subclasses.
// Method Overriding: Subclasses can provide specific implementations of methods defined in the superclass.
// Extendability: Existing classes can be extended to include additional features without modifying the original class.
// Polymorphism: It allows objects to be treated as instances of their parent class, making code more flexible.

// Single Inheritance: A class inherits from one parent class

// Parent class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}
class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  
        dog.bark();   
    }
}

// Multilevel Inheritance: A class is derived from a class which is also derived from another class.

// class Animal {
//     public void eat() {
//         System.out.println("Animal eats food");
//     }
// }

// // Parent class
// class Mammal extends Animal {
//     public void walk() {
//         System.out.println("Mammal walks");
//     }
// }

// // Child class
// class Dog extends Mammal {
//     public void bark() {
//         System.out.println("Dog barks");
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.eat();   // Inherited from Animal class
//         dog.walk();  // Inherited from Mammal class
//         dog.bark();  // Method in Dog class
//     }
// }

// Hierarchical Inheritance: Multiple classes inherit from a single parent class

// class Animal {
//     public void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// // Child class 1
// class Dog extends Animal {
//     public void bark() {
//         System.out.println("Dog barks");
//     }
// }

// // Child class 2
// class Cat extends Animal {
//     public void meow() {
//         System.out.println("Cat meows");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         Cat cat = new Cat();

//         dog.sound();  
//         dog.bark();   

//         cat.sound(); 
//         cat.meow();  
//     }
// }

// Java does not support multiple inheritance (inheriting from more than one class) to avoid ambiguity. 

// Promotes code reuse and simplifies code management.
// Enhances maintainability as common behavior is centralized.
// Encourages method overriding to define specific behavior in child classes.