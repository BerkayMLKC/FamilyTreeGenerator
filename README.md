# Family Tree Generator

This project aims to create a family tree using object-oriented programming principles, leveraging pre-existing individual data to perform various functionalities like finding individuals with the same name, identifying those continuing their ancestors' profession, and more.

## Table of Contents

1. [Overview](#overview)
2. [Features](#features)
3. [Setup and Installation](#setup-and-installation)
4. [Usage](#usage)
5. [Classes and Methods](#classes-and-methods)
6. [Technologies Used](#technologies-used)
7. [Acknowledgements](#acknowledgements)
8. [Sources](#sources)

## Overview

This project, completed as part of a university programming lab, focuses on processing individual data to generate a family tree. The project involves reading data from a CSV file, creating objects for each individual, and providing functionalities through a user-friendly interface to explore and manipulate this data.

### Objectives

- Develop a family tree based on provided individual data.
- Implement functionalities to identify individuals with the same name.
- Find individuals continuing their ancestors' profession.
- Enhance the program's usability with a graphical user interface (GUI).

## Features

- **Family Tree Generation**: Create a family tree from individual data.
- **Name Search**: Identify individuals with the same name.
- **Profession Search**: Find individuals continuing their ancestors' profession.
- **Blood Type Search**: Search for individuals based on their blood type.
- **User-Friendly Interface**: GUI developed with Java Swing for better user interaction.

## Setup and Installation

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- IDE such as Visual Studio Code or IntelliJ IDEA
- CSV file with individual data (template provided in `data/` directory)

### Installation Steps

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/200202087/familytreegenerator.git
    cd familytreegenerator
    ```

2. **Compile the Java Files**:
    ```bash
    javac -d bin src/*.java
    ```

3. **Run the Application**:
    ```bash
    java -cp bin Main
    ```

4. **Load the Data**:
    - Place your CSV file in the `data/` directory.
    - The application will prompt you to select this file for loading individual data.

## Usage

1. **Launching the Program**:
    - Run the main class `Main.java` from your IDE or terminal.

2. **Navigating the Menu**:
    - The program will open with a menu providing options to explore various functionalities.

3. **Executing Functionalities**:
    - Select the desired functionality such as searching for individuals by name or profession.

4. **Viewing Results**:
    - Results are displayed in a pop-up window, with options to save or export data if needed.

## Classes and Methods

### Main Classes

- **`Main`**:
  - Entry point of the application, manages GUI and user interactions.
  
- **`Person`**:
  - Represents an individual with attributes like ID, name, surname, birth date, parents, blood type, and profession.

- **`FamilyTree`**:
  - Manages the collection of `Person` objects, providing methods to search and manipulate the data.

### Key Methods

- **`loadData(String filePath)`**:
  - Loads individual data from a CSV file.

- **`findPersonsByName(String name)`**:
  - Finds and returns a list of persons with the specified name.

- **`findPersonsByProfession(String profession)`**:
  - Finds persons continuing their ancestor's profession.

- **`getBloodTypeMatches(String bloodType)`**:
  - Returns persons with the specified blood type.

## Technologies Used

- **Java**: Core programming language for developing the application.
- **Java Swing**: Used for creating the graphical user interface.
- **CSV Parsing**: Reading and processing data from CSV files.
- **Git**: Version control for managing project code.

## Acknowledgements

- **Prof. Ahmet SAYAR**: For providing guidance and course materials on object-oriented programming.
- **Kocaeli University**: For the educational support and resources.

# Sources

You can review the project code [here](Main.java).

You can review the project family datas [here](/data).

You can review the project report [here](FamilyTreeRep.pdf).
