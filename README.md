# Sports App

The **Sports App** is a simple and educational Android application developed to demonstrate the use of `RecyclerView` and `CardView` in Java. It showcases a collection of sports, each represented with an image and a name, using a scrollable list. The app has a static header image at the top and a dynamic, scrollable list below.

## Features

- Static banner at the top showing various sports icons.
- Scrollable list of sports implemented using `RecyclerView`.
- Each sport is displayed inside a `CardView` layout containing:
  - A sport name (`TextView`)
  - A sport image (`ImageView`)
- Smooth vertical scrolling experience.

## Technologies Used

- **Java** – Programming language for Android components
- **RecyclerView** – To display the list of sports efficiently
- **CardView** – To present each sport in a well-designed card layout
- **ConstraintLayout** – Used for designing flexible and responsive layouts
- **Android Studio** – IDE for building and testing the app

## Layout Structure

MainActivity
│
├── Header Section (Static)
│ └── ImageView (Sports Banner)
│
└── RecyclerView (Scrollable)
└── List of CardViews
├── TextView (Sport Name)
└── ImageView (Sport Image)

## Screenshots

| Static Header and First Few Sports | Scrolled View (More Sports) |
|------------------------------------|------------------------------|
| ![Screenshot 1](./screenshots/screenshot1.png) | ![Screenshot 2](./screenshots/screenshot2.png) |

## Screen Recording

To see the app in action, watch the screen recording:

[▶️ Click here to view the screen recording](https://drive.google.com/drive/my-drive)

## How It Works

1. The data (sport names and images) is stored in a list of `Sport` objects.
2. `RecyclerView.Adapter` is used to bind this data to views.
3. A custom `ViewHolder` class holds references to the `TextView` and `ImageView`.
4. `CardView` is used to wrap each sport item for better UI appearance.
5. The top section (banner image) is placed **outside** the RecyclerView, so it stays fixed while scrolling.

## What I Learned

- Implementing `RecyclerView` and creating custom adapters
- Designing layouts using `CardView`
- View recycling and performance optimization
- Working with image and text together inside a single item layout
- Managing scrollable content while keeping a fixed top view

## Future Improvements

- Add onClick functionality to each card to show sport details
- Add search/filtering functionality
- Use `ViewModel` and `LiveData` for better architecture (MVVM)
- Add animations and transitions between screens

.

