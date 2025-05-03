# Number Pyramid

## Overview
The Number Pyramid is a simple Java console application that generates a pyramid of numbers based on user input. The user specifies the number of rows, and the program prints a pyramid structure with increasing numbers in each row.

## Features
- Generates a pyramid of numbers based on the specified number of rows.
- User-friendly console interface for input and output.
- Utilizes nested loops to create the pyramid structure.

## Technologies Used
- Java (JDK 8 or higher)

## Getting Started
To run the Number Pyramid application locally, follow these steps:

1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd number-pyramid
   ```

2. **Compile the Java Program**:
   Open a terminal and navigate to the directory containing the `NumberPyramid.java` file. Compile the program using:
   ```bash
   javac NumberPyramid.java
   ```

3. **Run the Program**:
   After successful compilation, run the program using:
   ```bash
   java NumberPyramid
   ```

4. **Follow the Prompts**:
   - Enter the number of rows for the pyramid when prompted.

## Example Usage
```
Enter the number of rows for the pyramid: 5
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
```

## Code Explanation
- The program uses the `Scanner` class to read user input.
- It prompts the user to enter the number of rows for the pyramid.
- The outer loop iterates through each row, while the inner loops handle:
  - Printing spaces to align the numbers correctly.
  - Printing the numbers in ascending order for each row.
- After printing each row, the program moves to the next line.

## Error Handling
- The program does not currently handle invalid input (e.g., negative numbers or non-integer values). Consider adding input validation for a more robust application.

## Contributing
Contributions are welcome! If you have suggestions for improvements or new features, please open an issue or submit a pull request.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
- Inspired by the need for a simple tool to visualize number patterns.
- Thanks to the Java community for resources and support.

---


