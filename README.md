# Catalog App

Welcome to the Catalog App! This application provides a comprehensive overview of various
categories, including animals, vegetables, fruits, bikes, and cars. It is designed to offer detailed
information and a user-friendly experience for browsing through these categories.

## Features

1. **Top Carousel**
    - Displays the current catalog type (e.g., animals, vegetables, fruits, bikes, cars).
    - Changing the carousel updates the list items and catalog type.

2. **Search Functionality**
    - Allows users to search within the catalog range.
    - The search box floats and remains accessible when the user scrolls upward, and the top
      carousel collapses.

3. **Catalog Analysis**
    - Users can view the current analysis of a catalog.
    - Analysis includes:
        - Catalog range count.
        - Maximum three-character occurrence value.

## Usage

### Carousel Navigation

- Scroll through the top carousel to select a different catalog type.
- The list items will update according to the selected catalog.

### Searching the Catalog

- Use the search box to find specific items within the catalog range.
- The search box will float at the top of the screen when scrolling through the catalog list.

### Viewing Catalog Analysis

- Select the option to view the current analysis of the catalog.
- The analysis will display the count of items in the catalog range and the maximum occurrence of
  three-character sequences within the catalog items.

## Libraries Used

This application utilizes a variety of libraries to enhance development and functionality. Below is
a detailed list of the libraries used in the Catalog App:

- **AndroidX Libraries:**
    - `androidx.core:core-ktx` - Provides Kotlin extensions for core Android components.
    - `androidx.lifecycle:lifecycle-runtime-ktx` - Adds Kotlin extensions for lifecycle-aware
      components.
    - `androidx.activity:activity-compose` - Provides integration between the Activity and Compose.
    - `androidx.compose:compose-bom` (platform) - Manages versions for Jetpack Compose libraries.
    - `androidx.ui:ui` - Core UI elements for Jetpack Compose.
    - `androidx.ui:ui-graphics` - Provides graphics-related utilities for Jetpack Compose.
    - `androidx.ui:ui-tooling-preview` - Offers tools for previewing Jetpack Compose UI elements.
    - `androidx.material3:material3` - Implements Material Design 3 components.

- **Dependency Injection:**
    - `androidx.hilt:hilt-navigation-compose` - Integration of Hilt with Jetpack Compose navigation.
    - `dagger.hilt.android:hilt-android` - Simplifies dependency injection in Android applications.
    - `dagger.hilt.compiler:hilt-android-compiler` - Annotation processor for Hilt.
    - `androidx.hilt:hilt-compiler` - Hilt compiler for AndroidX integration.

These libraries support various aspects of app development, from user interface design and testing
to dependency injection and debugging.

## Screenshots

<img src="screenshots/screenshot1.png" alt="Screenshot 1" width="150"/>
<img src="screenshots/screenshot2.png" alt="Screenshot 2" width="150"/>
<img src="screenshots/screenshot3.png" alt="Screenshot 3" width="150"/>
<img src="screenshots/screenshot4.png" alt="Screenshot 4" width="150"/>


---

Thank you for using the Catalog App !!!
