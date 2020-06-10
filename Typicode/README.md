#  API-TODO TEST FRAMEWORK

The solution is written using REST ASSURED library and verified with Hamcrest Assertions
Used Cucumber for BDD steps.
Used Cucumber PicoContainer for dependency injection
Maven Surefire plugin is used to enable parallel runs. Filter tags option is set with the
surefire plugin to enable selected scenario runs
Test runner is configured to set the path for features and step definitions
The base URI is set with the Hooks file 
Data transfer between steps is handled by the 'StepData' model class

**The tests in the solutions are listed below:**

* Test1 - Get list of all todos
* Test2 - Get a todo [for id=25]
* Test3 - Post a todo
* Test4 - Update a todo [for id=25]
* Test5 - Delete a todo [for id=25]

**'Features' package consists of 4 feature files namely:**
* GetToDo
* PostToDo
* PutToDo and 
* DeleteToDo

 *GetToDo consists of Test1 and Test2*
## Pre-requisite to run the test
* Maven must be installed in the system
[Instructions](https://maven.apache.org/install.html)

## How to run the tests
* Download or clone the project
* Build the project
* Open a command prompt window and navigate to the project folder or open the terminal in an IDE
* Use command 'mvn clean test -DtagName=@apitest' to run the test