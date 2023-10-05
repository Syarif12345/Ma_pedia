package com.example.mapedia

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StorylistActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var storyAdapter: StoryAdapter
    private val storyList = listOf(
        Story(" Syarif", "Mimpi atau Nyata", "     Tanpa rasa letih kami terus berlari menuju jalan raya, sungguh kejadian luar biasa paling menakutkan dalam hidupku, tak satu pun kendaraan yang lewat seakan kami hidup hanya berdua di dunia ini.\n" +
                "    \n" +
                "     Tak lama kemudian, aku dan Anthony melihat sekelompok orang dengan motornya, \"ton, tuh ada orang bisa kita tanya disana,\" ujarku kepada Anthony. Namun dia tidak menjawab omonganku, hanya melihat dengan misterius ke arahku, mungkin dia masih teringat kejadian tadi di rumah  sakit.\n" +
                "    \n" +
                "     \"Permisi bro, jalan ke kota lewat mana ya?\" tanyaku kepada sekelompok orang itu. Mereka tidak menjawab apapun melainkan hanya melihatku dengan wajah pucatnya, tanpa berpikir lama aku langsung menarik tangan Anthony dan lari dari tempat tersebut.\n" +
                "    \n" +
                "     Di tengah perjalanan, Anthony masih terlihat pucat dan ketakutan akan hal yang terjadi, tapi tak biasanya dia membisu seperti ini, sudah ku coba mengajaknya berbicara tapi dia hanya mengangguk dan menggelengkan kepala, akhirnya aku memutuskan diam di perjalanan.\n" +
                "    \n" +
                "     \"Akhirnya sampai kostan juga ton, capek banget hampir 2 jam kita jalan kaki\" dia hanya senyum kepadaku, lalu menoleh ke jam tangan yang ada di tangan kirinya, dengan spontan aku juga melihat jam tangan yang ada di tanganku dan jam menunjukkan pukul 00.13 suasana sangat sepi dan Anthony berjalan mendahului ku menuju kamar. \"keburu banget sih tu anak, kan kunci kamarnya ada di aku, nah waktunya ngerjain si Anthony ni haha..\" ujarku.\n" +
                "\n" +
                "     Aku menunggu di kursi taman, dengan sengaja aku tidak menyusul Anthony, karena kunci kamarku ada di kantong jaket kulit kesayanganku ini, jam tanganku menunjukkan pukul 00.38 \"ah kemana si Anthony?\" tanyaku penasaran. Lalu aku memutuskan naik ke kamarku yang berada di lantai dua itu. Ketika naik tangga terdengar suara kran air dari kamar mandi yang ada di bawah tangga ini.\n" +
                "\n" +
                "     \"ton ini kamu kan?\" tanyaku di depan kamar mandi, masih tidak ada jawaban dari dalam kamar mandi, aku berfikir Anthony yang ada di kamar mandinya, dan dia masih takut atas kejadian yang berlalu tadi. Lalu aku memutuskan untuk jalan ke kamar terlebih dahulu, ketika aku membuka pintu kamar, aku menemukan suatu yang janggal. Anthony sudah tertidur pulas di atas ranjang itu. Aku berfikir bagaimana bisa dia masuk dengan pintu di kunci seperti ini, dan aku melihat ke arah jendela \"ah ternyata dia masuk lewat jendela ini, pantesan kebuka jendelanya,\" gumamku. Akhirnya aku memutuskan untuk tidur di samping Anthony, pikiranku masih teringat akan kejadian yang tadi menimpa aku dan Anthony. betapa menyeramkannya makhluk yang berdiri di depan kami berdua.\n" +
                "\n" +
                "     Tanganku tak sengaja menyenggol jam beker kesayangan Anthony, jam itu pecah dengan suara yang keras namun hal itu tidak membangunkan Anthony yang sedang tertidur pulas.\n" +
                "\"untung saja dia tidak bangun\" gumamku. Dengan cepat aku langsung membuang pecahan jam beker itu ke tempat sampah, dan aku langsung membaringkan diri di sebelah Anthony yang saat itu sedikit menguasai kasur akibat badannya yang gemuk.\n" +
                "\n" +
                "     Hawa dingin mulai menusuk tulang rusukku, aku pun terbangun dari tidurku rasanya dingin sekali, \"pantas saja dingin jendelanya gak ditutup\" gumamku. Aku langsung bangun dan dan beranjak menuju jendela kamarku. Ketika hendak berdiri aku baru menyadari akan Anthony yang tak bersamaku di kasur. \"ah mungkin dia ke kamar mandi\" pikirku mencoba menenangkan. Dan ketika aku berdiri di depan jendela untuk menutupnya, aku melihat sosok pria yang sedang tersenyum lebar menghadapku. Aku belum bisa melihat jelas sosok pria tersebut, sudah kucoba mengusap mata berkali kali namun tetap sia sia, dan ketika dia mulai mendekatiku ternyata dia Anthony aku bisa melihatnya dengan jelas.\n" +
                "\n" +
                "     \"oala ternyata itu kamu ton, aku kira siapa, ngapain kamu disana?\" tanyaku. Pikiranku mulai kacau seakan ada yang berusaha mengacaukan pikiranku, dan aku teringat bahwa kamarku ada di lantai dua, \"bagaimana bisa di luar sana ada Anthony? Kamar kita kan di lantai dua\" gumamku sambil perlahan lahan berjalan mundur, kakiku terasa sangat lemas sehingga aku terjatuh dan terkapar di lantai.\n" +
                "\n" +
                "    \"kring..kring.. Tiba tiba bunyi jam Anthony membangunkanku, entah kenapa aku berada di atas kasur saat itu, aku langsung mematikan alarm tersebut. \"bagaimana bisa jam yang sudah pecah dan semalam ku buang sekarang ada di atas meja lagi?\" tanyaku dengan heran. Aku mencoba mengingat kejadian yang telah terjadi, tapi ingatanku tidak menjawab apa yang telah terjadi sebelumnya, yang aku ingat hanya terakhir aku memecahkan jam beker kesayangan milik Anthony. Masih dalam keadaan yang sama Anthony tidak bersamaku di kamar seakan dia ditelan bumi, aku berusaha mengamati keadaan kamarku dan berharap tidak ada keanehan di dalamnya.\n" +
                "\n" +
                "     Aku tak menemukan keanehan di kamarku, selain jam yang telah ku buang bisa berada di atas meja lagi dan selembar kertas di sudut kamarku yang kupikir aku tak pernah menaruhnya disana, lalu aku mengambil selembar kertas itu dan aku bisa mengenal tulisan itu, \"ya itu tulisan anthony\" gumamku.\n" +
                "\n" +
                "     \"jam beker kesayangan ku!!!\" isi tulisan di selembar kertas itu. Masih dengan pikiran kacau di selingin rasa takut \"ini tulisan Anthony, dimana dia\" gumamku dengan pikiran kacau aku menoleh ke jendela kamarku. Badanku mulai hampa seolah nyawaku akan melayang. Dengan memegang pisau berlumuran darah, Anthony menatapku dengan mata yang merah, dia menghampiriku perlahan, dan aku masih mencoba mengajaknya bicara, namun dia tidak merespon melainkan dia melompat dan mencapkan pisau itu tepat di dadaku dan kurasa itulah cerita akhir dalam hidupku.\n" +
                "\n" +
                "     \"eh eh vin, bangun vin, gila lu ganggu orang tidur aja\" kata si Anthony dengan raut wajah lesu dan ngantuk, aku kaget dan tak sengaja tanganku memukul kepala Anthony. \"wah lo nyari ribut ya ini waktunya tidur besok kuliah\" ucap Anthony dengan emosi. Aku tak percaya karena bisa melihat Anthony kembali \"ton ini kamu?\" ucapku sambil meraba seluruh tubuhnya. \"apaan sih kesurupan kamu ya?\"tanya Anthony yang sedang membetulkan selimut untuk tidur lagi. Aku pun langsung tersenyum lebar melihat Anthony yang nyata di depan mata akhirnya aku memutuskan ke kamar mandi untuk buang air kecil.\n" +
                "\n" +
                "     Sesampainya di kamar lagi lagi Anthony hilang dalam ranjang itu. pikiranku kembali kacau \"ada apa dengan dunia ini\" tanyaku dengan suara lantang, kemudian pandanganku teralih oleh selembar kertas hitam bertulisan merah, dengan penasaran aku membacanya dan.. \"kau pikir semua ini tidak nyata?\" dengan spontan aku melempar kertas tersebut ke tempat sampah, tulisan itu membuatku panik seketika aku tak sengaja menoleh ke arah jendela kamarku yang semalam ada Anthony disana, tapi kali ini beda tidak ada sosok Anthony disana melainkan sosok seram penunggu rumah sakit anker yang semalam kami kunjungi. Dengan tubuh lemas tak berdaya aku mencoba lari dari kamarku dan terjatuh di salah satu sudut kamarku, kemudian sosok tersebut mendekatiku. Aku berusaha mengambil sapu di sebelahku untuk mencoba memukulnya, akan tetapi semua itu telat, sosok itu telah memenggal kepalaku.\n" +
                "\n" +
                "   Kemudian krekk.. Anthony memasuki kamar kos dan melihat kejadian ini \"tampaknya aku tidak bisa tinggal dengan sahabatku lagi, alam bawah sadarnya membawa ke dimensi yang berbeda, dari semalam aku melihat ada yang mengikuti dan sekarang semakin banyak, aku harus pergiii!!\"ucap Anthony.\n" +
                "\n"),
        Story("Syarif", "Paradoks", "Aku tidak pernah percaya tentang apa itu hantu. Tetapi aku tetap tidak dapat melupakan peristiwa yang telah menimpaku beberapa tahun yang lalu. Oh iya, perkenalkan namaku Martin. Aku akan berbagi sedikit cerita yang pernah ku alami beberapa tahun yang lalu.\n" +
                "\n" +
                "Kala itu aku masih duduk di bangku SMA. Aku tinggal dengan ayah dan ibuku, namun sejak ibuku menderita penyakit kanker, kami sering pergi ke kota-kota lain, untuk mencari pengobatan kanker yang di derita oleh ibu, karena pengobatan di kota kami tidak sanggup untuk menangani penyakit ibuku yang semakin parah. Oleh sebab itu, aku memutuskan untuk berhenti sekolah agar mempermudah biaya pengobatan ibu.\n" +
                "\n" +
                "Beberapa bulan setelah kami berpindah- pindah untuk mencari pengobatan kanker, kondisi kesehatan ibu menurun drastis. Ibu memintanya agar menghentikan pengobatan kanker yang di deritanya. Ibuku meminta untuk di akhir masa hidupnya dia tinggal di tanah kelahirannya dimana tempat dia dibesarkan, yaa di sebuah rumah tua peninggalan kakekku. Tanpa berpikir banyak, ayah pun mengiyakannya, dan segera berangkat ke rumah tersebut.Sesampainya di rumah tersebut, kami di sambut hangat oleh rumah itu, rumah yang sudah lama tidak terhuni, kini pun merasakan jiwa manusia hadir kembali.\n" +
                "\n" +
                "Angin bertiup kencang disertai cahaya matahari yang mulai pudar, awan pun mulai meredup, suara gemuruh terdengar di telinga pertanda hujan akan turun. Setelah beres beres barang aku duduk di sofa ruang tengah, sembari melihat rintikan air hujan yang menyejukkan dengan pepohonan yang rindang, membuatku terhanyut dalam pikiran, kemudian krak.. Suara ranting yang jatuh menyadarkanku kembali setelah beberapa saat melamun. Aku mencoba mengamati rumah ini dengan ruangan yang penuh sejarah, dengan bentuknya yang khas namun aku penasaran dengan ruangan di pojok sebelah pintu yang mengarah ke dapur itu, \"ruangan apa itu?mengapa pintunya tertutup?\" pertanyaan yang tertera dalam pikiranku. Dengan penasaran aku melangkah mendekati ruangan itu, dan perlahan aku menggenggam pegangan pintu itu dan membukanya, tidak ada yang aneh hanya sebuah kamar kosong yang bersih dan rapi, tapi mengapa bisa kamar ini bersih, padahal sudah berpuluhan tahun tidak di huni \"ah sudahlah\" cuek ku.\n" +
                "\n" +
                "Pada malam harinya, aku beristirahat di sofa dekat kamar kosong yang tadi ku perhatikan. Ketika aku hendak tertidur dalam keadaan setengah tak sadar, aku mendengar ada seseorang yang tengah berbicara dengan orang lain dari arah kamar kosong tadi. Aku yang mendengarnya menjadi takut, dan aku memutuskan untuk tidur pada malam itu.\n" +
                "\n" +
                "Keesokan harinya, aku mengelilingi rumah tersebut dan melihat lihat foto yang terpajang di atas tembok. Dari sekian banyak foto yang aku perhatikan, semua foto tersebut hanyalah foto kakekku yang sedang berperang menggunakan pakaian militernya. Kemudian aku bertanya kepada ibuku bagaimana masa lalu kakekku, kemudian ibuku menceritakannya dan aku kaget karena ibuku mengatakan bahwa kakek meninggal di rumah ini, karena dibunuh oleh tentara Jepang. Aku juga bertanya perihal kamar kosong yang menurutku aneh itu, ibuku tidak ingin aku tau, namun aku memaksanya. Akhirnya ibu memberitahuku bahwa di sanalah kakek dibunuh.\n" +
                "\n" +
                "Tak lama kemudian, rasa penasaranku tentang kamar kosong itu semakin menjadi-jadi, aku segera beranjak ke kamar tersebut. Langkahku terhenti, nafasku menjadi sulit, tubuhku terasa berat, dan lampu yang ada di kamar itu menjadi redup. Terlihat di depanku, terdapat dua orang Jepang tua dengan kulit putih pucatnya membalikkan badan, dan menatapku dengan tatapan yang sinis.\n" +
                "\n" +
                "\"Pergilah!\" ucap salah satu dari kedua orang tersebut.\n" +
                "\n" +
                "Setelah beberapa lama, aku tersadar dan terbangun di atas sofa dengan ayah dan ibu di sebelahku. Mereka bertanya apa yang telah terjadi padaku. Aku hanya dapat terdiam sejenak dan menggelengkan kepala, kemudian ayah menyuruhku istirahat dan mereka kembali ke kamar. Beberapa saat kemudian, aku menyalakan televisi yang ada di depan sofa. Aku menontoh sebuah film komedi kesukaanku untuk menenangkan diri. Aku menuju dapur untuk membuat teh manis, dan saat itulah pandanganku terpaku ke arah jendela yang mengarah keluar rumah. Aku pun membuja jendela itu dan menengok keluar jendela, seketika ada yang mendorongku keluar jendela, sehingga kakiku terkilir dan terluka karena terkena kaca yang ada di jendela.\n" +
                "\n" +
                "Di tengah ketakutanku, tubuhku mendadak menjadi gemetar. Aku berlari dengan kaki pincangku ke arah pintu depan rumah. Aku mendengar ada seseorang yang baru saja mengunci pintu rumah, dan mendengar ada suara langkah kaki yang mengarah kepadaku dengan langkah yang cepat. Kupukul pintu rumah dengan sekeras kerasnya secara berulang-ulang. Semakin lama tubuhku menjadi mati rasa. Terlihat ada bayangan seorang laki-laki yang berjalan mengarah kepadaku. Dia juga memanggil namaku dengan rintihannya, aku pun menjadi lemah tak berdaya seolah-olah ini akhir dari hidupku.\n" +
                "\n" +
                "Tak kusangka aku terbangun tengah malam di atas sofa dengan televisi yang masih menyala di hadapanku. \"Untung saja itu hanyalah mimpi\" gumamku dalam hati. Keringat masih membasahi sekujur tubuhku.\n" +
                "\n" +
                "Sekerika terdengar suara benda terjatuh dari arah kamar kosong tadi. Aku langsung memberanikan diri untuk mendekatinya. Semakin kudekatkan telingaku ke arah kamar itu. Terdengar kembali suara seperti seseorang yang sedang berbicara pada orang lain. Tubuhku gemetar, langsung ku urungkan niatku untuk mendekati kamar itu. Namun, pintu itu terbuka dengan sendirinya. Aku langsung membalikkan badan, dan tanpa kusadari aku sedang berjalan ke arah kamar tersebut. Tampak tepat di depanku dua orang laki-laki tua yang mirip dengan yang kulihat semalam.\n" +
                "\n" +
                "\"Martin\" kata salah seorang dari keduanya.\n" +
                "\"siapa kau? Bagaimana kau bisa tahu namaku?\" tanyaku dengan kaki gemetar dengan keringat di sukujur tubuhku.\n" +
                "\n" +
                "\"aku adalah penghuni rumah tua ini sejak kakekmu meninggal. Perkenalkan namaku daisuki, dan ini temanku hachiro\" jawabnya.\n" +
                "\"bagaimana kau bisa tahu ini adalah rumah kakekku?\" kembali aku bertanya pada mereka.\n" +
                "\"kami akan memberi tahukan suatu rahasia padamu\" ucapnya dengan tatapan sinis dan senyuman yang mengerikan.\n" +
                "\"baiklah aku mendengarkan\" jawabku dengan sedikit menangkan diri.\n" +
                "\"kakekmu adalah orang baik, tetapi untuk hidup lebih lama, hantu harus melakukan pengorbanan, jadi kami membunuh kakekmu. Dan kami disini akan dapat hidup lebih lama lagi, karena kami baru saja mengorbankan orang tuamu\"\n" +
                "\n" +
                "\"apaaaa\"\n" +
                "\n" +
                "Aku segera berlari menuju kamar orang tuaku, dan kudapati mereka telah tergeletak di atas lantai dengan penuh darah di sekujur tubuhnya. Dan inilah akhir masa hidup orang tuaku.\n" +
                "\n"),
        Story("Syarif", "Siapa dia?", "     \"ini hari pertamaku kerja jadi gak boleh telat\" ujarku sambil menaiki sepeda motor dan bergegas untuk berangkat kerja. Di perjalanan, aku memikirkan biaya sekolah adikku, bagaimanapun juga aku harus bertanggung jawab untuk bisa membiayainya, walaupun dalam kondisi susah tapi tetap harus semangat. Sesampainya di depan tempat kerja, aku turun dari sepeda dan aku merasakan ada yang menarik tasku sedikit demi sedikit, aku menoleh ke belakang dan ternyata ada anak kecil yang sedang memegang tasku dari belakang, aku berfikir dia ingin minuman yang ada di samping tas gendong ku itu, dan ku berikan minuman itu. namun, anak kecil tersebut lari menjauh dariku.\n" +
                "\n" +
                "     Aku berfikir ingin mengejarnya, namun ini sudah waktunya kerja tak mungkin aku sempat untuk mengejar anak itu, \"siapa dia? Dan apa maksudnya?\" tanyaku dalam hati. masih terlintas dalam pikiranku pertanyaan itu. Jam menunjukkan pukul 17.00 pertanda kerja hari ini telah selesai dan semua para pekerja pulang, aku berharap bisa bertemu dengan anak itu lagi, dan akan kutanyakan maksudnya menarik tasku, akan tetapi sampai jam 19.00 anak itu tidak muncul dan aku memutuskan untuk pulang kerumah.\n" +
                "\n" +
                "     Sesampainya dirumah, aku membuka lemari dan mengambil selembar naskah kuno yang panjangnya 1 meter itu, yang diberikan oleh kakek sebelum dia meninggal. Aku benar benar tidak mengerti, naskah itu menggunakan bahasa sansekerta. Terlintas di pikiranku untuk menjual naskah kuno peninggalan kakek ku untuk biaya sekolah adikku. namun, aku ragu karena ini sangat berharga dan merupakan amanah yang harus dijaga, namun di sisi lain aku juga membutuhkan uang untuk biaya sekolah adikku.\n" +
                "\n" +
                "     \"ah tidak boleh aku harus menjaga naskah pemberian kakek ini\" gumamku dalam hati sambil meletakkan naskah itu kembali ke dalam lemariku. Dan aku memilih untuk tidur karena hari semakin larut.\n" +
                "glek..glek suara terdengar dari dalam lemariku. suaranya cukup membangunkanku dari tidur, kemudian dengan penasaran aku membuka lemariku, namun tidak ada apapun hanya baju, celana, jaket dan selembar naskah kuno dengan panjang 1 meter itu yang terlihat di depan mataku. Tidak ada yang aneh, semuanya baik baik saja, dan ketika aku ingin kembali melanjutkan tidur tak sengaja aku menoleh ke arah jendela, dan dari kejauhan terlihat seorang anak kecil yang sedang menatapku juga, yah benar itu anak yang tadi bertemu aku. Namun anak itu berlari dengan sangat cepat dan aku kehilangan jejak. Hari semakin larut dan aku memutuskan untuk tidur kembali.\n" +
                "\n" +
                "     Keesokan harinya aku membawa naskah itu di dalam tasku dan aku berangkat kerja. sesampainya di tempat kerja, aku berjalan dan kurasakan hal yang sama seperti kemarin ada yang menarik tasku, dengan spontan aku menoleh ke belakang, ternyata anak itu lagi dan dia langsung lari, aku berusaha mengejarnya tapi aku tertinggal, anak itu lari dengan sangat cepat seakan kecepatannya bukan seperti manusia.\n" +
                "\n" +
                "    Sepulangnya dari kerja aku berharap bertemu anak misterius itu, aku menunggu sampai pukul 20.00 tidak ada apapun, kemudian aku memutuskan untuk pulang. Ditengah perjalan aku merasakan ada yang menarik tasku lagi, lalu aku menoleh ke belakang dan anak itu sedang bersamaku di atas sepeda. aku pun berhenti, kemudian anak itu melompat dari sepedaku dan lari menuju kebun yang lebat pepohonannya. aku berusaha mengejar namun aku juga takut karena suasana kebun yang gelap, akhirnya aku memutuskan untuk pulang.\n" +
                "\n" +
                "     Ketika sampai dirumah, aku membuka tasku namun tak ada yang hilang, semua isinya ada. Siapa anak misterius itu? Hanya itu yang ada di pikiranku. Dan aku menyadari ada yang aneh dari naskah kuno yang selama ini ku bawa, pertama diberi kakek panjang naskah ini 1 meter dan sekarang berkurang menjadi setengah dari ukuran aslinya. \"tidakk apa yang terjadi mengapa naskah ini menjadi pendek gini\" tanyaku heran. apa ini ada sangkut pautnya dengan anak yang selalu menarik narik tasku ini.\n" +
                "\n" +
                "    Aku memutuskan untuk tidak tidur malam ini, aku ingin membuktikan siapa anak kecil yang selalu menggangguku itu, apa dia punya maksud dan tujuan, Kemudian glek..glek.. terdengar suara di dalam lemari, dan perlahan aku mendekati lemari dan membukanya ternyata anak kecil itu di dalam lemariku yang sedang mengambil separuh dari naskah kuno ku. Dia terlihat panik dan ingin lari, namun aku mencegahnya dan mencoba menenangkannya, \"teman apa maksud tujuanmu mengambil naskah kuno ini?\" tanyaku perlahan. Dia diam tidak menjawab apa apa dan hanya menatapku dengan tatapan histeris. aku bertanya \"apa kamu mengambil naskah kuno ku sedikit demi sedikit?\" dia mengangguk. Lalu aku bertanya apa alasannya dia mengambil naskah ku kemudian dia menjawab \"aku hanya ingin melindungi naskah kuno ini, aku tak ingin kau menjualnya.\" dan aku mengerti tujuannya sekarang\n" +
                "\"ini ambil semua naskah kuno nya kalau ini berharga untukmu\" ujarku.\n" +
                "\"tidak bisa ini warisan dari kakekmu aku ingin mengembalikan semuanya\" jawabnya sambil menyodorkan semua naskah yang telah dia ambil kemudian dia lari. Aku sempat mengikutinya, namun sampai di ujung jalan tiba-tiba dia menghilang seolah olah ditelan bumi, namun aku lega karena sudah tau apa tujuannya. tapi ada pertanyaanku yang belum terjawab \"siapa dia?\"\n" +
                "\n")
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_storylist)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        storyAdapter = StoryAdapter(storyList)
        recyclerView.adapter = storyAdapter

        storyAdapter.setOnItemClickListener { story ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("story", story)
            startActivity(intent)
        }
    }
}
