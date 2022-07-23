Target — This defines the domain-specific interface that the client uses. This is the Shape interface in our example.

Adapter — This adapts the interface from the adaptee to the target interface. 
I will point the adapter classes based on the different approach below.

Adaptee — This defines an existing interface that needs adapting. 
This is the GeometricShape interface in our example.

Client — This collaborates with objects conforming to the Target interface. 
The Drawing class is the client in our example.

https://dzone.com/articles/adapter-design-pattern-in-java

We can also create the adapter by implementing the target (Shape) and the adaptee  (GeometricShape). 
That approach is known as the two ways adapter.