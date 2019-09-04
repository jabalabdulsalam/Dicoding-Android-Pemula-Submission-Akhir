package com.example.tempatwisataaceh;

import java.util.ArrayList;

public class TempatWisataData {
    public static String[][] data = new String[][]{
            {"Mesjid Raya Baiturrahman", "Lokasi : Kota Banda Aceh, Aceh", "https://nyero.id/wp-content/uploads/2018/01/Wisata-Masjid-Raya-Baiturrahman-Aceh.jpg", "Masjid yang telah berdiri sejak tahun 1612 ini menjadi salah satu tempat wisata religi yang wajib dikunjungi ketika liburan ke Aceh. Masjid yang dibangun oleh Sultan Iskandar Muda ini dikelilingi oleh tujuh menara dengan masing-masing kubah hitam di atasnya.", ": Wisata Religi", ": Buka 24 Jam"},
            {"Museum Tsunami", "Lokasi : Kota Banda Aceh, Aceh", "https://nyero.id/wp-content/uploads/2018/01/Wisata-Hits-Museum-Tsunami-Aceh.jpg", "Dalam Museum Tsunami, terdapat beberapa ruangan yang menggambarkan betapa dahsyatnya bencana Tsunami yang terjadi pada saat itu. Ruangan tersebut antara lain adalah: Lorong Tsunami, Ruang kenangan, Sumur do’a.", ": Wisata Sejarah", ": 08.00 WIB s.d 17.00 WIB"},
            {"Rumah Cut Nyak Dhien", "Lokasi : Aceh Besar, Aceh", "https://nyero.id/wp-content/uploads/2018/01/Wisata-HIts-Rumah-Cut-Nyak-Dien-Aceh.jpg", "Rumah Cut Nyak Dien merupakan tempat bersejarah yang bermanfaat bagi siapapun untuk mengenang  kembali peristiwa sejarah di masa lampau, terutama sosok pahlawan wanita Cut Nyak Dien yang berjuang melawan penjajahan Belanda.", ": Wisata Sejarah", ": 08.00 WIB s.d 17.00 WIB"},
            {"Tugu Nol Kilometer", "Lokasi : Kota Sabang, Aceh", "https://nyero.id/wp-content/uploads/2018/01/Wisata-Tugu-Nol-Kilometer-Aceh.jpg", "Jalan-jalan ke Aceh tidak akan lengkap bila tidak mengambil foto di Tugu Nol Kilometer.  Daerah yang menjadi destinasi favorit untuk berswafoto dengan background tugu yang ikonik. Tugu ini disebut-sebuit sebagai titik nol Indonesia sehingga sayang untuk dilewatkan begitu saja.", ": Wisata Alam", ": 08.WIB s.d 18.00 WIB"},
            {"Tempat Pelatihan Gajah Saree", "Lokasi : Aceh Besar, Aceh", "https://nyero.id/wp-content/uploads/2018/01/Wisata-Hits-Pusat-Latihan-Gajah-Saree-Aceh.jpg", "Seperti halnya Lampung, di Aceh juga terdapat pusat latihan gajah yang terletak di Kabupaten Aceh Besar. Keberadaan gajah-gajah di Aceh diketahui sudah ada sejak zaman dulu, bahkan pada masa kerajaan Aceh di bawah kepemimpinan Sultan Iskandar Muda ada sekitar 40.000 pasukan gajah yang terlatih untuk keperluan militer.", ": Wisata Alam", ": 08.00 WIB s.d 17.00 WIB"},
            {"Rumah Tradisional Aceh", "Lokasi : Kota Banda Aceh, Aceh", "https://nyero.id/wp-content/uploads/2018/01/Wisata-Rumah-Tradisional-Aceh.jpg", "Rumah tradisonal suku Aceh dinamakan Rumoh Aceh. Rumah adat ini bertipe rumah panggung dengan 3 bagian utama dan 1 bagian tambahan. Tiga bagian utama dari rumah Aceh yaitu seuramoë keuë (serambi depan), seuramoë teungoh (serambi tengah) dan seuramoë likôt (serambi belakang). Sedangkan 1 bagian tambahannya yaitu rumoh dapu (rumah dapur). Atap rumah berfungsi sebagai tempat penyimpanan pusaka keluarga.", ": Wisata Sejarah", ": 08.00 WIB s.d 17.00 WIB"},
            {"Pulau Mincau", "Lokasi : Simeulue, Aceh", "https://nyero.id/wp-content/uploads/2018/01/Wisata-Hits-Pulau-Mincau-Aceh.jpg", "Menyambangi Aceh jangan hanya pergi ke Masjid Baiturrahman saja, tapi cobalah sesekali untuk menjelajah lebih dalam dan temukan harta yang tersimpan. Salah satu harta tersimpan yang dimiliki oleh Aceh ialah Pulau Mincau. Pulau kecil namun akan memberi arti mendalam bagi liburan para wisatawan.", ": Wisata Alam", ": 08.00 WIB s.d 17.00 WIB"}
    };

    public static ArrayList<TempatWisata> getListData() {
        TempatWisata tempatWisata = null;
        ArrayList<TempatWisata> list = new ArrayList<>();
        for (String[] aData : data) {
            tempatWisata = new TempatWisata();

            tempatWisata.setNama(aData[0]);
            tempatWisata.setLokasi(aData[1]);
            tempatWisata.setFoto(aData[2]);
            tempatWisata.setDeskripsi(aData[3]);
            tempatWisata.setKategori(aData[4]);
            tempatWisata.setJamOperasional(aData[5]);

            list.add(tempatWisata);
        }

        return list;
    }
}
