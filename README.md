# DrawingApplication
Assignment #1 for CS351

• (Weight: 15%) Shape is an abstract class. The x and y are the coordinates of the shape position
on the screen.

• (Weight: 15%) Shape implements a Drawable interface. All what it does in the draw method is it
tells the user that this is just an abstract shape and it can’t be drawn.

• (Weight: 20%) Ellipse and Rectangle have a height and width (Figure 2 shows what they mean).
They both implement a draw function. It draws the shape based on Java’s Graphics object.

• (Weight: 40%) The drawing application keeps track of a collection of drawables (shapes that
implement the drawable interface). It also overrides the paintComponent function (defined in
JFrame). In the method, you should write a piece of code that iterates through the drawables
and simply call the draw function of all of them.

• (Weight: 10%) Of course, to test the program, you need to add a few shapes to your drawing
applications. 
