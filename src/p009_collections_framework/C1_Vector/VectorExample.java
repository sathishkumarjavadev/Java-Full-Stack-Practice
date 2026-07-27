package p009_collections_framework.C1_Vector;

import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		
		Vector<String> obj = new Vector<String>();
		
		obj.add("sathish");
		obj.add("santhosh");
		obj.add("dinesh");
		
		System.out.println(obj);
		obj.remove(0);
		System.out.println(obj);
	}
}
/*
 If ArrayList already exists...

Why did Java create Vector?

The answer is:

Thread Safety

Before understanding Vector, you must understand what a Thread is.

Imagine your phone.

You are

Listening to Spotify 🎵
Downloading a file 📥
Receiving a WhatsApp message 💬

All these happen together.

That is because different threads are working.

Simple Example

Suppose we have one ArrayList.

Students

↓

[A, B, C]

Now imagine

Thread 1

adds

D

At exactly the same time...

Thread 2

removes

B

Both threads are changing the same object.

If they both modify it at exactly the same time...

Bad things can happen.

Sometimes:

A B C D

Sometimes:

A C

Sometimes:

Program crashes.

Sometimes:

Wrong data.

This is called a Race Condition.

ArrayList

ArrayList is

NOT Thread Safe

Multiple threads can modify it simultaneously.

Vector

Vector is

Thread Safe

How?

Java locks the Vector before modifying it.

Think of a bathroom.

Without lock

Person 1

↓

Bathroom

↑

Person 2

Both enter.

Chaos 😄

With a lock

Person 1

↓

🔒 Bathroom

↓

Leaves

↓

Person 2 enters

Only one person enters at a time.
*/

