# AP CSA Mini-Project: Data Analysis with Arrays & File Input  
### Using CSV Files • Arrays of Objects • Algorithms • Data Ethics & Quality  

---

## 📌 Project Overview
In this mini-project, we chose a Pokémon dataset (Generation 1). We designed a custom Java class to represent each Pokémon, read the CSV file using Scanner, stored all Pokémon objects in an array, and analyzed the data to answer our guiding questions.

This project uses:

- Arrays  
- File input with `Scanner`  
- Class design (attributes, constructors, methods)  
- Algorithms (max, counting, filtering)  
- Data quality & ethics  
- Documentation using Javadoc  
- UML class diagram  

---

## 🧪 Dataset Information

**Dataset Name:** Pokémon Generation 1 Dataset  

**Source / Link:**  
https://runestone.academy/ns/books/published/csawesome2/external/_static/datasets/pokemon.csv  

**What this dataset contains (2–3 sentences):**  
This dataset contains information about the original 151 Pokémon from Generation 1. Each row includes attributes such as Pokémon name, type 1, type 2 (if applicable), HP, Attack, Defense, Speed, image link, and description. We used this dataset to analyze Pokémon types and attack statistics.

---

## ❓ Guiding Question

**My guiding question:**  
Which Pokémon type has the most Pokémon, and what is the highest Attack stat in the dataset?

Secondary question:  
How many Pokémon have two types?

---

## 🧱 Class Design

We created a `Data` class to represent one Pokémon.

### Attributes:
- `pokemon` (String)  
- `type1` (String)  
- `type2` (String)  
- `attack` (int)  

### Methods:
- Constructor with all attributes  
- Getter methods  
- `hasTwoTypes()`  
- `hasType(String type)`  
- `toString()`  

---

## 📥 Column → Attribute Map

| Attribute Name | CSV Column Name | Column Index # | Notes |
|----------------|------------------|----------------|-------|
| pokemon        | Pokemon          | 1              | name of pokemon |
| type1          | Type 1           | 2              | primary type |
| type2          | Type 2           | 3              | may be empty |
| attack         | Attack           | 5              | integer value |

---

## 📊 Algorithms Implemented

1. **Maximum Attack**  
   Finds the Pokémon with the highest Attack stat.

2. **Count Pokémon with Two Types**  
   Counts how many Pokémon have both a primary and secondary type.

3. **Filter by Type (if implemented)**  
   Filters Pokémon by a chosen type.

---

## 🧠 Insights & Results

- Number of rows loaded: 151  
- Highest attack value: 134 (Dragonite)  
- Many Pokémon have only one type  
- A smaller portion of Pokémon have two types  

**Answer to Guiding Question:**  
The Pokémon with the highest Attack stat is Dragonite with 134 attack. Certain types such as Water and Normal appear more frequently in Generation 1 than others.

---

## 📝 Documentation

- All classes and methods include Javadoc comments.  
- A UML class diagram is included in the repository as `UML_Diagram.png`.

---

## 🛡 Data Ethics & Quality Reflection

This dataset only includes Generation 1 Pokémon, which means it does not represent all Pokémon across all generations. Because of this, any conclusions about “which type is strongest” only apply to Generation 1. Additionally, missing secondary type values could affect certain counts. Overall, the dataset appears structured and consistent, but it is limited in scope and not fully representative of the entire Pokémon universe.

---

## ✅ Submission Checklist

- [x] Dataset selected  
- [x] Guiding question written  
- [x] Class created with ≥3 attributes  
- [x] File reading implemented  
- [x] Array of objects created  
- [x] At least 2 analysis algorithms implemented  
- [x] Findings printed  
- [x] Javadoc comments added  
- [x] UML diagram included  
- [x] Reflection completed  
- [x] Code compiles & runs  

---

🚀 This project demonstrates file input, object-oriented design, and data analysis using Java.
