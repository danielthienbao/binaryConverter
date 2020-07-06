# Binary Converter starter

## Get setup
Clone this file into your local computer by either 
clicking the button or run a command like
`git clone `
in your terminal. 

You are provided with starter code, try to read and
understand the starter code. I have commented the
meaning and use of the varaibles, so it shouldn't be too
hard to understand

In this assignment, you are ask to complete
a program that takes in a integer number from the user
and return it as a n 8 bit binary number: 

example:
```
14 -> 00001110
32 -> 00010000
```

## Get started
### 1. Complete the convertToBinary function
This is the function you should complete, this function 
returns a integer array with 8 slots, each slots represent
one digit of your binary output hence:
```
if your number is 14
your array: 0, 0, 0, 0, 1, 1, 1, 0
```
Think about how you can convert a normal number into binary.
Hint: you might want to use %(modulo) to determine the remainder.
### 2. complete the printBinary
After you compeleted the convertToBinary function, right here
you just need to print the binary array. Notice how the binary
array only exists in `convertToBinary` function? Right here, 
you can't access the array, but you can call upon that function
to get the array. 
```
if your number is 14
function prints: 00001110
```
Have fun coding.

## Grade 100 pts