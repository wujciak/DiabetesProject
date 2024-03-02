# TheDiabatesProject is used for reading, data manipulation, and saving them to a JSON file format. The project was independently developed by Jakub Wójciak as part of the Advanced Object-Oriented Programming 1 course.

# Program Operation Principle.
1. Run the Main.java class.
2. The console will prompt the user to enter the path to the JSON file from which we want to retrieve data. An example file is included with the project in the src/main/java/projectData.json folder.
3. The program should display patient data and individuals with either high or low blood sugar levels in the console.
4. The program will ask the user to provide the path to the file where the output data containing blood sugar level assessments should be saved.
5. The program will conclude its operations, and the provided file should contain the saved data.
# Below, I'll describe the functionality of the classes included in the project.
## Diabetic.java class
The Diabetic class serves as an object representation of a diabetic individual. Its fields store basic information describing the object, including the individual's name, blood sugar level, and blood sugar level assessment. The class includes a constructor and getters and setters for each field.
## SugarLevelStatus.java class
The SugarLevelStatus class is an ENUM type storing 4 values representing blood sugar level assessments. When reading data, the blood sugar level is initially unknown, but as the program runs, a blood sugar level assessment is assigned to each diabetic individual.
## DiabetesDataException.java class
The DiabetesDataException class represents a custom exception.
## ReadJSON.java class
The ReadJSON class is responsible for reading data from a JSON file and then saving it in a list (List<Diabetic>) of objects represented by the Diabetic class. The class includes a readData function that returns a list of diabetics. The readData method handles exceptions for DiabetesDataException, IOException, and JSONException.
## DiabetesOperations.java class
The DiabetesOperations class is responsible for analyzing a diabetic individual's blood sugar level and displaying appropriate information in the console. It includes the updateSugarLevelStatus method, which takes a list of diabetics, analyzes them, and then assigns them an appropriate ENUM value based on their blood sugar level. Another method, showAllDiabetics, takes a list of diabetics and displays information about them in the console along with their blood sugar level assessment. The class also includes methods showHighSugarLevelNames and showLowSugarLevelNames, which take a list of diabetics and display the names of individuals with either high or low blood sugar levels.
## WriteJSON.java class
The WriteJSON class aims to retrieve the modified list of diabetics and save the data from this list to a JSON format file. The data is saved in a new file. The writeData method handles exceptions for DiabetesDataException and JSONException.
## Main.java class
This class demonstrates the project's functionality. It prompts the user to enter the path to the JSON file from which they want to read data. After performing the necessary actions, the program will again ask for the path to the file where we want to save our output data.
## Testing Methods
The project includes tests for two classes: DiabeticTest and DiabetesOperationsTest.
