# Character Manager — TP3 (Java Visual SIH-6406)

File Main.java adalah kelas utama yang berfungsi sebagai titik eksekusi program (main method) untuk mendemonstrasikan pembuatan objek karakter. File ini juga menguji fitur-fitur seperti kenaikan level (level up), manipulasi mana, pengecekan status kehidupan menggunakan isAlive(), serta menampilkan informasi atribut karakter ke terminal.   

<img width="960" height="564" alt="Screenshot 2026-10-16 075410" src="https://github.com/user-attachments/assets/62d63b73-f30d-475f-bdbd-7639209bb861" />

```
CharacterManager/
├── src/
│   ├── Main.java
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               └── model/
│                   ├── Character.java
│                   └── CharacterType.java
```

Nama : Jesslin Felixa Pasaribu
NIM  : 253303621224

Link DOC : https://1drv.ms/w/c/A4248E4F58ABC421/IQBXKXh7EN-WSqJFTbi6z28-AbzDc34foH9gl26UruGn8dc?e=A2WZag

# Character Manager — TP5
 output CRUD
<img width="960" height="564" alt="Screenshot 2026-10-16 214103" src="https://github.com/user-attachments/assets/e8d38a5c-9043-45be-9de3-90c5f160588e" />
eksperimen reference
<img width="960" height="564" alt="Screenshot 2026-10-17 105824" src="https://github.com/user-attachments/assets/667a64bf-0d8d-42e7-b645-6a0999c7e13b" />
<img width="960" height="564" alt="Screenshot 2026-10-17 105839" src="https://github.com/user-attachments/assets/90a1930d-ac33-4412-a25c-a8aa20672810" />

## Bagian C: findStrongest()

**Fungsi:** mengembalikan karakter dengan attackPower tertinggi.

**Rasional:**
- Dipilih karena analitik "siapa terkuat" sering dibutuhkan (misalnya menentukan pemimpin tim).
- Method hanya mengembalikan satu object, sehingga ArrayList internal tetap
  private dan tidak bisa diubah dari luar (Encapsulation terjaga).
- Mengembalikan `null` jika list kosong, konsisten dengan `findByName()`.
- Jika ada seri, karakter yang lebih dulu ditambahkan dipilih (perilaku deterministik).

**Pengujian:** diuji di Main.java dengan list berisi karakter dan list kosong.

Link DOC : https://1drv.ms/w/c/A4248E4F58ABC421/IQDcigIm37PkQ6MlCkCEx_viATLLzKQU81t7xafSoe4-low?e=WdBfS3


# Character Manager — TP8

<img width="960" height="564" alt="Screenshot 2026-10-24 205910" src="https://github.com/user-attachments/assets/dc8256a0-ce50-47e6-b99c-9bd3d9e75d8b" />

**Aliran data dan MVC:**

Data dibuat di Main dengan membuat object Character lalu memasukkannya ke CharacterManager lewat addCharacter(). CharacterManager (Model) menyimpan daftar karakter dan menghitung rata-rata level lewat getAverageLevel(). Hasilnya (daftar dan angka rata-rata) dikirim Main ke MainWindow (View) lewat constructor. MainWindow hanya menampilkan data itu dalam JLabel tanpa menghitung apa pun, sehingga logika (Model) dan tampilan (View) tetap terpisah sesuai prinsip MVC.


**Karakter baru dan alasannya:**

Lancelot, tipe	WARRIOR, level, alasannya karena	10	Level tinggi dipilih agar pengaruhnya ke rata-rata terlihat jelas. Statistiknya juga paling besar (HP 200, ATK 60), jadi terlihat bahwa HP dan ATK naik mengikuti level.
Selene, tipe	HEALER, level	2, alasannya agar	Melengkapi keempat tipe di CharacterType (WARRIOR, MAGE, ARCHER, HEALER). Level rendah dipilih agar ada variasi dan menarik rata-rata turun.

Sebelum :
<img width="960" height="564" alt="Screenshot 2026-10-24 205357" src="https://github.com/user-attachments/assets/be3dc336-88ec-44ac-9a14-fddd329b6dce" />

Sesudah
<img width="960" height="564" alt="Screenshot 2026-10-24 205910" src="https://github.com/user-attachments/assets/5ce80095-188c-4071-b91c-3bb54ba1f062" />


Link DOC : https://d.docs.live.net/a4248e4f58abc421/Dokumen/JavaVisual_TP08_%5b253303621224%5d_%5bJesslin%20Felixa%20Pasaribu%5d.docx
