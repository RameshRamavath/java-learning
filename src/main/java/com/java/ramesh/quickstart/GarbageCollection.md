#                               GarbageCollection 

    Few questions every should have while working on Java projetcs
    
    1. what is Stack and Heap??
    2. what happens behind the screen when a Java application runs??
    3. what is Garbage collection?

   **What is Stack**
   
    Any Java application starts invoked from Main Method,
    Now, for all the variables and methods called in this main method will create reference or allocated some memory and
    Once instructions inside method are done, reference or memory is released
    so all these memory or reference allocated place can be called as Stack

          ex: public void dowork().
          when this method called in Main method. memory will be reserved till all the instructions inside the dowork is method are done.
          then it will be removed from Stack. at the end of program even memory allocated for Main method will be removed to free-up our memory.
     

   **What is Heap**

    When we create a instance of Class [Ex public class Bus] --
    Bus myBus = new Bus(); -- Imp point here is, myBus is not a primitive variable here, it's a reference variable created for Bus Class

    so here myBus won't store any value - its just stores the address of actual Class.
    and when new Bus() invoked - actual object will be created in Heap -- only reference will be there in Stack memory

    new let's I created instance variable again in main method.
    bus myBus2 = new Bus(); -- now the reference is pointed to new location in Heap.

    -- So, we completely lossed the reference of our old Bus class. Here comes the Garbage collection in picture.

    So garbage collection always runs on Heap memory and looks for objects without any reference and elements them to clear the space.

