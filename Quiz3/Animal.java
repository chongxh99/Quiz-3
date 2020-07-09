package Quiz3;

public class Animal
{
   public String name ="";
   public int age ;
   
   public Animal(String name) 
   {   this.name = name; 
       this.age = age;   }
   
   
   public void introduceYourself()  
   {   System.out.println("Moor.I am an animal.");  }
}

class Cat extends Animal
{
   
   public Cat(String name)
   {  super (name);  }
   
   public void introduceYourself() {
      System.out.println("Meow.I am a cat.My name is "+ this.name );
      System.out.println("and I am " + this.age + " years old.");
   }
   
}

class Dog extends Animal
{
   public Dog (String name)
   {  super (name);  }
   
   public void introduceYourself()  {
      System.out.println("Woof.I am a dog.My name is "+ this.name ); 
      System.out.println("and I am " + this.age + " years old.");
    }
}  
