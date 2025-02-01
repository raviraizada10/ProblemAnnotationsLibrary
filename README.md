# Problem Annotations Library

![GitHub License](https://img.shields.io/badge/license-MIT-blue.svg)
![Java](https://img.shields.io/badge/Java-17-blue)
![Gradle](https://img.shields.io/badge/Gradle-8.10-brightgreen)

A lightweight Java library for annotating problem-solving classes and methods with **difficulty levels, problem categories, and problem metadata**. Designed to be reusable across multiple projects.

## Features
- **Difficulty Level Annotation** (`@DifficultyLevel`)
- **Problem Category Annotation** (`@ProblemCategory`)
- **Problem Info Annotation** (`@ProblemInfo`)
- Supports multiple problem tags using `ProblemTag` enum
- Easily integrable into any Java project

## Installation

### 1. Clone the Repository
```sh
git clone https://github.com/your-username/ProblemAnnotationsLibrary.git
cd ProblemAnnotationsLibrary
```

### 2. Publish to Local Maven Repository
```sh
./gradlew publishToMavenLocal
```
This will make the library available in your local `~/.m2/repository/`.

### 3. Add Dependency in Your Project
Modify your `build.gradle`:
```groovy
repositories {
    mavenLocal()
}

dependencies {
    implementation 'com.annotations:ProblemAnnotationsLibrary:1.0.0'
}
```

## Usage

### 1. Annotating Problems
```java
import com.annotations.*;

@ProblemInfo(problemNumber = 1234, solutionLink = "https://algo.monster/liteproblems/1234")
@DifficultyLevel(DifficultyLevel.Level.MEDIUM)
@ProblemCategory({ProblemTag.GRAPH, ProblemTag.DYNAMIC_PROGRAMMING})
public class ExampleProblem {
    public static void main(String[] args) {
        System.out.println("Problem solved!");
    }
}
```

### 2. Available Annotations

#### **@DifficultyLevel**
Defines the difficulty level of the problem.
```java
@DifficultyLevel(DifficultyLevel.Level.EASY)
```
**Levels:** `EASY`, `MEDIUM`, `HARD`

#### **@ProblemCategory**
Assigns problem categories based on `ProblemTag` enum.
```java
@ProblemCategory({ProblemTag.TREE, ProblemTag.GRAPH})
```

#### **@ProblemInfo**
Stores metadata like problem number and solution link.
```java
@ProblemInfo(problemNumber = 1001, solutionLink = "https://algo.monster/liteproblems/1001")
```

## Development
### Running Tests
```sh
./gradlew test
```

## Contributing
1. Fork the repository
2. Create a new feature branch (`git checkout -b feature-name`)
3. Commit changes (`git commit -m 'Add new feature'`)
4. Push to the branch (`git push origin feature-name`)
5. Open a Pull Request

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.   
