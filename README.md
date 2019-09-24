# SENG560
This library provides arithmetic functions.  It has been tested with JDK 11 LTS version, JUnit 5, and Eclipse IDE version 2019-06.  
To use it import the java package "edu.wvu.seng560.arithmeticLibrary"  

Use the following methods according to number system:  
decimal (integers and floating points):  add, subtract, multiply, divide, squareRoot, power  
binary: addBin, subtractBin, multiplyBin, divideBin, squareRootBin, powerBin  
octal:  addOct, subtractOct, multiplyOct, divideOct, squareRootOct, powerOct  
hexadecimal:  addHex, subtractHex, multiplyHex, divideHex, squareRootHex, powerHex  

Above methods take arguments the same way.  The argument types and return types are always as String.  
For reference here they are shown for the decimal variants:  
String add(String x, String y):  returns the sum of x and y  
String subtract(String minuend, String subtrahend):  returns the difference of minuend - subtrahend  
String multiply(String x, String y):  returns the product of x and y  
String divide(String dividend, String divisor):  returns the division of dividend by divisor.  Note that the quotient is rounded off to 5 decimal places.  
String squareRoot(String radicand):  returns the square root of radicand  
String power(String base, String exponent):  returns the power of base raised to the exponent  

The binary, octal, and hexadecimal variants take arguments and return results the same way as shown above, except the input values and the result returned will be in the respective number system.

Use the below listed methods for conversion between number systems.  All take a single String argument of the value to convert and return a String result with the converted value.  

binary to integer: binToInt  
octal to integer: octToInt  
hexadecimal to integer: hexToInt  

binary to octal: binToOct  
integer to octal: intToOct  
hexadecimal to octal: hexToOct  

binary to hexadecimal: binToHex  
octal to hexadecimal: octToHex  
integer to hexadecimal: intToHex  

## Reusability
A couple of measures were taken to ensure the library was reusable:  
1. Convenience methods are provided for ease of use even though conversion methods are already included.  The convenience methods save the library user from having to make extra calls to the conversion methods.  The convenience methods utilize the conversion methods internally.
2. String types are used for input values in all methods.  This makes it easy for the library user since the input they are going to be collecting will most likely be from the console or a GUI box and captured into a String type and won't have to keep separate int, float, and double variables to hold different types of input values.  They can just use a String type, pass it in to this library's methods, and get the result returned as a String type also. 