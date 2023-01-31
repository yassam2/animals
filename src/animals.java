class Animal {
    
    public int ageOfAnimal;
     public string genderOfAnimal;
     public void isMammal ()
     {
        System.out.println("This is mammal, it is a method that is public from the class Animal");
     }
    public void mate()
    {
        System.out.println("This is mate, a public method from the class Animal ");
    }  
    public static void main ( String [] args){
        Animal MyAnimal = new Animal ();
  MyAnimal.isMammal ();
        MyAnimal.mate ();
        }
        class Fish extends Animal {

            private int sizeInFeet;

            private void canEat ()
            {
               
                System.out.println("This is the private method of canEat from the class of fish that extends the class Animal");

            }
            }
            class Zebra extends Animal{
                public boolean is_wild;

                public void run ()  
                {
                    System.out.println("This is run, a public mthod from the class of Fish which extends the class of Animal");

                }
             
            }

}


