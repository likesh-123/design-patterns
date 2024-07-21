Key Concepts
- Subject: The subject maintains a list of observers and provides methods for attaching and detaching observers. It notifies all registered observers of any state changes.
- Observer: The observer defines an interface for objects that should be notified of changes in the subject.
- Concrete Subject: The concrete subject stores state and notifies observers when its state changes.
- Concrete Observer: The concrete observer implements the observer interface and reacts to changes in the subject's state.

Explanation
- Observer Interface (Observer): Defines the update method that will be called when the subject's state changes.
- Subject Interface (Subject): Defines methods for registering, removing, and notifying observers.
- Concrete Subject (WeatherData): Implements the subject interface and maintains a list of observers. It notifies all registered observers whenever the weather data changes.
- Concrete Observers: Implement the Observer interface and define how they should update themselves based on changes in the subject.
  - CurrentConditionsDisplay: Displays the current temperature and humidity.
  - StatisticsDisplay: Displays the average, maximum, and minimum temperatures.
  - ForecastDisplay: Provides a weather forecast based on pressure changes.
- Client (WeatherStation): Sets up the weather station, registers observers, and updates weather measurements.