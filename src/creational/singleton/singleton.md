🏗️ Singleton pattern

- The singleton pattern is a creational design pattern that ensures that only one instance of a class is created.
- A single instance is required when a shared resource needs to be accessed by multiple parts of the code and creating multiple instances of the class can be resource-intensive or cause inconsistencies.
- A database connection pool is a good example when it comes to multiple instances being resource-intensive, while a state store like Redux is a good example when it comes to multiple instances causing inconsistencies.
- The singleton pattern is very popular and is used in many libraries and frameworks. For example, the java.lang.Runtime class is a singleton class and every instance created by Spring is a singleton instance by default.



🪛 Implementing the singleton pattern

- Step 1: Constructor hiding - Make the constructor private so that it cannot be accessed from outside the class.
- Step 2: Global access point - Create a static method that returns the single instance of the class.
- Step 3: Static attribute - Create a static attribute that holds the single instance of the class.
- Step 4: Lazy initialization - Initialize the static attribute in the static method if it is null else return the existing instance.



🍦 Different flavors of the singleton pattern

- Eager initialization - The static attribute is initialized when the class is loaded. The instance is created even if it is not required, the startup time is increased, and attributes cannot be passed to the constructor dynamically.
- Thread safe - You can make the static method synchronized or add a synchronized block inside the static method to make it thread-safe. The performance is reduced since only one thread can access the method at a time.
- Double-checked locking - The method is required to be synchronized only when the instance is null. Since multiple threads can enter the synchronized block, the instance is checked again inside the synchronized block. This is called double-checked locking and it only blocks the threads when the instance is null.