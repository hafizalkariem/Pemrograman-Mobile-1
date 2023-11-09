# Pemrograman-Mobile-1

# Deret Fibonacci

Deret Fibonacci adalah deret bilangan yang dimulai dengan dua angka, yaitu 0 dan 1, dan setiap angka selanjutnya adalah penjumlahan dari dua angka sebelumnya dalam deret tersebut. Dalam matematika, deret Fibonacci didefinisikan sebagai berikut:

F(0) = 0
F(1) = 1
F(n) = F(n-1) + F(n-2) untuk n > 1

Ini berarti bahwa angka ketiga dalam deret adalah 0 + 1 = 1, angka keempat adalah 1 + 1 = 2, angka kelima adalah 1 + 2 = 3, dan seterusnya.

## Cara Menghitung Deret Fibonacci

Terdapat beberapa cara untuk menghitung deret Fibonacci, di antaranya adalah menggunakan rekursi, iterasi, atau pendekatan berbasis matriks. Di bawah ini, kami akan memberikan contoh implementasi dalam bahasa pemrograman Python.

### 1. Rekursi

```python
def fibonacci_recursive(n):
    if n <= 1:
        return n
    else:
        return fibonacci_recursive(n-1) + fibonacci_recursive(n-2)
```

### 2. Iterasi

```python

def fibonacci_iterative(n):
    a, b = 0, 1
    for _ in range(n):
        a, b = b, a + b
    return a

```

### 3. Pendekatan Berbasis Matriks

```python

import numpy as np

def fibonacci_matrix(n):
    F = np.array([[1, 1], [1, 0]], dtype=object)
    if n == 0:
        return 0
    return np.linalg.matrix_power(F, n - 1)[0, 0]

```

### Contoh Penggunaan

```python
n = 10
print(f"Fibonacci ke-{n} (Rekursi): {fibonacci_recursive(n)}")
print(f"Fibonacci ke-{n} (Iterasi): {fibonacci_iterative(n)}")
print(f"Fibonacci ke-{n} (Matrix): {fibonacci_matrix(n)}")

```

<h1 align="center"> Fibonacci App </h1>

Fibonacci app adalah program sederhana yang menghitung angka-angka dalam deret Fibonacci. Deret Fibonacci dimulai dengan dua angka, yaitu 0 dan 1, dan setiap angka selanjutnya adalah hasil penjumlahan dari dua angka sebelumnya. Aplikasi ini meminta pengguna untuk memasukkan suku ke-n yang pada aplikasi ini di representasikan dengan <i>Limit</i> dalam deret Fibonacci yang ingin dihitung. Aplikasi kemudian akan menghitung dan menampilkan angka-angka dalam deret Fibonacci hingga Limit yang diminta oleh pengguna.

## Cara Penggunaan

1. Jalankan Fibonacci App.
2. Aplikasi akan meminta pengguna untuk memasukkan Limit dalam deret Fibonacci.
3. Masukkan Limit, misalnya 10.
4. Aplikasi akan menghitung dan menampilkan deret Fibonacci hingga suku ke-10, yaitu 0, 1, 1, 2, 3, 5, 8, 13, 21, dan seterusnya.

Fibonacci App adalah alat yang membantu pengguna memahami dan menghitung deret Fibonacci dengan cara yang interaktif dan mudah.

![Alt Text](/Desain%20tanpa%20judul.gif)

<h2 align="center">Terimakasih</h2>
