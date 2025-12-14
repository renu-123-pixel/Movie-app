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
|--------------|
| <img src="doc/login_screen.png" width="300" /> |

| Splash Screen |
|---------------|
| <img src="doc/splash_screen.png" width="300"/> |

| Movies List |
|--------------|
| <img src="doc/movies_list_screen_1.png" width="300"/> |

| Movie Detail 1 |
|----------------|
| <img src="doc/movie_detail_screen_1.png" width="300"/> |

| Movie Detail 2 |
|----------------|
| <img src="doc/movie_detail_screen_2.png" width="300"/> |

| Favorite Movies |
|------------------|
| <img src="doc/favorite_movies.png" width="300"/> |

## 📷 UML Sequence Diagram 
| <img src="doc/Movie-app_UML_Sequence_diagram.png" width="800" /> |

## 📷  Component Diagram
| <img src="doc/Movie-app_High_Level_Architecture_Diagram.png" width="800" /> |

## 🚀 Getting Started

### Prerequisites

- Android Studio (Electric Eel or newer)
- TMDb API Key (Free – [Sign Up Here](https://www.themoviedb.org/signup))

### Installation
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
MovieApp/
└── app/
    └── src/
        └── main/
            ├── java/
            │   └── com/yourpackage/movieapp/  ← actual package name may vary
            │       ├── Activity/
            │       │   ├── DetailActivity.java
            │       │   ├── LoginActivity.java   ← launcher activity
            │       │   ├── IntroActivity2.java
            │       │   └── MainActivity.java
            │       ├── Adapter/
            │       │   └── [RecyclerView adapters, etc.]
            │       ├── Domain/
            │       │   └── [Model classes e.g., Movie.java]
            │       └── Helper/
            │           └── [Utility/helper classes]
            │
            ├── res/
            │   ├── drawable/
            │   ├── drawable-xxhdpi/
            │   ├── layout/
            │   │   └── [activity_main.xml, item_movie.xml, etc.]
            │   ├── mipmap-hdpi/
            │   ├── mipmap-mdpi/
            │   ├── values/
            │   ├── values-night/
            │   └── xml/
            │       ├── backup_rules.xml
            │       └── data_extraction_rules.xml
            │
            └── AndroidManifest.xml

📌 Future Improvements
 Add movie detail screen

 Add search functionality

 Support for genres and filters

 Pagination for long movie lists

🙋‍♀️ Author
Renu – GitHub Profile

🤝 Contributing
Contributions are welcome! Feel free to open issues or submit a pull request.



