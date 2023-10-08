# spring-boot-Loan-Amortization-Schedule
Just a loan amortization application using spring-boot and Thymeleaf.

## Versions
<table>
  <tr>
    <th>Tags&#92;Versions</th>
    <th>Description</th>
    <th>Date</th>
  </tr>
  <tr>
    <td>0.90</td>
    <td>Initial prototype.</td>
    <td>Oct 6, 2023</td>
  </tr>
  <tr>
    <td>1.0.0</td>
    <td>Initial release.</td>
    <td>Oct 7, 2023</td>
  </tr>
  <tr>
    <td>1.0.1</td>
    <td>Refactored unnecessary controller logic into separate Service classes.</td>
    <td>Oct 8, 2023</td>
  </tr>
  <tr>
    <td>1.0.2</td>
    <td>In progress...</td>
    <td></td>
  </tr>
</table>

## TO-DO

- On the amortization page, be able to add an increase payment at any point during the loan term and recalculate the ending date (with remainder).
- If user enters desired loan payment, clear the 'durationInMonths' field, and calculate the loan term with that payment.  Do not allow infinity.

## Features

1. Displays all payment dates during the loan amortization.
2. Supports compounded "end of period" payment type as well as up-front payment type.
3. Variable interest rate.
4. Variable initial loan balance.
5. Will calculate a arbitrary future value.
6. Calculates monthly payment.

## How-To

1. Install Maven: Make sure you have Apache Maven installed on your local system. You can download it from the official website: [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi).

2. Set MAVEN_HOME and Add to PATH: After installing Maven, set the `MAVEN_HOME` environment variable to the Maven installation directory, and add Maven's `bin` directory to your `PATH` variable. This allows you to run Maven commands from any terminal.

3. Install Java 1.8 JDK: Ensure you have Java 1.8 JDK (Java Development Kit) installed on your system. You can download it from the Oracle website or use an open-source distribution like OpenJDK.

4. Import Project into IDE: Import the Maven project into your preferred Integrated Development Environment (IDE). Common choices include IntelliJ IDEA, Eclipse, or Spring Tool Suite. Your IDE should have built-in support for importing Maven projects.

5. Build the Application: Using Maven, open a terminal or use your IDE's Maven plugin to build the application. Navigate to the project's root directory and run the following command:

   mvn clean install

   This command will clean the project, download dependencies, and build the application.

6. Run the Application: To run the application, execute the following Maven command:

   mvn spring-boot:run

   Alternatively, you can create a run configuration in your IDE to run the Spring Boot application.

7. Access the Application: Once the application is running, open your web browser and navigate to [http://localhost:8080/] to access the application locally.

## Images Of Application

- Schedule page:

![alt text](https://raw.githubusercontent.com/cyrus43/spring-boot-mortgage-calculator/master/schedule.png)

