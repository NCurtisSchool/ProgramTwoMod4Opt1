/*
Name: Nathan Curtis
Date: 11/3/2024
Class: Computer Programming II 24FD-CSC372-1
Teacher: Luis Gonzalez
Assignment Name: Implementing Abstract Classes using Shapes
GitHub: https://github.com/NCurtisSchool/ProgramTwoMod4Opt1.git
*/

import java.util.Scanner;

public class ShapeArray {
    public static void main(String[] args) {
        // Create array[3]
        String[] arrShapes = new String[3];

        // Get radius for sphere
        try ( 
            // open Scanner
            Scanner userInput = new Scanner(System.in)) {
            // Get radius for sphere
            double sphereRadius;
            System.out.println("Enter the spheres radius: ");
            sphereRadius = userInput.nextDouble();
            // Create sphere
            Sphere newSphere = new Sphere(sphereRadius);
            // Add sphere to array
            arrShapes[0] = newSphere.toString();
            // Get raidus of cylinder
            double cylinderRadius;
            System.out.println("Enter the cylinders radius: ");
            cylinderRadius = userInput.nextDouble();
            // Get height of cylinder
            double cylinderHeight;
            System.out.println("Enter the cylinders height: ");
            cylinderHeight = userInput.nextDouble();
            // Create cylinder
            Cylinder newCylinder = new Cylinder(cylinderRadius, cylinderHeight);
            // Add cylinder to array
            arrShapes[1] = newCylinder.toString();
            // Get radius of cone
            double coneRadius;
            System.out.println("Enter the cones radius: ");
            coneRadius = userInput.nextDouble();
            // Get height of cone
            double coneHeight;
            System.out.println("Enter the cones height: ");
            coneHeight = userInput.nextDouble();
            // Create cone
            Cone newCone = new Cone(coneRadius, coneHeight);
            // Add cone to array
            arrShapes[2] = newCone.toString();
            //Close scanner
        }

        // Loop through array printing toString of each class
        for (String arrShape : arrShapes) {
            System.out.println(arrShape);
        }
    }
}
