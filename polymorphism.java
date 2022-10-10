public class polymorphism {

    // forgot the void part in method

    //off top of head code
    static public class Animal {
        public void animalSound(){
            System.out.println("generic animal noise");
        }
    }

    static public class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says 'roof'");
        }
    }

    public static void main(String[] args) {
        //Create animal obj
        Animal animalObj = new Animal();
        //Create dog animal obj
        Animal dogObj = new Dog();

        animalObj.animalSound();
        dogObj.animalSound();



    }



//    static class Animal {
//        public void animalSound(){
//            System.out.println("The animal makes a sound");
//        }
//    }
//
//    static class Pig extends Animal {
//        public void animalSound(){
//            System.out.println("The pig says: wee wee");
//        }
//    }
//
//   static  class Dog extends Animal {
//        public void animalSound() {
//            System.out.println("The dog says: bow wow");
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Animal myAnimal = new Animal();     //create a animal object;
//        Animal myDog = new Dog();           //create a dog object
//        Animal myPig = new Pig();           //Create a pig object
//
//        myAnimal.animalSound();
//        myDog.animalSound();
//        myPig.animalSound();
//    }

}
