# DiabatesProject służy do odczytu, operacji na danych oraz zapisywaniu ich do pliku w formacie JSON.
# Projekt został wykonane samodzielnie przez Jakuba Wójciaka w ramach kursu Zaawansowane Programowanie Obiektowe 1.
Poniżej opiszę funkcjonalność klas zawartych w projekcie.
## Diabetic.java class
Klasa Diabetic służy jako obiektowa reprezentacja cukrzyka. 
Pola przechowują podstawowe informacje jakie mogą opisywać dany obiekt, czyli:
imię i nazwisko cukrzyka,
poziom cukru,
ocena poziomu cukru.
Klasa zawiera konstruktor oraz getter i settery dla każdego pola.
## SugarLevelStatus.java class
Klasa SugarLevelStatus jest typem ENUM przechowującym 4 wartości repreentujące ocene poziomu cukru.
Przy odczycie danych poziom cukru jest nieznany,
natomiast wraz z działanem programu ocena poziomu cukru jest przypisywana do każdego cukrzyka.
## DiabetesDataException.java class
Klasa DiabetesDataException jest klasą reprezetującą własny wyjątek.
## ReadJSON.java class
Klasa ReadJSON ma za zadanie odczytać dane zawarte w pliku typu JSON,
a następnie zapisać je w liście (List<Diabetic> diabeticList) obiektów reprezentowanych przez klasę Diabetic.
Klasa zawiera funkcję readData która zwraca listę cukrzyków.
Metoda readData zawiera kontrolę wyjątków dla DiabetesDataException, IOException oraz JSONException.
## DiabetesOperations.java class
Klasa DiabetesOperations ma za zadanie analizować poziom cukru cukrzyka oraz wyświetlanie w konsoli odpowiednich informacji.
Zawiera ona metodę updateSugarLevelStatus, która przyjmuje listę cukrzyków i analizuje,
a następnie przypisuje im odpowiednią wartość typu ENUM w zależności od ich poziomu cukru.
Kolejną metodą jest showAllDiabetics, która przyjmuje listę cukrzyków i wyświetla w konsoli informację o nich wraz z oceną poziomu cukru.
Klasa zawiera także metody showHighSugarLevelNames oraz showLowSugarLevelNames,
które przyjmują listę cukrzyków wyświetlając imiona i nazwiska osób z zbyt wysokim lub zbyt niskim poziomem cukru.
## WriteJSON.java class
Klasa WriteJSON ma na celu pobranie zmodyfikowanej już listy cukrzyków i zapisanie danych z tej listy w pliku o formacie JSON.
Dane zapisywane są w nowym pliku. 
Metoda writeData obsługuje wyjątki DiabetesDataException oraz JSONException.
## Main.java class
Klasa prezentująca działanie projektu. Klasa poprosi użytkownika o podanie ścieżki pliku JSON z jakiego chce odczytać dane.
Po wykonaniu odpowiednich działań program ponownie poprosi o ścieżkę pliku w którym chcemy zapisać nasze dane wyjściowe.
## Metody testujące
Projekt zawiera testy dla dwóch klas: DiabeticTest oraz DiabetesOperationsTest.
