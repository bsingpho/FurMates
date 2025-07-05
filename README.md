# 🐾 FurMates - The Dating App for Pets

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-blueviolet?logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-%F0%9F%92%BB%20Modern%20UI-green?logo=android)](https://developer.android.com/jetpack/compose)
[![Hilt](https://img.shields.io/badge/Hilt-Dependency%20Injection-29B6F6?logo=dagger)](https://dagger.dev/hilt/)
[![Firebase](https://img.shields.io/badge/Firebase-Enabled-ffca28?logo=firebase)](https://firebase.google.com/)
[![Architecture](https://img.shields.io/badge/M.A.D%20Skills-Supported-brightgreen)](https://developer.android.com/modern-android-development)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

---

**FurMates** is a modern Android app built with ❤️ for pets and their humans. Whether you’re looking for puppy playdates or feline friendship, **FurMates** helps you connect with nearby pet lovers — powered by a clean, Compose-driven UI and Firebase backend.

---

## ✨ Features

- 🔐 Email/Password Login & Signup
- 🐾 Create & Browse Pet Profiles
- 💌 Match and Chat with other pet owners
- 📍 Discover matches near you (Location-aware)
- 📱 Built with Jetpack Compose & Single-Activity Architecture
- 🛡️ Dependency Injection with Hilt
- 🔄 Scalable MVVM + Repository Architecture
- ☁️ Firebase Authentication, Firestore, and Storage integration

---

## 🛠 Tech Stack

| Layer        | Tech Used                             |
|--------------|----------------------------------------|
| Language     | Kotlin                                 |
| UI           | Jetpack Compose                        |
| Navigation   | Jetpack Navigation (NavController)     |
| DI           | Hilt (Dagger)                          |
| Architecture | MVVM + Repository Pattern              |
| Backend      | Firebase (Auth, Firestore, Storage)    |
| Images       | Coil for image loading                 |
| Tooling      | Android Studio Hedgehog (or newer)     |

---

## 🧱 Architecture Overview

FurMates follows **Modern Android Development (MAD) Skills**:
- ✅ **Single Activity + NavHost**
- ✅ **Composable UI with state hoisting**
- ✅ **Unidirectional data flow (UI State)**
- ✅ **Hilt for dependency injection**
- ✅ **Scalable modular architecture**



furmates/
├── ui/ # Compose screens & components
│ ├── login/
│ ├── signup/
│ ├── browse/
│ ├── chat/
├── viewmodel/ # ViewModels per screen
├── data/ # Repositories, models, mappers
├── navigation/ # NavGraph setup
├── di/ # Hilt modules
└── MainActivity.kt



✅ TODO (Planned Enhancements)
🔥 Google Sign-In

🧼 Profile photo cropping

🐕 Breed-based search filters

🛎️ Push notifications via FCM

🌍 Map view for nearby pets

🧪 Unit/UI tests

🐶 About the Project
Built to showcase real-world Modern Android Development skills and make pet lovers’ lives a little more fun 💕.
