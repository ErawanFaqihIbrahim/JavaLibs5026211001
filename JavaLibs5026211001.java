import javax.swing.*;
    public class App {
        public static void main (String[] args) {
            String[] places = {"Mall", "Pasar", "Swalayan", "Supermarket"};
            String name = JOptionPane.showInputDialog(null, "Siapa Nama Kamu?","Question 1",3);
            String place = (String) JOptionPane.showInputDialog(null, "Mau Pergi Belanja Kemana?","Question 2",3, null, places, places[0]);
            String animal = JOptionPane.showInputDialog(null, "Hewan Apa yang Kamu Suka Untuk Dimakan?","Question 3",3);
            String process = JOptionPane.showInputDialog(null, "Bagaimana "+animal+" Tersebut Diolah?","Question 4",3);
            String item = JOptionPane.showInputDialog(null, "Barang Apa Saja yang Kamu Beli","Question 5",3);
            int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Pilih Angka Diantara 1-10","Question 6", 3));
            double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Berapa Tinggi Kamu (cm)?", "Question 7",3));
            String person = JOptionPane.showInputDialog(null, "Siapa Teman Kecilmu?","Question 8",3);
            int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Tulis Angka Favoritmu","Question 11",3));
            int odd = Integer.parseInt(JOptionPane.showInputDialog(null, "Tulis Angka Ganjil", "Question 12",3));
            String color = JOptionPane.showInputDialog(null, "Tulis Warna Favorit Kamu","Question 13",3);
            int total = num1+num2;
            double half = odd/2.0;
            System.out.println("Pada hari Minggu kemarin "+name+" dan keluarganya pergi ke "+place+". Mereka pergi kesana untuk berbelanja kebutuhan "+name+" saat ngekos. \n Sebelum berbelanja, mereka pergi sarapan "+animal+" "+process+" di pinggir jalan sambil menulis "+item+" yang akan dibeli.");
            System.out.println("Saat sampai di "+place+", "+num1+" anak berlarian dan menyenggol belanjaan. Tanpa disadari barang belanjaanku sudah jatuh berserakan. ");
            System.out.println("Saat aku mau mengambil barangku "+person+" menahanku dan berkata "+height+" cm terlalu pendek");
            System.out.println("Jadi aku pura-pura pergi darinya. Kemudian melempar "+num2+" bola berwarna "+color+" dan "+odd+" kerikil kecil.");
            System.out.println("Aku berhasil kabur dengan "+total+" lemparan tersebut. Dan pergi membawa barangku yang terjatuh.");
            System.out.println("Setelah itu aku kembali ke keluargaku dan pergi pulang.");
        }
    }