# 🎬 Movie App

An Android application that lets users browse and explore a list of popular movies using a clean, modern UI. The app fetches real-time movie data from the [TMDb API](https://www.themoviedb.org/documentation/api), including titles, ratings, overviews, and posters.

## 📱 Features

- 🔍 Browse popular movies from TMDb
- 🖼️ View posters, titles, and ratings
- 📄 Read brief movie overviews
- 🎨 Modern, responsive layout using RecyclerView
- 🌐 API integration with Retrofit2

## 🛠️ Built With

- **Language:** Java
- **API:** [TMDb API](https://developers.themoviedb.org/)
- **Libraries/Frameworks:**
  - [Retrofit2](https://square.github.io/retrofit/) – for network requests
  - [Glide](https://github.com/bumptech/glide) – for image loading
  - RecyclerView – for listing movies
  - CardView – for movie cards
  - ConstraintLayout – for flexible UI design

## 📷 Screenshots

| Login Screen |
|------------|
| ![Login screen](login_screen.png) |
| Splash Screen |
|------------|
| ![Splash Screen](splash_screen.png) |
| Movies List |
|------------|
| ![movies list 1](movies_list_screen_1.png) |
| Movies List |
|------------|
| ![movies detail_screen 1](movie_detail_screen_1.png) |
| Movies List |
|------------|
| ![movies detail_screen_2](movie_detail_screen_2.png) |
| favorite_movies |
|------------|
| ![Favorite_Movies](favorite_movies.png) |


## 🚀 Getting Started

### Prerequisites

- Android Studio (Electric Eel or newer)
- TMDb API Key (Free – [Sign Up Here](https://www.themoviedb.org/signup))

### Installation

1. Clone this repository:

```bash
git clone https://github.com/renu-123-pixel/Movie-app.git
Open in Android Studio and let Gradle sync.

In your gradle.properties or as a constant in ApiClient.java, add your TMDb API key:

java
Copy
Edit
public static final String API_KEY = "YOUR_API_KEY_HERE";
Run the app on an emulator or physical Android device.

📁 Project Structure
swift
Copy
Edit
Movie-app/
├── app/
│   ├── java/com/example/movieapp/
│   │   ├── MainActivity.java
│   │   ├── Movie.java
│   │   ├── MovieAdapter.java
│   │   ├── ApiClient.java
│   │   └── ApiInterface.java
│   └── res/
│       ├── layout/
│       ├── drawable/
│       └── values/
├── AndroidManifest.xml
└── build.gradle
📌 Future Improvements
 Add movie detail screen

 Add search functionality

 Support for genres and filters

 Pagination for long movie lists

🙋‍♀️ Author
Renu – GitHub Profile

🤝 Contributing
Contributions are welcome! Feel free to open issues or submit a pull request.

📄 License
This project is licensed under the MIT License. See the LICENSE file for more information.



