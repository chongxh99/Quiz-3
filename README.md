Questions:
• What will be printed?
     ----jGRASP exec: java Quiz3.Lab1Stage2
 Meow.I am a cat.My name is Kurre
 and I am 6 years old.
 Woof.I am a dog.My name is Vilma
 and I am 3 years old.
 
  ----jGRASP: operation complete.
  
• Explain how it is that the instance variable age of Animal can be used in Cat and Dog when it is declared in Animal.
   Because i used inheritance that will inherit all the variable from Animal class to Cat and Dog class.
   
• What actually consists an instance of?
   Each instance of the class contains its own copy of the variables. Which Variables defined within a class are call instance variable.
   
• And what consists a class of?
   A class is declared by the class keyword. A class is consists of data or variables, methods and codes.

• What is the difference between a class and an instance?
   A class is a blueprint which you use to create objects. An object is an instance of a class - it's a concrete 'thing' that you made
   using a specific class. So, 'object' and 'instance' are the same thing, but the word 'instance' indicates the relationship of an object to its class.

• Change the declaration of the instance variable age of Animal to a class variable using static, in this way:
public static int age;
• What is the result of the output now? Why?
     ----jGRASP exec: java Quiz3.Lab1Stage2
 Meow.I am a cat.My name is Kurre
 and I am 3 years old.
 Woof.I am a dog.My name is Vilma
 and I am 3 years old.
 
  ----jGRASP: operation complete.
This is because a static variable only can be access once.

• It may happen that you get warnings from the compiler that you should access the variable age via Animal.age, but it should be possible to run the program anyway. Otherwise, change the references to age into Animal.age.
• Where is the value of an instance variable stored?
   The value of an instance variable stored in heap.
   
• Where is the value of a class variable stored?
   The value of a class variable also stored in heap.
   
• What refers the variable this to?
   The this keyword refers to the current object in a method or constructor.
