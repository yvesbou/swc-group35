##Answers

####Singleton

the singleton design pattern was implemented in
the class game. 
#####How:
we made the constructor of the game class private.
an instance of game can only be made with the function
startgame(). This functions checks, if already,
an instance of game exists. It is also synchronized
to be thread-save.
#####Why:
It is important, that only one instance of game exists,
so that only one game can be played simultaneously.

####Observer

the subject is the class game and the observers are all classes, that implement
the Display interface.

#####How:

Game has the 3 methods:
    removeDisplay: to remove an Observer
    registerDisplay: to add an Observer
    notifyDisplay: to pass the updated information to the displays.
The information passed to the displays are deep copies of the Fleets and Boards
of both players. Those are passed as copies to ensure, that no modification is done
by a display.

#####Why:

With the observer pattern comes also loose coopling. Therfore if we wanted, we could
add more display elements very easy.

####Itertor

The Itertor pattern is implemented as follows: placement positions of the boats from the computerplayer
and the humanplayer are passed to fleet. But they have different data types. So we implemented
an Iterator to loop through both placements.

#####How:

HumanPlayer and ComputerPlayer implement both the interface Player, which declares 
the function createIterator, which returns an instance of class iterator. 
(iterator with little i to avoid confusions with the java.util.Iterator).
ComputerPlacementIterator and HumanPlacementIterator implement both the interface
iterator. ComputerPlacementIterator iterates over the Arraylist, which
is returned by Computerplayer for the placements of the Boats in the instance of Fleet.
HumanPlacementIterator iterates over the Array, which is returned by the Human player.

####Why:

It could happen, that for different algorithms of getting the placements of the boats,
different data types are better suited and to read out the placements in the instance of Fleet,
we then only need to make one loop to read out both data types, if we implement the 
iterator design pattern. Additionally if someone other designs his own
Player, with yet another datatype, we can then easily integrate it to our project.

