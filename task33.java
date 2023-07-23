/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
 class Main {
public static void main(String[] args) 
{
int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
int[] unique = new int[20];
int uniqueLength = 0;

outerloop:for (int i = 0; i < my_array.length; i++)
{
for (int j = 0; j < uniqueLength; j++)
{
if (my_array[i] == unique[j])
{
continue outerloop;
}
}
unique[uniqueLength] = my_array[i];
System.out.println(my_array[i]);
uniqueLength++;
}
} 
}