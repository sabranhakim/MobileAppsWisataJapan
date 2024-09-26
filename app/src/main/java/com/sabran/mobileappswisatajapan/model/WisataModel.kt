package com.sabran.mobileappswisatajapan.model

import com.sabran.mobileappswisatajapan.R

data class WisataModel
    (
    val gambar : Int,
    val nama : String,
    val tempat : String,
    val detail : String
            )

    object WisataList {
        fun getModel(): List<WisataModel> {
            val itemModel1 = WisataModel(
                R.drawable.akihabara,
                "Akihabara",
                "Tokyo",
                "Mengunjungi distrik perbelanjaan Akihabara menghadirkan keasyikan tersendiri bagi para pencinta game dan anime. Pasalnya, distrik ini dipenuhi dengan toko yang menjual berbagai merchandise anime, manga, game, dan gadget. "
            )
            val itemModel2 = WisataModel(
                R.drawable.biei_blue_pond,
                "Biei Blue Pond",
                "Hokkaido",
                "Biei Blue Pond adalah fenomena alam yang menarik di Hokkaido, dengan warna airnya yang unik, perpaduan menakjubkan antara biru dan hijau yang berubah sesuai dengan cuaca dan musim. Warna unik ini disebabkan oleh kandungan mineral dalam air kolam, dan semakin indah lagi karena kolamnya dikelilingi oleh hutan pinus yang membuat pemandangan di sini semakin indah."
            )
            val itemModel3 = WisataModel(
                R.drawable.dotonbori,
                "Dotonbori",
                "Osaka",
                "Dotonbori ibarat Shibuya-nya Osaka. Pusat perbelanjaan yang begitu sibuk dan menjadi shopping destination favorit para turis. Di sini kamu dapat berbelanja atau sekadar berfoto di depan papan iklan yang konon sudah dipasang sejak 1935. "
            )
            val itemModel4 = WisataModel(
                R.drawable.ghibli_museum,
                "Ghibli Museum",
                "Tokyo",
                "Pengalaman magis ini hanya dapat kamu rasakan saat mengunjungi Ghibli Museum yang terletak di sebelah barat Tokyo. Ghibli Museum adalah bentuk dedikasi para animator Studio Ghibli dan penghargaan untuk para penggemarnya yang tersebar di seluruh dunia. "
            )
            val itemModel5 = WisataModel(
                R.drawable.mount_fuji,
                "Mount Fuji",
                "Shizuoka",
                "Berdiri di ketinggian 3.765 meter, Mount Fuji menjadi gunung tertinggi Jepang! Gunung berapi ini merupakan salah satu situs ikonik dan menjadi favorit banyak orang. "
            )
            val itemModel6 = WisataModel(
                R.drawable.nara_park,
                "Nara Park",
                "Nara",
                "Bermain bersama rusa-rusa menggemaskan cuma dapat kamu lakukan di Nara Park . Kamu enggak hanya bisa mengelu-elus kepala seribuan rusa yang berkeliaran bebas di taman ini, tetapi juga memberi mereka makan. Kamu bisa membeli senbei, sejenis kerupuk yang jadi makanan rusa-rusa ini di pintu masuk taman. Yang bikin tambah menggemaskan, rusa-rusa ini akan membungkukkan kepalanya ketika meminta makanan dari kamu."
            )
            val itemModel7 = WisataModel(
                R.drawable.osaka_castle,
                "Osaka Castle",
                "Osaka",
                "Istana ini dikelilingi oleh taman raksasa yang populer Osaka Castle juga memiliki museum yang menyimpan lebih dari 1.000 artefak yang menjadi catatan penting sejarah panjang Jepang. Luangkan waktumu untuk bersantai sejenak dengan menikmati keasrian Taman Nishinomaru."
            )
            val itemModel8 = WisataModel(
                R.drawable.shibuya_crossing,
                "Shibuya Crossing",
                "Tokyo",
                "Shibuya Crossing menjadi magnet yang begitu kuat bagi para turis untuk berkunjung ke Tokyo. Shibuya merupakan satu dari 23 kota bagian di Tokyo. Area ini dipenuhi dengan tempat hiburan sehingga menjadi kawasan populer anak muda Tokyo. Sementara, Shibuya Crossing sendiri merupakan tempat yang paling ramai dan bisa dibilang pusat dari kawasan Shibuya."
            )
            val itemModel9 = WisataModel(
                R.drawable.shirakawa_go,
                "Shirakawa Go",
                "Gifu",
                "Shirakawa-Go yang terletak di bagian tengah Jepang terkenal akan rumah-rumah tradisionalnya yang beratap curam dari jerami dan dikelilingi oleh alam yang subur. Pemandangan menakjubkan dan suasana damai yang menyertainya membuat Situs Warisan Dunia UNESCO ini memang sangat layak untuk dikunjungi!"
            )
            val itemModel10 = WisataModel(
                R.drawable.tokyo_tower,
                "Tokyo Tower",
                "Tokyo",
                "Tokyo Tower tidak hanya berbicara tentang ketinggian, tetapi juga simbol kebangkitan orang-orang Jepang setelah perang. Sejak dibangun pada 1958 setelah Perang Dunia II usai, Tokyo Tower menjadi landmark paling ikonik di Jepang."
            )

            val itemList: ArrayList<WisataModel> = ArrayList()
            itemList.add(itemModel1)
            itemList.add(itemModel2)
            itemList.add(itemModel3)
            itemList.add(itemModel4)
            itemList.add(itemModel5)
            itemList.add(itemModel6)
            itemList.add(itemModel7)
            itemList.add(itemModel8)
            itemList.add(itemModel9)
            itemList.add(itemModel10)

            return itemList
        }
    }
