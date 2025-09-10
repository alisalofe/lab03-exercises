
# lab03-exercises

Describe Different Approaches to Solving This Problem
Describe the two different ways to figure out all of the duplicate values of a list of integers in english. The first solution is the nested loop solution. The second solution is to use a dictionary or a map (similar to the containsPair method we wrote in class. Describe both in as much detail as you can (with no code) and describe the trade-offs between the two solutions.

Using a dictionary is a lot faster, because we only have to look through each element of the list once. We will iterate over the given list and add the elements to the dictionary, if the element was not previosly added to the dictionary. If it was we can add it to the new list we want to return at the end.

Find All Duplicates
Write a function (in python) or method (in Java) that accepts a list of integers and returns a list of only those integers that appear more than once.
