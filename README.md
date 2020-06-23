# FirstNonRepeatedCharacter
To find the index of first non repeated character in a String
Assuming we only take lowercase character.
Initialize a array of size 26 or 256 to populate that array with character array.
To do so we convert String to sequence of character array.
Increase the count if same character is encountered again.
Ex google g[count] =2 o[count] =2 l[count]=1 e[count]=1
In this example l is the first non repeated character and the index of 4 will be returned as it is the first non repeated character.
Traverse the array and check if count equal to 1.
If yes then return the index of that character.
Else return -1 
