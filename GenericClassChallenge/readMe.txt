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
    reserve_name	             world_x	world_y
    Cederberg Wilderness Area	 141.6889	152.3903
    West Coast National Park	 140.8457	153.0160
    Jonkershoek Nature Reserve	 141.4519	153.6932
    Kogelberg Nature Reserve	 141.4471	154.0123
    De Hoop Nature Reserve	     142.5209	154.1317

For line:
    river_name       point_order    point_description                          world_x     world_y
    Berg River       1              Berg River Dam / Source (Franschhoek)      141.5556    153.6684
    Berg River       2              Paarl Midstream                            141.4851    153.4984
    Berg River       3              Wellington Agricultural Zone               141.4743    153.4120
    Berg River       4              Misverstand Dam Reservoir                  141.2731    152.9273
    Berg River       5              River Mouth (Velddrif Atlantic)            140.9018    152.6991

    Breede River     1              Source Catchment Area (Ceres Mountains)    141.7326    153.2242
    Breede River     2              Worcester Valley                           141.8331    153.4639
    Breede River     3              Swellendam Segment                         142.5502    153.7734
    Breede River     4              Malgas Ferry Crossing                      142.6428    153.9987
    Breede River     5              River Mouth (Witsand Indian Ocean)         142.8206    154.0999

Sample Output:
    Render Grand Canyon National Park as POINT ([40.1021, -75.4231])
    Render Mississippi River as LINE ([[47.216, -95.2348], [29.1566, -89.2495], [35.1556, -90.0659]])

