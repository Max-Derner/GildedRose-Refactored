# GildedRose-Refactored
This is my best go (so far!) of refactoring Terry Hughes' Java GildedRose Kata. I did cheat though by editing the Item class


This is a Kata I have completed from https://github.com/emilybache/GildedRose-Refactoring-Kata

I have done my best to implement a Strategy Pattern to it. However, in order to get it working I threw the rules to the wind and changed the Item class because I've never met a goblin who kept their word.

=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

Now, instead of a single class that handles all items, Item is an abstract class and each differnt type of class inherits from it.

The update function has been delegated to each individual subclass, so that the way in which items are updated is more readable and changing the behaviour of one item has a far smaller chance of introducing bugs to the behaviour of any other item.

The Item class and each of it's subclasses now implement an update function so that we can be sure everything runs smoothly.


There may be a rookie mistake or two but forgive me as I am learning.

Also, if you found this there is a good chance I asked you to be here. So thank you, really. I very much apreciate you coming over to look my code up and down.
