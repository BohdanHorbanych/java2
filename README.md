# java-basics-hw04

This is a homework for the Java OOP Part II

## IntelliJ IDEA project configuration

1. Complete all TODO tasks. Do not change test class.
2. After you finished assignment compilation should be without any errors (`Ctrl+F9` or `Command + F9`).


## Employee assignment

Create an interface to the method `calculatePay()`.

The base class `Employee` implements the above interface.

Create two classes `SalariedEmployee` and `ContractEmployee`, which are inherited from the base class.

Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child).

Describe the string variable `socialSecurityNumber` in the class `SalariedEmployee`.

Include a description of `federalTaxId` in the class `ContractEmployee`.

The calculation formula for the "time-worker“ is:

    `the average monthly salary = hourly rate * number of hours worked`

For employees with a fixed payment the formula i

    `the average monthly salary = fixed monthly payment`

Test will create an array of employees and add the employees with different form of payment.

Test check the output: employee ID, name, and the average monthly wage for all elements.

## Unit testing
There are number of different ways to run your unit tests, e.g.:
* In test class put your cursor on its definition, right click and choose `Run ...`
* Right click on a little green triangle near the class definition and choose `Run ...`
* In test class put your cursor on its definition and press `Ctrl+Shift+F10` (`Control+Shift+R`)
* Once you executed your test you could re-run it again by pressing `Shift+F10` (`Control+R`)