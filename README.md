# java-basics-hw05

This is a homework for the Java Constructors

## IntelliJ IDEA project configuration

1. Complete all TODO tasks. Do not change the test class.
2. Uncomment `BirdTest` body and execute tests.


## Birds assignment

Develop base class Bird.
Develop abstract classes FlyingBird and NonFlyingBird.
FlyingBird should have method checkWings().
Create class Eagle, Swallow, Penguin and Kiwi.
Implement methods in the Zoo class:
- add a bird to the list
- feed different bird sections of the zoo
- add birds to a flying section of the zoo
  Uncomment tests and execute them.
  All test should pass.
```text
                |-------|
                | Bird  |
                |-------|
                    |
           ------------------------
           |                      |
     |----------|          |-------------|
     |FlyingBird|          |NonFlyingBird|
     |----------|          |-------------|         
           |                      | 
    --------------            ----------
    |            |            |        |
|-----|     |--------|    |-------|  |----|
|Eagle|     | Swallow|    |Penguin|  |Kiwi|
|-----|     |--------|    |-------|  |----|        
```

## Unit testing
There are number of different ways to run your unit tests, e.g.:
* In test class put your cursor on its definition, right click and choose `Run ...`
* Right click on a little green triangle near the class definition and choose `Run ...`
* In test class put your cursor on its definition and press `Ctrl+Shift+F10` (`Control+Shift+R`)
* Once you executed your test you could re-run it again by pressing `Shift+F10` (`Control+R`)