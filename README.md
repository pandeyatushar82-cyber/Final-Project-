**Question 1: HealthProfile**

Explanation:
This program checks a person's body fat percentage and places them into a health category. If the body fat is less than 14, it prints "Athletic". If it is between 14 and 24, it prints "Fit". Otherwise, it prints "Regular". The if-else if-else structure ensures that only one category is displayed.

**Question 2: MoistureAnalysis**

Explanation:
This program stores seven days of soil moisture readings in an array. A for loop goes through each value and compares it with the target moisture level of 45. The differences are added together to find the total variance. Using .length allows the loop to automatically work with the size of the array.

**Question 3: VolumeCalculator**
Explanation:
This program uses method overloading to calculate volume. One method calculates the volume of a cube using one side length. Another method calculates the volume of a cuboid using length, width, and height. Both methods have the same name but different parameters.

**Question 4: SeatManagement**

Explanation:
This program uses an ArrayList to manage theater seats. Seats are added to the list, one seat is removed when a customer cancels, and a new seat is added. ArrayList is useful because its size can change automatically, unlike a normal array.

**Question 5: StudentManagement**

Explanation:
This program creates student objects using the new keyword. Each student has a name and marks. The display() method prints the student's information. The dot (.) operator is used to access the object's methods and data.

**Question 6: PayrollSystem**

Explanation:
This program demonstrates abstraction. The Employee class contains an abstract method called calculateBonus(). The Manager and Consultant classes provide their own bonus calculation methods. This allows different employee types to calculate bonuses in different ways.

**Question 7: ShippingValidation**

Explanation:
This program checks whether a package weight is valid. The NOT operator (!) reverses the value of a boolean variable. If the weight is invalid, the program immediately displays an error message and rejects the package.

**Question 8: TemperatureAnalysis**

Explanation:
This program stores temperature values in an array. It uses a loop to calculate the total and find the highest temperature. After the loop, it calculates the average temperature and displays both the average and maximum values.

**Question 9: InterestCalculator**

Explanation:
This program uses a user-defined method to calculate compound interest. The method receives the principal amount, interest rate, and time period as parameters. It performs the calculation and returns the final amount back to the main method.

**Question 10: DriverManagement**

Explanation:
This program manages a list of drivers using an ArrayList. A new driver is inserted at a specific position using add(index, element). The existing drivers automatically move one position to the right, so no data is lost.

**Question 11: VehicleRegistration**

Explanation:
This program demonstrates the use of the super keyword. The ElectricTruck class inherits from the Vehicle class. The super() constructor is used to send the brand name to the parent class so that it can be properly initialized.

**Question 12: BankAccount**

Explanation:
This program demonstrates encapsulation. The account balance is declared as private, so it cannot be accessed directly from outside the class. Public getter and setter methods are used to safely read and update the balance. The this keyword refers to the current object's variable.

**Question 13: DepartmentDemo**

Explanation:
This program demonstrates runtime polymorphism. The ScienceDept class overrides the checkBudgetStatus() method of the Department class. Even though a parent reference is used, Java runs the child class method at runtime.

**Question 14: SmartHomeSystem**

Explanation:
This program uses an interface called Appliance. Both SmartFan and SmartLight implement the same interface but perform their tasks differently. Interfaces help create a common set of rules that multiple classes can follow.

**Question 15: BookStore**

Explanation:
This program stores book names in an ArrayList. The forEach() method combined with a lambda expression is used to print each book. This approach is shorter and cleaner than using a traditional loop.

**Question 16: SystemLogger**

Explanation:
This program works with files. It first checks whether daily_log.txt exists. If the file is missing, it creates a new one. Then it writes a startup message into the file. A try-catch block is used to handle any file-related errors safely.
