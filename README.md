<div align="center">
  <h1> OBSERVER  </h1>
</div>

# Code

Simple project representing the observer design pattern.

# Definition

Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

![image](https://reader-images.githubusercontent.com/40416044/152802766-7415b260-7302-4aae-b8f1-d1a611ee06b3.png)

It is mainly used for implementing distributed event handling systems, in "event driven" software. In those systems, the subject is usually named a "stream of events" or "stream source of events", while the observers are called "sinks of events". The stream nomenclature alludes to a physical setup where the observers are physically separated and have no control over the emitted events from the subject/stream-source. This pattern then perfectly suits any process where data arrives from some input that is not available to the CPU at startup, but instead arrives "at random" (HTTP requests, GPIO data, reader input from keyboard/mouse/..., distributed databases and blockchains, ...). Most modern programming-languages comprise built-in "event" constructs implementing the observer-pattern components. While not mandatory, most 'observers' implementations would use background threads listening for subject-events and other support mechanisms provided by the kernel (Linux epoll, ...).

Source: <a href="https://en.wikipedia.org/wiki/Observer_pattern"> Wikipedia </a> | <a href="https://refactoring.guru/design-patterns/observer"> Refactoring Guru </a>
