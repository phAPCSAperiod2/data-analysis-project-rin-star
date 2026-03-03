---

# AP CSA Mini-Project: Data Analysis with Arrays & File Input

## Using CSV Files • Arrays of Objects • Algorithms • Data Ethics & Quality

## Project Overview

For this mini-project, we analyzed a Pokémon dataset containing the original 151 Pokémon from Generation 1. We designed a custom Java class to represent each Pokémon, read data from a CSV file using `Scanner`, stored the objects in an array, and implemented algorithms to analyze the dataset.

This project demonstrates:

* Arrays of objects
* File input using `Scanner`
* Class design (attributes, constructor, methods)
* Data analysis algorithms (maximum, counting, filtering)
* Data ethics and quality reflection
* Documentation with Javadoc
* UML class diagram

---

## Dataset Information

**Dataset Name:** Pokémon Generation 1 Dataset

**Source:**
[https://runestone.academy/ns/books/published/csawesome2/external/_static/datasets/pokemon.csv](https://runestone.academy/ns/books/published/csawesome2/external/_static/datasets/pokemon.csv)

**Dataset Description:**
This dataset contains information about the original 151 Pokémon from Generation 1. Each row includes attributes such as Pokémon name, primary type, secondary type (if applicable), HP, Attack, Defense, Speed, image link, and description. The dataset was used to analyze Pokémon types and Attack statistics.

---

## Guiding Questions

Primary Question:
Which Pokémon has the highest Attack stat in Generation 1?

Secondary Questions:

* How many Pokémon have two types?
* Which Pokémon types appear most frequently?

---

## Class Design

We created a `Data` class to represent one Pokémon.

### Attributes

* `pokemon` (String) – name of the Pokémon
* `type1` (String) – primary type
* `type2` (String) – secondary type (may be empty)
* `attack` (int) – Attack stat

### Methods

* Constructor with all attributes
* Getter methods
* `hasTwoTypes()` – returns true if the Pokémon has a secondary type
* `hasType(String type)` – checks if the Pokémon matches a given type
* `toString()` – returns a formatted string representation

---

## Column to Attribute Map

| Attribute | CSV Column | Index | Notes           |
| --------- | ---------- | ----- | --------------- |
| pokemon   | Pokemon    | 1     | Name of Pokémon |
| type1     | Type 1     | 2     | Primary type    |
| type2     | Type 2     | 3     | May be empty    |
| attack    | Attack     | 5     | Integer value   |

---

## Algorithms Implemented

### 1. Find Maximum Attack

Iterates through the array and returns the highest Attack value found.

### 2. Count Pokémon with Two Types

Loops through the array and counts how many Pokémon have a non-empty secondary type.

### 3. Type Filtering (Method Included)

The `hasType(String type)` method allows filtering Pokémon by a specific type.

---

## Results

* Number of rows loaded: 151
* Highest Attack stat: 134
* Number of Pokémon with two types: 62

The Pokémon with the highest Attack stat in Generation 1 is Dragonite with an Attack of 134. A majority of Pokémon have only one type, while 62 Pokémon have both a primary and secondary type.

---

## Data Ethics and Quality Reflection

This dataset includes only Generation 1 Pokémon, meaning conclusions cannot be generalized to all Pokémon across later generations. Because the dataset is limited in scope, findings such as “strongest type” or “most common type” apply only to this subset.

Additionally, some Pokémon do not have a secondary type, which required handling empty values during analysis. Overall, the dataset is structured and consistent, but limited in representation.

---

## Project Requirements Checklist

* Dataset selected
* Guiding question written
* Class created with at least three attributes
* File reading implemented using `Scanner`
* Array of objects created
* At least two analysis algorithms implemented
* Findings printed to console
* Javadoc comments included
* UML diagram created
* Reflection completed
* Code compiles and runs

---

This project demonstrates object-oriented programming, file input, and basic data analysis techniques in Java.
