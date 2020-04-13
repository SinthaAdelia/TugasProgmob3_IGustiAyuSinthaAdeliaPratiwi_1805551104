package com.example.rekomendasidramakoreaterbaru2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoDrakor = new ArrayList<>();
    private ArrayList<String> namaDrakor = new ArrayList<>();
    private ArrayList<String> infoDrakor = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesrecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerViewAdapter adapter = new recyclerViewAdapter(fotoDrakor, namaDrakor, infoDrakor, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namaDrakor.add("Crash Landing on You");
        fotoDrakor.add("https://akcdn.detik.net.id/community/media/visual/2020/02/17/862f2ab0-2c59-44e8-b182-49f6901f93a9.jpeg?a=1");
        infoDrakor.add("Drama yang ditayangkan tvN ini bercerita tentang anak konglomerat di Korea Selatan bernama Yoon Se-ri. Tanpa sengaja dia masuk ke wilayah Korea Utara saat Paralayang yang dia naiki terseret angin tornado. Di sana, ia bertemu perwira Korea Utara, Ri Jung-hyuk, yang mencurigainya. Pada akhirnya Jung-hyuk memutuskan melindungi Se-ri di Korea Utara sambil mencari cara untuk kembali ke Korea Selatan. Drama Crash Landing on You dibintangi artis papan atas Korea Selatan yaitu Hyun Bin, Son Ye-jin, Kim Jung-hyun, Seo Jin-hye dan Oh Man-seok.");

        namaDrakor.add("Itaewon Class");
        fotoDrakor.add("https://akcdn.detik.net.id/community/media/visual/2020/02/29/eb814968-68d7-4573-96c9-af98ab120eb7.jpeg?a=1");
        infoDrakor.add("Drama Korea Itaewon Class diadaptasi dari Webtoon dengan judul yang sama yang tayang pada 31 Januari lalu. Dibintangi aktor papan atas, Park Seo Joon, dengan jumlah 16 episode. Mengisahkan tentang Park Sae Re-Yi yang membalaskan dendamnya kepada Jang Dae Hae karena kematian ayahnya dan perjuangan hidupnya yang membuka restoran di Itaewon setelah keluar dari penjara.");

        namaDrakor.add("Dr. Romantic 2");
        fotoDrakor.add("https://akcdn.detik.net.id/community/media/visual/2020/02/19/37ef7cff-0276-4873-8979-62427997267d_169.jpeg?w=620");
        infoDrakor.add("Drama yang tayang di SBS ini sudah tayang pada 6 Januari lalu dan dimainkan oleh aktor Han Suk Kyu, Ahn Hyo Seop, dan Lee Sung Kyung. Cerita yang ada dalam drama Dr. Romantic 2 berfokus pada sejumlah besar pasien trauma dipindahkan ke ruang gawat darurat Rumah Sakit Dol Nam dan semua kasus bedah. Selain itu, drama ini juga mengangkat berbagai aspek masyarakat Korea.");

        namaDrakor.add("Black Dog: Being A Teacher");
        fotoDrakor.add("https://akcdn.detik.net.id/community/media/visual/2020/03/04/7884ebbe-deef-4a8e-9ead-bd89088b406d_169.jpeg?w=620");
        infoDrakor.add("Drama Korea bergenre komedi ini dibintangi oleh Soe Hyun-jin, Ra Mi-ran, dan Ha-joon. Mengisahkan tentang seorang perempuan muda yang ingin menggapai mimpinya menjadi guru. Akhirnya, ia memiliki kesempatan untuk mengajar di salah satu sekolah swasta. Namun, ia menemukan ada banyak masalah yang terjadi di sekolah tersebut. Saat dia mengatasi masalah-masalah tersebut, dirinya tumbuh menjadi guru dengan kepribadian yang lebih baik.");

        namaDrakor.add("Touch");
        fotoDrakor.add("https://akcdn.detik.net.id/community/media/visual/2020/03/04/95206b39-751e-409b-be80-4eb61e6cbcb1.jpeg?a=1");
        infoDrakor.add("Drama bergenre komedi romantis ini sudah tayang sejak Januari lalu. Drama Touch berjumlah 16 episode. Mengisahkan seorang make-up artis yang berbakat dan populer, namun dirinya berubah menjadi pengangguran karena memiliki banyak hutang. Drama Touch dibintangi Joo Sang Wook dan Kim Bo Ra.");

        prosesrecyclerViewAdapter();
    }
}
