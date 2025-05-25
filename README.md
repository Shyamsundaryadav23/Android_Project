# Travel Photo App 🚀📷

An Android app that allows users to view a slideshow of travel destination images with the names of the places displayed. Users can navigate forward and backward through a collection of images using intuitive navigation buttons.

---

## 📱 Features

- Swipe through **5 beautiful travel images**.
- Each image is labeled with the **place name** (e.g., Ram Mandir, Lotus Temple, etc.).
- Use **Next** and **Previous** buttons to navigate.
- Smooth image switching with fade-in/out using `alpha`.

---

## 🛠️ Tech Stack

- **Language:** Kotlin
- **Framework:** Android SDK
- **UI Components:** `LinearLayout`, `ConstraintLayout`, `ImageView`, `TextView`, `ImageButton`
- **Min SDK:** 21 (Lollipop)

---

## 🧩 Project Structure

Travel/
├── app/
│ └── src/
│ └── main/
│ ├── java/com/example/travel/
│ │ └── MainActivity.kt
│ ├── res/
│ │ ├── drawable/ # Images: pic0 to pic4
│ │ ├── layout/
│ │ │ └── activity_main.xml
│ │ └── values/ # colors.xml, strings.xml, etc.
│ └── AndroidManifest.xml
├── build.gradle
└── README.md

yaml
Copy code

---

## 🖼️ Images Used

Ensure you have 5 drawable resources in your `res/drawable/` directory named:

- `pic0.png` (or `.jpg`)
- `pic1.png`
- `pic2.png`
- `pic3.png`
- `pic4.png`

These are the photos shown in the app.

---

## 📸 Places Displayed

```text
0 -> Ram Mandir
1 -> Gateway of India
2 -> Lotus Temple
3 -> Balaji Temple
4 -> Prem Mandir
🚀 How to Run
Clone this repository:

bash
Copy code
git clone https://github.com/Shyamsundaryadav23/Android_Project.git
Open the project in Android Studio.

Build and run on an emulator or physical Android device.

📌 Screenshot
![image](https://github.com/user-attachments/assets/f4398329-3391-4216-a314-a2ab3b9281fc)
![image](https://github.com/user-attachments/assets/3466df96-5590-4225-a65d-627d8418c00c)
![image](https://github.com/user-attachments/assets/b0d673d4-777e-46f0-9480-82a530233523)


🧑‍💻 Author
Shyam Sundar Yadav
📧 shyamsundar.yadav23@pccoepune.org

