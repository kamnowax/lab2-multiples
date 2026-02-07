# Lab 2 – Multiplex

## Opis
Projekt przedstawia model biznesowy systemu obsługującego sieć multipleksów kinowych.
System umożliwia zarządzanie wieloma kinami, salami kinowymi oraz seansami filmowymi.

Zaimplementowana logika pozwala na:
- obsługę wielu kin w ramach jednej sieci
- tworzenie repertuaru seansów (standardowych, VIP oraz 3D)
- rezerwację miejsc przed seansem
- zakup biletów z wyprzedzeniem
- zakup biletów z kontem klienta oraz bez konta
- sprawdzenie biletów przypisanych do klienta

Projekt skupia się wyłącznie na warstwie logiki biznesowej – nie zawiera interfejsu graficznego,
bazy danych ani obsługi płatności.

## Przykład działania
Przykładowe użycie systemu zostało zaprezentowane w klasie `Main`,
gdzie tworzona jest sieć kin, sale, seanse oraz wykonywane są operacje
rezerwacji i zakupu biletów.

## Diagram klas
![Class Diagram](docs/class-diagram.png)
