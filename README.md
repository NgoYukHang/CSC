# CSC3100: PROBLEM SOLVING AND PROGRAMMING CONCEPTS

## Compile java source code
1. Compile source code with `javac Example.java` into `Example.class`
2. Run with `java Example`

## Compile package
1. Navigate to just one layer outside of package directory
```
Folder   < Navigate to here
│
└───Package
      first.java
      second.java
```
2. Compile every source code in the package with `javac -d . Package/*` into classes
3. Run the class with main function inside by `java Package/main`

## Using git
1. Add current directory to staging area with `git add .`
2. Add commit with `git commit -m "describe the change"`
3. Check staging area with `git status`
4. Add repo with `git remote add origin git@github.com:NgoYukHang/CSC.git`
5. Push change to master branch with `git push -u origin master`
6. Might want to pull if there is difference between local and remote repository with `git pull`

## Lab 1
1. [HelloWorld.java](https://github.com/NgoYukHang/CSC/blob/master/lab1/HelloWorld.java) prints Hello World!.
2. [Name.java](https://github.com/NgoYukHang/CSC/blob/master/lab1/Name.java) prints student name.
3. [Student.java](https://github.com/NgoYukHang/CSC/blob/master/lab1/Student.java) prints student info.
4. [Welcome.java](https://github.com/NgoYukHang/CSC/blob/master/lab1/Welcome.java) prints text about Welcome Java Programming.
5. [MakingMoneyATM.java](https://github.com/NgoYukHang/CSC/blob/master/lab1/MakingMoneyATM.java) provides a simple welcome screen forATM service in console.

## Lab 2
1. [AverageNumber.java](https://github.com/NgoYukHang/CSC/blob/master/lab2/AverageNumber.java) computes average of three numbers.
2. [DiscountCalculator.java](https://github.com/NgoYukHang/CSC/blob/master/lab2/DiscountCalculator.java) calculates the sale price of an item after percentage discount.
3. [WeightUnitConverter.java](https://github.com/NgoYukHang/CSC/blob/master/lab2/WeightUnitConverter.java) converts weight of a parcel from pounds to kilograms.
4. [BMICalculator.java](https://github.com/NgoYukHang/CSC/blob/master/lab2/BMICalculator.java) calculates BMI from height and weight.

## Lab 3
1. [RightTriangle.java](https://github.com/NgoYukHang/CSC/blob/master/lab3/RightTriangle.java) computes the perimeter and area of a right triangle with user-provided length sides of a and b.
2. [Rectangle.java](https://github.com/NgoYukHang/CSC/blob/master/lab3/Rectangle.java) computes the perimeter and area of the rectangle with specific width and height.
3. [lab3.pdf](https://github.com/NgoYukHang/CSC/blob/master/lab3/lab3.pdf) contains the Problem Analysis Chart (PAC), Input Process Output (IPO), Flowchart, Pseaudocode and the screenshot of Java code of the [RightTriangle.java](https://github.com/NgoYukHang/CSC/blob/master/lab3/RightTriangle.java).

## Lab 4
1. [PackageQuantityDiscountCalculator.java](https://github.com/NgoYukHang/CSC/blob/master/lab4/PackageQuantityDiscountCalculator.java) computes the price of packages after a certain discount which based on quantity purchased.
2. [MenuInRestaurant.java](https://github.com/NgoYukHang/CSC/blob/master/lab4/MenuInRestaurant.java) displays the menu in a restaurant.
3. [GradeCalculator.java](https://github.com/NgoYukHang/CSC/blob/master/lab4/GradeCalculator.java) finds the grade of a student after inputting marks for each tests.
4. [VendorDiscountCalculator.java](https://github.com/NgoYukHang/CSC/blob/master/lab4/VendorDiscountCalculator.java) computes the price after buying from the vendor which give discount based on purchase and quantity.
5. [DynamicTieredBillingSystem.java](https://github.com/NgoYukHang/CSC/blob/master/lab4/DynamicTieredBillingSystem.java) provides a interface for calculating the user's monthly electricty bill based on their consumption, user category and peak hours.
6. [lab4.pdf](https://github.com/NgoYukHang/CSC/blob/master/lab4/lab4.pdf) contains the Problem Analysis Chart (PAC), Input Process Output (IPO), Flowchart, Pseaudocode and the screenshot of Java code of the all the [lab4](https://github.com/NgoYukHang/CSC/tree/master/lab4) tasks.

## Lab5
1. [Lab5Part1.java](https://github.com/NgoYukHang/CSC/blob/master/lab5/Lab5Part1.java) manipulates strings provided from users, especially replace the second string contains in the first string with "Selamat Datang".
2. [Lab5Part2.java](https://github.com/NgoYukHang/CSC/blob/master/lab5/Lab5Part2.java) checks validity of the password provided and offers ability to add more string at the behind of the password.
3. [lab5.pdf](https://github.com/NgoYukHang/CSC/blob/master/lab5/lab5.pdf) contains the Problem Analysis Chart (PAC), Input Process Output (IPO), Flowchart, Pseaudocode and the screenshot of Java code of the all the lab5 tasks.

## Lab6 
1. [MailOrderHouse.java](https://github.com/NgoYukHang/CSC/blob/master/lab6/MailOrderHouse.java) calculates total retail valut of all product sold.
2. [ZooNegaraFeeCalculator.java](https://github.com/NgoYukHang/CSC/blob/master/lab6/ZooNegaraFeeCalculator.java) calculates the total ticket fee based on the user nationality, age group and number of ticket.
3. [HealthCalculator.java](https://github.com/NgoYukHang/CSC/blob/master/lab6/HealthCalculator.java) calculates the BMI and determines the user's risk of health diseases and diabetes.
4. [MileageClaim.java](https://github.com/NgoYukHang/CSC/blob/master/lab6/MileageClaim.java) calculates the travel claim of the staff by providing the distance travelled.
5. [lab6.pdf](https://github.com/NgoYukHang/CSC/blob/master/lab6/lab6.pdf) contains the Problem Analysis Chart (PAC), Input Process Output (IPO), Flowchart, Pseaudocode and the screenshot of Java code of the all the lab6 tasks.

## Lab7
1. [TemperatureUnitConverter.java](https://github.com/NgoYukHang/CSC/blob/master/lab7/TemperatureUnitConverter.java) converts temperature celsius to fahrenheit and vise versa from a certain range of temperature. 
2. [Lab7Q2.java](https://github.com/NgoYukHang/CSC/blob/master/lab7/Lab7Q2.java) calculates differences, quotients and remainders between 2 integers entered by user.
3. [GradeCalculatorWithMethods.java](https://github.com/NgoYukHang/CSC/blob/master/lab7/GradeCalculatorWithMethods.java) is the continuation of [GradeCalculator.java](https://github.com/NgoYukHang/CSC/blob/master/lab4/GradeCalculator.java) in Lab 4 but the code is organised with methods.
4. [AverageCalculator.java](https://github.com/NgoYukHang/CSC/blob/master/lab7/AverageCalculator.java) calculates the average of 5 numbers entered by user.
5. [MoneyConverter.java](https://github.com/NgoYukHang/CSC/blob/master/lab7/MoneyConverter.java) converts MYR to USD, GBP or SAR.

## Lab8
1. [Lab8Q1.java](https://github.com/NgoYukHang/CSC/blob/master/lab8/Lab8Q1.java) generates N numbers between 120 to 500 and find numbers that are divisible by 3, 10 or both.
2. [Lab8Q2.java](https://github.com/NgoYukHang/CSC/blob/master/lab8/Lab8Q2.java) accepts any numbers entered by user and then find the smallest number and its occurence.
3. [Lab8Q3](https://github.com/NgoYukHang/CSC/tree/master/lab8/Lab8Q3) is the package for the code of improved version of [GradeCalculatorWithMethods.java](https://github.com/NgoYukHang/CSC/blob/master/lab7/GradeCalculatorWithMethods.java) with ability to enter multiple student and find the top and bottom scorer and also total number of students with each grades. The package contains 3 java files with the main function at [GradeCalculatorWithMethodsAndArray.java](https://github.com/NgoYukHang/CSC/blob/master/lab9/Lab8Q3/GradeCalculatorWithMethodsAndArray.java). [Student.java](https://github.com/NgoYukHang/CSC/blob/master/lab8/Lab8Q3/Student.java) is the class for Student object to simplify the code. [Task,java](https://github.com/NgoYukHang/CSC/blob/master/lab8/Lab8Q3/Task.java) only contains enums for each test names to avoid using numbers as index.
4. [Lab8Q4.java](https://github.com/NgoYukHang/CSC/blob/master/lab8/Lab8Q4.java) generates 10 by 6 array with random generated numbers between 0 to 1000 and find the smallest number with its occurence.
5. [Lab8Q5.java](https://github.com/NgoYukHang/CSC/blob/master/lab8/Lab8Q5.java) generates 5 by 5 array with 0 or 1 and find the row and column with the most 1s.
