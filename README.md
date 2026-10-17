# Character Manager — TP3 (Java Visual SIH-6406)

File Main.java adalah kelas utama yang berfungsi sebagai titik eksekusi program (main method) untuk mendemonstrasikan pembuatan objek karakter. File ini juga menguji fitur-fitur seperti kenaikan level (level up), manipulasi mana, pengecekan status kehidupan menggunakan isAlive(), serta menampilkan informasi atribut karakter ke terminal.   

<img width="960" height="564" alt="Screenshot 2026-10-16 075410" src="https://github.com/user-attachments/assets/62d63b73-f30d-475f-bdbd-7639209bb861" />

``` CharacterManager/
├── src/
│   ├── Main.java
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               └── model/
│                   ├── Character.java
│                   └── CharacterType.java 

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
