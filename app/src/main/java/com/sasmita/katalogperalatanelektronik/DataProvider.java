package com.sasmita.katalogperalatanelektronik;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.sasmita.katalogperalatanelektronik.model.Tv;
import com.sasmita.katalogperalatanelektronik.model.Peralatan;
import com.sasmita.katalogperalatanelektronik.model.Kulkas;
import com.sasmita.katalogperalatanelektronik.model.Kipas;
import com.sasmita.katalogperalatanelektronik.model.Hp;

public class DataProvider {
    private static List<Peralatan> peralatans = new ArrayList<>();

    private static List<Hp> initDataHp(Context ctx) {
        List<Hp> hps = new ArrayList<>();
        hps.add(new Hp("XiaoMi Redmi Note 9 [4GB + 64GB/Garansi offical] - Forest Green", "Rp2.199.000",
                "Deskripsi XiaoMi Redmi Note 9 [4GB + 64GB/Garansi offical] - Forest Green" +
                        "MTK Helio G85" +
                        "5020mAh" +
                        "ROM+Ram: 4GB + 64GB", R.drawable.hp1));
        hps.add(new Hp("Samsung Galaxy A21s 6/64 GB Garansi Resmi SEIN - Hitam", "Rp2.716.000",
                "Deskripsi Samsung Galaxy A21s 6/64 GB Garansi Resmi SEIN - Hitam" +
                        "CPU Octa-core (4x2.0 GHz Cortex-A55 & 4x2.0 GHz Cortex-A55)" +
                        "Internal 64GB 6GB RAM" +
                        "BATTERY Non-removable Li-Po 5000 mAh battery", R.drawable.hp2));
        hps.add(new Hp("Infinix Hot 9 Play Ram 4/64 4GB Rom Internal 64GB Garansi Resmi - cyan, 2GB 32GB", "Rp1.299.000",
                "Deskripsi Infinix Hot 9 Play Ram 4/64 4GB Rom Internal 64GB Garansi Resmi - cyan, 2GB 32GB" +
                        "MT6762D Octa-core CAMERA 13MP+ Allens WITH TRIPLE-FLASH LIGHT" +
                        "4GB+64GB" +
                        "BATTERY 6000mAh", R.drawable.hp3));
        hps.add(new Hp("Realme C11 Garansi Resmi - 2GB-32GB, Abu-abu", "Rp1.599.000",
                "Deskripsi Realme C11 Garansi Resmi - 2GB-32GB, Abu-abu" +
                        "Chipset : MediaTek Helio G35 (12 nm)" +
                        "Intern : 32GB RAM 2GB" +
                        "Baterai : Li-Po 5000 mAh yang tidak dapat dilepas", R.drawable.hp4));
        return hps;
    }

    private static List<Kipas> initDataKipas(Context ctx) {
        List<Kipas> kipas = new ArrayList<>();
        kipas.add(new Kipas("Kipas Angin Dinding Meja Kecil NAGOYA Portable Desk Fan 8 in NG-8DF", "Rp90.000",
                "• Kode Produk: NG-8DF\n" +
                        "• Daya: 40 Watt\n" +
                        "• Tegangan: 220 Volt / 50 Hz\n" +
                        "• Kecepatan: 810-1143 rpm\n" +
                        "• Ukuran Baling: 8in\n" +
                        "• Berat barang: 1.5 kg", R.drawable.kipas1));
        kipas.add(new Kipas("MIYAKO 2 in 1 Kipas Angin 12 Inch - KAD1227 - Putih", "Rp179.000 ",
                "Spesifikasi :\n" +
                        "- Daya Listrik : 45 Watt\n" +
                        "- Dual Fungsi (Desk Fan & Wall Fan)\n" +
                        "- Ukuran Kipas 12 Inch\n" +
                        "- 3 Fungsi Kecepatan\n" +
                        "- Design Kokoh\n" +
                        "- Garansi Resmi MIYAKO 1 Tahun\n", R.drawable.kipas2));
        kipas.add(new Kipas("MITOCHIBA Kipas Angin Besi Tornado 18 Inchi 3 In 1 City Fan 1822 J - G", "Rp209.000",
                "1. Garansi 3 Tahun Motor\n" +
                        "2. Ukuran baling yaitu 18 Inch\n" +
                        "3. Bahan rangka terbuat dari besi\n" +
                        "4. Memiliki 3 fungsi Pengaturan kecepatan ", R.drawable.kipas3));
        kipas.add(new Kipas("Grotic Kipas Angin Portable Genggam Rechargeable USB Fan 3 Speed", "Rp58.000",
                "Spesifikasi:\n" +
                        "Barang: Kipas Portable\n" +
                        "Kekuatan kipas: 3W\n" +
                        "Masukan: DC 5 Volt 1A\n" +
                        "Pilihan Kecepatan: rendah, sedang, tinggi\n" +
                        "Baterai: built-in baterai li on yang dapat diisi ulang", R.drawable.kipas4));
        return kipas;
    }
    private static List<Tv> initDataTv(Context ctx) {
        List<Tv> tvs = new ArrayList<>();
        tvs.add(new Tv("Sakura TV 19 inch HD Ready TV LED Televisi (TCLG-S19A)", "Rp649.000",
                "-USB: 1\n" +
                        "-HDMI: 1\n" +
                        "-VGA: 1\n" +
                        "-Output headphone: 1", R.drawable.tv1));
        tvs.add(new Tv("SHARP LED TV 32 Inch HD HDMI - 2T-C32BA1i - Black (2019)", "Rp1.665.000",
                "- Produk Baru SHARP 2019\n" +
                        "- SHARP LED TV 32 Inch HD\n" +
                        "- Resolusi : 1366 X 768\n" +
                        "- Antena booster untuk meningkatkan kualitas sinyal antena", R.drawable.tv2));
        tvs.add(new Tv("AQUA LED TV SMART ANDROID 9.0 LE 43AQT6600 FG FULL HD [43INCHI]", "Rp3.299.900",
                "Resolution FHD (1920 X 1080p)\n" +
                        "\n" +
                        "AQUA Android TV dengan resolusi Full HD menampilkan kualitas gambar dengan detail lebih tajam dan jernih.\n" +
                        "\n" +
                        "SMART TV, ANDROID 9.", R.drawable.tv3));
        tvs.add(new Tv("Xiaomi LUX Transparent TV OLED 55 Inch", "Rp100.000.000",
                "Xiaomi Transparent TV\n" +
                        "An imagination and exploration of the future\n" +
                        "Removed the back panel of the traditional TV,\n" +
                        "A whole screen almost \"disappeared\", like a transparent glass.", R.drawable.tv4));
        return tvs;
    }

