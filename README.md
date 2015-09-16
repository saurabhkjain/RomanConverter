# RomanConverter
A simple project to convert Roman numerals to Arabic numerals and vice versa

Roman -> int
Approach:

I started by writing tests to check if the sickliest input such as "I" or "V" would give me the correct output. 
Therefore, based on the this theory I wrote a simple switch statement based on the seven symbols which are used to create complex numerals. 
I then unit tested few examples in order to make sure that the approach which I had taken would provide me with the correct result.

Once I had finished working on the switch statement I worked on creating an algorithm to convert roman numerals into integers.
I decided to loop the every letter in the String which is being inputted by the user expect the last character since its not dividable by 10. 

For each letter I checked if the current character's equivalent numeric value is less than the next character's numeric value. 
	- If its less than the next character's value than it is subtracted from the final result.
	- If its greater than the next character's value then it is added on to the final result.
Once I had loop through every character I went back to the last character to find the equivalent numeric value and added it to the result. 

int -> roman
Approach:

I started by writing a simple test to see if the number being passed by the user is between 1 and 3999. If the number is less than or greater than the 
numbers specified in the requirements document it will throw and IllegalArgumentException. 

I then initialised two arrays (int and String). The int array with numbers ranging from 1000-1 and its corresponding roman value in a String array. 
I then created a nested loop to go through the integer array and check if the user's number was greater than 1000 (the highest possible roman numeral.)
Inside the nested the loop, I appended the 	equivalent numeral to the final result. I then subtracted the value first the int array eg. 1000, from the input.