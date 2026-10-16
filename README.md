# Character Manager — TP3 (Java Visual SIH-6406)

File Main.java adalah kelas utama yang berfungsi sebagai titik eksekusi program (main method) untuk mendemonstrasikan pembuatan objek karakter. File ini juga menguji fitur-fitur seperti kenaikan level (level up), manipulasi mana, pengecekan status kehidupan menggunakan isAlive(), serta menampilkan informasi atribut karakter ke terminal.   

<img width="960" height="564" alt="Screenshot 2026-10-16 132939" src="https://github.com/user-attachments/assets/5203fe1b-c986-4957-85a3-3e6c22ec3465" />

 CharacterManager/
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

Link DOC : 


# Character Manager — TP5
 output CRUD
<img width="960" height="564" alt="Screenshot 2026-10-16 214103" src="https://github.com/user-attachments/assets/e8d38a5c-9043-45be-9de3-90c5f160588e" />
eksperimen reference
<img width="960" height="564" alt="Screenshot 2026-10-16 222426" src="https://github.com/user-attachments/assets/a775a5f4-9cf2-4fa0-bbdb-998ecb5f9098" />
## Bagian C: findStrongest()

**Fungsi:** mengembalikan karakter dengan attackPower tertinggi.

**Rasional:**
- Dipilih karena analitik "siapa terkuat" sering dibutuhkan (misalnya menentukan pemimpin tim).
- Method hanya mengembalikan satu object, sehingga ArrayList internal tetap
  private dan tidak bisa diubah dari luar (Encapsulation terjaga).
- Mengembalikan `null` jika list kosong, konsisten dengan `findByName()`.
- Jika ada seri, karakter yang lebih dulu ditambahkan dipilih (perilaku deterministik).

**Pengujian:** diuji di Main.java dengan list berisi karakter dan list kosong.

Link DOC : 
