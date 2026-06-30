public class Main {
   public static void main(String[] args) {
       
       Person male = new Person("Andre"); 
       
       Person female = new Person("Maria");
      male.incAge();
       System.out.println("Homem: " + male.getName() + ", Idade: " + male.getAge());
       System.out.println("Mulher: " + female.getName() + ", Idade: " + female.getAge());
   }
}
    