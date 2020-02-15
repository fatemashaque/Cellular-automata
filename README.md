# Cellular-automata

This program simulates Elementary Cellular Automata using Java.

The user must be able to provide these two things: as arguments when executing the program from Console:

the number of iterations (any integer n)
the Rule Number (an integer from 0 to 255)
The program will initialize the grid to a width of n × 2, with a single cell set to true/alive in the centre. It will then display the iterations of the automaton in console.

Example run command in Console: java CA 20 223 will create an automaton with grid width (20 × 2 =) 40, and will run for 20 iterations using Rule 223.

How to handle the update of the leftmost and rightmost cells:  the easiest way is to ignore them and only update the cells from [1] to ['last'-1].  Or, if you prefer, you can pretend that there are cells at [-1] and ['last+1] that have state = 0.  It's up to you.  The Rule90 example code does it the first way.


