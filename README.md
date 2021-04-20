


# Backend-Developer-Take-Home Assignment

A personal solution to the TrueAccord Take Home project
- Java 16
- IntelliJ IDE
- Maven
- First README
- My Testing needs work


## Contact Me
You can reach me at the following:
- **[Email](mailto:jkeough1987@live.com)** 
- **[FaceBook](https://www.facebook.com/Jkeough1987/)** 
- **[LinkedIn](https://www.linkedin.com/in/Jkeough1987/)** 

## Project status
This project still has a lot of improvements that can be made. Working full time and maintaning a family with 3 kids I managed what I could in the time provided.

## Future Improvements
1. Simplify the code better into static services and utilities to build a library that could be reused by other projects.
2. Clean up code and add try catch for any issue handling.
3. Testing, testing, and more testing. I have not created any test cases for my code in the past, and see that I have lots of room for improvement.

## Installation
1. Place jar file in directory of your choice along with the provided batch script(Backend_Developer_Take_Home_Run.bat).
   1. File locations: out/artifacts/backend_developer_take_home_jar/
2. Verify Java 16 JRE is configured on your machine. 
3. Run from cmd line or double click .bat file to run. 
4. Please not the .bat must be in the same directory as the .jar

## Usage
- Prints Debts from provided Debt Service to STDOUT
- **[Debts Service URL](https://my-json-server.typicode.com/druska/trueaccord-mock-payments-api/debts)**
- Additional Services used in project:
- **[Payments Service URL](https://my-json-server.typicode.com/druska/trueaccord-mock-payments-api/payments)**
- **[PaymentPlans Service URL](https://my-json-server.typicode.com/druska/trueaccord-mock-payments-api/payment_plans)**
- The ToString method in Debts.java could be modified to output all debt objects with associated Payments and PaymentPlan included. 
#### Example Output
- Debt{id=0, amount=123.46, isInPaymentPlan=true, remainingAmount=0.0, nextPaymentDueDate='null'}
- Debt{id=1, amount=100.0, isInPaymentPlan=true, remainingAmount=50.0, nextPaymentDueDate='2021-04-24'}
- Debt{id=2, amount=4920.34, isInPaymentPlan=true, remainingAmount=607.6700000000001, nextPaymentDueDate='2021-04-21'}
- Debt{id=3, amount=12938.0, isInPaymentPlan=true, remainingAmount=622.415, nextPaymentDueDate='2021-04-24'}
- Debt{id=4, amount=9238.02, isInPaymentPlan=false, remainingAmount=9238.02, nextPaymentDueDate='null'}



## Author and about
**Joshua Keough**
- Senior Software Developer working with Symitar DataBase Language(PowerOn).
- Currently, developing a REST API to allow external users/departments the ability to access the Core Parameters using the SymXchange SOAP API.
- Mostly Self taught on Programming languages and frameworks outside the Symitar Environment. 
- Father of three kids ages(10,11,12).
- Half my day is watching YouTube or searching Google to find new and improved ways to solve Credit Union problems. 

### Notes
While creating the README file I found that the Service URLs provided actually worked. I assumed they were dummy endpoints the way I interpreted the project guidlines.
I honestly didn't attempt to hit the endpoints with my code. To test I was supplying the objects with hard coded values. Once realizing they worked I tried running the program against the URL's and well it was broken. The issue was with the InputStream and how I was handling it. 
  Being so late in the day and with the promise to have this delivered tonight I fixed the issue and have it working now but did not update any test code. Honestly it probably would be better to send without the little bit of test code I tried to create lol. Anyways this is how I solved the problem and even if no position is offered I would stil like any feedback. In my current position I have created a few REST API's returning JSON but havent had the need to consume it yet. It was nice to have a reason to learn since I'm sure ill need it eventually down the road. 