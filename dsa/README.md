## ADT for a University Course Registration System

This ADT Contract uses one course and numerous student are registering.


Initially I was going to go for abstraction, where abstract classes hold the desginand conrete classes hold the implementation. But that resulted into being extensive, as having two separate clsses operate together become cumbersome. So i settled on a single class with an inner class. Course being the class and student being the inner class, that way one course object is created and and it will contain an array of students.

## JAVA COLECTION USED- HASHMAP

Initially an array list was going to be used, but the rule of no dupplicate ruled it out, then hashset came into the picture since it hold unique values and every duplicate is removed.It also has o(1) time complexity for all actions amking it efficient, but in a university system with many students, mutiple students can have the same name which will lead to duplicates,so students are given unique id for identification, that leads to the question how are we going to store the registered students and their ids, since hashset takes only one value. Hashmap, this data structure takes in a key and it's value, it allows duplicate values but unique keys, so names can be the same but different ids, making each student unique. In terms of complexity it fuctions the same as hashset since they are both backed by hash table. Look up is done with key and not value. Because of duplicates, look up using value result in linear time 0(n) but look with key will i.e ids will always result in constant time.

