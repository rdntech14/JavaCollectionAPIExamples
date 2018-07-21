JAVA Collection API Examples
=====

This demo shows how to use JAVA collection api and 2d Array

Collection API has 3 interfaces and their concrete implementation is also available in Collection API.

1) List
2) Set
3) Map

***List***

List in Java provides ordered and indexed collection which may contain duplicates. 

***Properties***

1) May contain duplicate
2) maintains insertion order or element
3) The list allows null elements and you can have many null objects in a List because it also allowed duplicates

***List implementation*** --> ArrayList, LinkedList, Vector

ArrayList is more general purpose and provides random access with index, 

LinkedList is more suitable for frequently adding and removing elements from List. 

Vector is synchronized ( thread safe) counterpart of ArrayList.

***Set***

The Set interface provides an unordered collection of unique objects, i.e. Set doesn't allow duplicates, 

***Properties***

1) Do not contain duplicate
2) no guarantee on which order element will be stored
3) Set just allow one null element as there is no duplicate permitted

LinkedHashSet maintains order.

***Set Implementation*** : HastSet, LinkedHashSet, TreeSet

TreeSet keeps elements in a sorted order specified by compare() or compareTo() method.


***Map***

Map provides a data structure based on key-value pair and hashing. 

***Properties***

1) Map holds two objects per Entry e.g. a key and a value and It may contain duplicate values but keys are always unique
2) Map you can have null values and at most one null key.

***Map Implementation*** : HashMap, LinkedHashMap, Hashtable, TreeMap

HashMap is the non-synchronized general purpose Map implementation, do not provide any ordering guarantee

HashTable is synchronized (thread safe) counterpart of HaspMap. both do not provide any ordering guarantee

LinkedHashMap provides ordering guarantee

TreeMap is also a sorted data structure and keeps keys in sorted order



