## Gilded Rose Refactoring Kata 🌹

This project is a simple implementation of the Gilded Rose Refactoring Kata using Kotlin.
You can check all requirements and details [here](https://github.com/emilybache/GildedRose-Refactoring-Kata).

## Technical decisions

- I decided to use the Strategy pattern to solve the problem because it allows us to encapsulate the behavior of each item in a separate class.
- Other possibility was to use the Factory pattern, but I used the Strategy pattern because following the challenge requirements, we can't update the Item class. (This class belong to the goblin in the corner who will insta-rage and one-shot you as he doesn't believe in shared code ownership)

## Technologies
```
- Kotlin
- Gradle
```

## How to build the project
```bash
./gradlew build
```

## How to run the tests
```bash
./gradlew test
```