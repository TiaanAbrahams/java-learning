Sure. Here it is as instructions only, with no code:
1. Create an interface called Mappable.
2. Give that interface one abstract method called render.
3. Create a Point class that implements Mappable.
4. Make Point represent one map location using latitude and longitude.
5. Create a Line class that also implements Mappable.
6. Make Line represent multiple connected locations.
7. Create a Park class that extends Point.
8. Give Park some identifying information, such as a name, as well as its location.
9. Create a River class that extends Line.
10. Give River some identifying information, such as a name, as well as several locations.
11. Create a generic class called Layer.
12. Make Layer accept only types that are Mappable.
13. Give Layer one private field that stores a list of the objects it contains.
14. Add a way to add objects to that list, either through the constructor, a method, or both.
15. Create a method called renderLayer.
16. Inside renderLayer, go through every object in the list.
17. Call that object's render method.
18. In the main method, create a few Park objects with location data.
19. Create a few River objects with multiple location points.
20. Create one Layer specifically for Parks.
21. Add the Park objects to that Layer.
22. Create another Layer specifically for Rivers.
23. Add the River objects to that Layer.
24. Call renderLayer on both Layers and check that every object is rendered.
The main goal of the challenge is to practise creating a generic class that is restricted to a specific interface type.


Notes: Google Maps uses a grid of 256 x 256

For Point:
Western Cape Nature Reserve World Coordinates
    reserve_name	            latitude	longitude	world_x	    world_y
    Cederberg Wilderness Area	-32.4167	19.2500	    141.6889	152.3903
    West Coast National Park	-33.1564	18.0642	    140.8457	153.0160
    Jonkershoek Nature Reserve	-33.9500	18.9167	    141.4519	153.6932
    Kogelberg Nature Reserve	-34.3214	18.9100	    141.4471	154.0123
    De Hoop Nature Reserve	    -34.4600	20.4200	    142.5209	154.1317



