# Monty Hall Solution - Java

## Prompt

The Monty Hall problem is a probability problem based on a game show. Here is a brief description from wikipedia:

Suppose you're on a game show, and you're given the choice of three doors: Behind one door is a car; behind the others, goats. You pick a door, say No. 1, and the host, who knows what's behind the doors, opens another door, say No. 3, which has a goat. He then says to you, "Do you want to pick door No. 2?" Is it to your advantage to switch your choice?

The surprising answer to this question was the cause of much controversy in the statistics community for some time and is still quite popular among those studying statistical methods.

Our task here is not to understand the mathematics behind the solution but to work out the answer the hard way. If we were to play this game many times, say one thousand times. And in half of those games we switch our choice of doors and in half of those games we keep our original choice of door. And we record whether we win or loose each time. We could then compare the number of times we win when we switch doors to the number of times we win when we do not switch doors. This should give us an indication of which strategy is the winning one or if it makes no difference at all.

Write a method that will simulate the playing of the game. That is, randomly choose a winning door. Then randomly choose a door for the player. Then decide if you are switching doors or not and record if the player won.

Your method should run the game one thousand times then return an array with two values, the percentage of times you win when the switch door strategy is used and the percentage of times you win when the switch door strategy is not used. For example, the array [34, 47] means that you win 34% of the time when you swicth doors and 47% of the time when you do not swicth doors.