    private static List<Kulkas> initDataKulkas(Context ctx) {
        List<Kulkas> kulkas = new ArrayList<>();
        kulkas.add(new Kulkas("Polytron Belleza Kulkas 2 Pintu PRM 21", "Rp2.599.900",
                "FITUR :\n" +
                        "- Door : Double Doors\n" +
                        "- Ice Twist Tray : Yes\n" +
                        "- Egg Pocket : Yes\n" +
                        "- 360 Multiflow : LED Lighting\n" +
                        "- Tempered glass rack : Yes\n" +
                        "- Tempered glass door : Yes", R.drawable.kulkas1));
        kulkas.add(new Kulkas("RSA Showcase Agate 200 Agate-200 - 192liter", "Rp2.639.000 ",
                "Agate 200\n" +
                        "dimensi : 54x57.5x144cm\n" +
                        "3 RAK\n" +
                        "kapasitas : 192 liter\n" +
                        "konsumsi listrik : 180w", R.drawable.kulkas2));
        kulkas.add(new Kulkas("LG GCC247UGUV KULKAS SIDE BY SIDE KULKAS INVERTER", "Rp13.999.000",
                "Spesifikasi :\n" +
                        "-LG GC-C247UGUV\n" +
                        "-Kapasitas 675L / 618L\n" +
                        "-Black Glass\n" +
                        "-Smart ThinQ™\n" +
                        "-170 W Power Input\n" +
                        "-Inverter Linear Compressor ", R.drawable.kulkas3));
        kulkas.add(new Kulkas("KULKAS SHARP 1 pintu SJ-N 162 ap Kirei 3 kirei promo 133liter", "Rp1.465.000",
                "Defrosting Semi Automatic\n" +
                        "CAPACITY\n" +
                        "Capacity (Gross / Netto) 133 Liter / 128 Liter\n" +
                        "Refrigerator (Gross / Netto) 113 Liter / 109 Liter\n" +
                        "Freezer (Gross / Netto) 20 Liter / 19 Liter\n" +
                        "POWER", R.drawable.kulkas4));
        return kulkas;
    }

    private static void initAllPeralatans(Context ctx) {
        peralatans.addAll(initDataHp(ctx));
        peralatans.addAll(initDataKulkas(ctx));
        peralatans.addAll(initDataKipas(ctx));
        peralatans.addAll(initDataTv(ctx));
    }

    public static List<Peralatan> getAllPeralatan(Context ctx) {
        if (peralatans.size() == 0) {
            initAllPeralatans(ctx);
        }
        return  peralatans;
    }

    public static List<Peralatan> getPeralatanByTipe(Context ctx, String merek) {
        List<Peralatan> peralatansByType = new ArrayList<>();
        if (peralatans.size() == 0) {
            initAllPeralatans(ctx);
        }
        for (Peralatan h : peralatans) {
            if (h.getMerek().equals(merek)) {
                peralatansByType.add(h);
            }
        }
        return peralatansByType;
    }

}
