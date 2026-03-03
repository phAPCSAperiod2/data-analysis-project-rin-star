# AP CSA Mini-Project: Data Analysis with Arrays & File Input

## Project Overview
- [x] Used CSV dataset (Pokémon Generation 1)
- [x] Created custom Java class to represent each Pokémon
- [x] Read file using Scanner
- [x] Stored objects in an array
- [x] Implemented data analysis algorithms
- [x] Reflected on data ethics and quality

## Dataset Information
- Dataset Name: Pokémon Generation 1 Dataset
- Source: https://runestone.academy/ns/books/published/csawesome2/external/_static/datasets/pokemon.csv
- Description:
  - Contains data for the original 151 Pokémon.
  - Includes name, primary type, secondary type, HP, Attack, Defense, Speed, and more.
  - Used to analyze Attack stats and type distribution.

## Guiding Questions
- [x] Which Pokémon has the highest Attack stat?
- [x] How many Pokémon have two types?
- [x] Which types appear most frequently?

## Class Design
- [x] Created `Data` class
- [x] Attributes:
  - pokemon (String)
  - type1 (String)
  - type2 (String)
  - attack (int)
- [x] Constructor initializes all attributes
- [x] Getter methods implemented
- [x] Methods:
  - hasTwoTypes()
  - hasType(String type)
  - toString()

## Column Mapping
- pokemon → Column 1
- type1 → Column 2
- type2 → Column 3
- attack → Column 5

## Algorithms Implemented
- [x] Find maximum Attack value
- [x] Count Pokémon with two types
- [x] Type filtering using hasType()

## Results
- Number of rows loaded: 151
- Highest Attack stat: 134
- Number of Pokémon with two types: 62
- Pokémon with highest Attack: Dragonite

## Data Ethics & Quality Reflection
- Dataset only includes Generation 1 Pokémon.
- Results cannot be generalized to all generations.
- Some Pokémon do not have a secondary type, requiring careful handling of empty values.
- Dataset is structured and consistent but limited in scope.

## Submission Checklist
- [x] Dataset selected
- [x] Guiding question written
- [x] Class created with 3+ attributes
- [x] File reading implemented
- [x] Array of objects created
- [x] At least 2 algorithms implemented
- [x] Findings printed
- [x] Javadoc comments added
- [x] UML diagram included
  - https://drive.google.com/file/d/1EWVfVT2U_rrpZQM_gkc1S4AWvCBIQ79s/view?usp=sharing
- [x] Reflection completed
- [x] Code compiles and runs
