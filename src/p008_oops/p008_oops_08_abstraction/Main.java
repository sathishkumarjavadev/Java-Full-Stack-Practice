package p008_oops.p008_oops_08_abstraction;

public class Main 
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();
        d.sound();
        }
    }
/*
What is Abstraction?

Abstraction means hiding implementation details and showing only essential 
functionality.

Real-World Example

Think about an ATM:

Withdraw Money   ✅
Check Balance    ✅
Deposit Money    ✅

Internal Banking Logic ❌ Hidden
Database Queries ❌ Hidden

The user only sees what is necessary.

Abstract Class

An abstract class is declared using the abstract keyword.

Example
abstract class Animal 
{
    abstract void sound();
}
Important Rules

✅ Can contain abstract methods
✅ Can contain normal methods
✅ Can contain variables

❌ Cannot create objects
*/