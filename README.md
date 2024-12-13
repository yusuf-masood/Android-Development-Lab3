# Android-Development-Lab3
Features
1. User Authentication
Secure login and signup functionality using a Room database.
Ensures access is restricted to registered users.
2. API-Driven Quizzes
Fetches quiz questions from external APIs, such as The Trivia API and Open Trivia Database.
Presents quizzes in an efficient and visually appealing RecyclerView interface.
3. Custom Quiz Management
Enables users to create, save, and view their custom quizzes.
Stores custom quizzes locally in a Room database.
4. User Interface
Utilizes Material Design for a polished and user-friendly experience.
Fragment-based navigation ensures seamless transitions between app sections.
5. Architecture & Best Practices
Implements MVVM (Model-View-ViewModel) architecture for modular and scalable development.
Utilizes Kotlin Coroutines for asynchronous operations and better performance.
Adheres to Android development best practices for clean and maintainable code.
Technical Highlights
Room Database:

Manages user credentials and stores custom quizzes locally.
Retrofit:

Handles API calls to fetch quizzes from external sources.
RecyclerView with DiffUtil:

Efficiently displays and updates quiz lists.
Fragment Navigation:

Provides structured navigation for improved user experience.
Material Design:

Enhances the visual appeal and usability of the app.
MVVM Architecture:

Utilizes LiveData and ViewModel for reactive and modular application logic.
Installation
Prerequisites:
Android Studio installed on your machine.
Minimum SDK version: 21 (Android 5.0 Lollipop).
Steps:
Clone the repository:
bash
Copy code
git clone https://github.com/your-username/quizmaster-app.git
Open the project in Android Studio.
Sync the project with Gradle dependencies.
Build and run the app on an emulator or physical device.
API Integration
1. Open Trivia Database API
The app integrates with the Open Trivia Database API to fetch quiz questions. Below is an example endpoint:

Endpoint: /api.php?amount=10
Retrieves 10 random quiz questions.
2. The Trivia API
The app also supports The Trivia API. It provides more robust quiz data with categories and difficulty levels. Below are key details:

Base URL: https://the-trivia-api.com/v2/

Endpoints:

Get Categories:
URL: /categories
Description: Returns a list of available categories.
Example: https://the-trivia-api.com/v2/categories
Get Questions:
URL: /questions
Description: Retrieves trivia questions based on parameters.
Parameters:
limit: Number of questions to fetch (e.g., 10).
categories: Comma-separated list of category IDs.
difficulty: Question difficulty (easy, medium, hard).
Example: https://the-trivia-api.com/v2/questions?limit=10&categories=general_knowledge&difficulty=medium
Usage
1. User Authentication
Log in with existing credentials or sign up for a new account.
2. API Quizzes
Access quizzes fetched from external APIs in the "API Quizzes" section.
3. Custom Quizzes
Create custom quizzes in the "Custom Quizzes" section.
View saved quizzes in a dedicated list.
