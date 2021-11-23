# Maze-Generator
A maze generating algorithm that utilizes a Union-Find data structure to create mazes.  

https://user-images.githubusercontent.com/76058143/142996867-eeaf94fb-6580-4c14-90c5-142dec540ccd.mp4


This program generates a maze of size n by n (where n is an input). The entrance to entrace to the maze is on the top left and the exit on the bottom right. 
There must be exactly one path from the entrance to the exit and every cell must be reachabe from every other cell. The maze must also not contain cycles.

How the Algorithm works

1. Begin with a grid that has all possible walls present (except for the walls leading to “outside” for the entrance and exit).
2. While there exists a wall that is safe to remove:
      (a) Choose such a wall at random.
      (b) Remove the chosen wall from the grid.



