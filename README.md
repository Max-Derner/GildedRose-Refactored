# GildedRose-Refactored
This is my best go (so far!) of refactoring Terry Hughes' Java GildedRose Kata. I did cheat though by editing the Item class.


This is a Kata I have completed from https://github.com/emilybache/GildedRose-Refactoring-Kata

I have done my best to refactor the code. However, in order to get it working I threw the rules to the wind and changed the Item class because I've never met a goblin who kept their word.

=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

Now, instead of a single class that handles all item types, Item is an abstract class and each differnt type of item class inherits from it.

The update function has been delegated to each individual subclass, so that the way in which items are updated is more readable and changing the behaviour of one item has a far smaller chance of introducing bugs to the behaviour of any other item.

The update function is now declared as abstract within the Item class, forcing all subclasses to write their own version.


There may be rookie mistakes present but forgive me as I am learning and then tell me all about where I went wrong so I don't stay stupid forever.

Also, if you found this there is a good chance I asked you to be here. So thank you, really. I very much apreciate you coming over to look my code up and down.
