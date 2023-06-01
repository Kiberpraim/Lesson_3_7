package com.example.lesson_3_7

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson_3_7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var arrayList: ArrayList<Laptop> = ArrayList()

    lateinit var adapter: LaptopAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arrayList.add(
            Laptop(
                "ASUS VivoBook S14",
                65990,
                "https://avatars.mds.yandex.net/get-mpic/6342941/img_id7288312838062401478.jpeg/orig",
                "Общие данные:\n" +
                        "Процессор: Intel Core i5 Tiger Lake 2.4 ГГц\n" +
                        "Код процессора: 1135G7\n" +
                        "Количество ядер процессора: 4\n" +
                        "Память: 8 ГБ DDR4 3200 МГц\n" +
                        "Установленная операционная система: без OS\n" +
                        "Устройства хранения данных:\n" +
                        "Оптический привод: нет\n" +
                        "Жесткий диск: 512 ГБ SSD\n" +
                        "Слоты расширения:\n" +
                        "Картридер microSD\n" +
                        "Экран:\n" +
                        "Дисплей: 14 (35.6 см), 1920x1080 Full HD 16:9, IPS (LED) Матовый, 250 нит"
            )
        )
        arrayList.add(
            Laptop(
                "HUAWEI MateBook D 14",
                52999,
                "https://avatars.mds.yandex.net/get-mpic/6367278/img_id804633663201298509.jpeg/orig",
                "Производитель\n" +
                        "HUAWEI\n" +
                        "Линейка\n" +
                        "MateBook\n" +
                        "Тип\n" +
                        "ноутбук\n" +
                        "Разрешение экрана\n" +
                        "1920x1080\n" +
                        "Частота обновления экрана\n" +
                        "60 Гц\n" +
                        "Линейка процессора\n" +
                        "Intel Core i5\n" +
                        "Количество ядер процессора\n" +
                        "4\n" +
                        "Оперативная память\n" +
                        "8 ГБ\n" +
                        "Тип видеокарты\n" +
                        "встроенная\n" +
                        "Видеокарта\n" +
                        "Intel Iris Xe Graphics\n" +
                        "Объем видеопамяти\n" +
                        "SMA\n" +
                        "Общий объем накопителей SSD\n" +
                        "512 ГБ\n" +
                        "Общий объем накопителей HDD\n" +
                        "отсутствует\n" +
                        "Версия ОС\n" +
                        "Windows 11 Home"
            )
        )
        arrayList.add(
            Laptop(
                "Lenovo Legion 5",
                107611,
                "https://avatars.mds.yandex.net/get-mpic/4304063/img_id3667062976467974617.png/orig",
                "Ноутбуки Legion 5 15 сочетают в элегантных и минималистичных корпусах производительные процессоры AMD Ryzen серии 4000, видеокарты NVIDIA® GeForce® и опциональные твердотельные накопители, а за охлаждение всех компонентов отвечает система Legion Coldfront 2.0. Геймеры любого уровня получат возможность подобрать модель, соответствующую их ожиданиям и потребностям. Наслаждайтесь идеальной точностью цветопередачи на дисплее стандарта FHD с невероятной частотой обновления, а также чувствительными элементами управления клавиатуры TrueStrike, которая позволит вам оставить конкурентов далеко позади."
            )
        )
        arrayList.add(
            Laptop(
                "HUAWEI MateBook D 14",
                49990,
                "https://avatars.mds.yandex.net/get-mpic/6367278/img_id804633663201298509.jpeg/orig",
                "Эстетика во всем\n" +
                        "HUAWEI MateBook D 14 оснащен ярким IPS-экраном который обрамлен узкой рамкой шириной всего 4,8 мм. Благодаря почти полному отсутствию рамки 14-дюймовый экран ноутбука кажется бесконечным. А ощущения при просмотре фильма на ноутбуке с углом обзора 178° сравнимы с походом в кинотеатр. Даже простая отправка электронного письма станет комфортнее благодаря яркому экрану с четким изображением.\n" +
                        "Легкий, тонкий и стильный\n" +
                        "Ультрасовременный ноутбук HUAWEI MateBook D 14 весом всего 1,38 кг и толщиной 15,9 мм выглядит лаконично и компактно. Также ноутбук способен раскрываться почти на 180°, поэтому не важно, как вы сидите перед ним — откинувшись назад или прямо перед экраном."
            )
        )
        arrayList.add(
            Laptop(
                "ASUS Vivobook 16X",
                55459,
                "https://avatars.mds.yandex.net/get-mpic/5288893/img_id3609390396594160235.png/orig",
                "Линейка\n" +
                        "VivoBook\n" +
                        "Код модели\n" +
                        "Vivobook 16X M1603\n" +
                        "Тип\n" +
                        "ноутбук\n" +
                        "Линейка процессора\n" +
                        "AMD Ryzen 5\n" +
                        "Процессор\n" +
                        "AMD Ryzen 5 5600H\n" +
                        "Частота процессора\n" +
                        "3300 МГц\n" +
                        "Количество ядер процессора\n" +
                        "6\n" +
                        "Ядро процессора\n" +
                        "Cezanne\n" +
                        "Оперативная память\n" +
                        "8 ГБ\n" +
                        "Тип памяти\n" +
                        "DDR4"
            )
        )
        arrayList.add(
            Laptop(
                "Apple MacBook Air 13",
                114890,
                "https://avatars.mds.yandex.net/get-mpic/6303765/img_id2376637627791323314.png/orig",
                "MacBook Air 2022 года можно назвать одним из крупнейших обновлений линейки за всю историю. Он полностью изменился внешне, получил более новый и мощный процессор M2, улучшенную веб-камеру, квадрофонические динамики объёмного звучания, разъём MagSafe 3 и более новую клавиатуру, при этом вес ноутбука составляет всего 1240 граммов, а корпус, как и прежде, сделан из приятного алюминия."
            )
        )
        arrayList.add(
            Laptop(
                "Lenovo Legion 5",
                107611,
                "https://avatars.mds.yandex.net/get-mpic/4304063/img_id3667062976467974617.png/orig",
                "Ноутбуки Legion 5 15 сочетают в элегантных и минималистичных корпусах производительные процессоры AMD Ryzen серии 4000, видеокарты NVIDIA® GeForce® и опциональные твердотельные накопители, а за охлаждение всех компонентов отвечает система Legion Coldfront 2.0. Геймеры любого уровня получат возможность подобрать модель, соответствующую их ожиданиям и потребностям. Наслаждайтесь идеальной точностью цветопередачи на дисплее стандарта FHD с невероятной частотой обновления, а также чувствительными элементами управления клавиатуры TrueStrike, которая позволит вам оставить конкурентов далеко позади."
            )
        )
        arrayList.add(
            Laptop(
                "Xiaomi RedmiBook 15",
                39999,
                "https://avatars.mds.yandex.net/get-mpic/3765589/img_id6212279980013072763.png/orig",
                "Xiaomi RedmiBook 15\n" +
                        "Новейший процессор 11-го поколения Intel® Core™ i3-1115G4 с графическим процессором Intel® UHD Graphics или процессор Intel® Core™ i5-11320H с графическим процессором Intel® Iris® Xe Graphics для быстрого и эффективного решения задач.\n" +
                        "Дизайн ноутбука, разработанный специально для RedmiBook 15, выполнен в темно-сером цвете с металлическим отливом."
            )
        )


        adapter = LaptopAdapter(arrayList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("laptop",it)
            startActivity(intent)
        }
        binding.recyclerView.adapter = adapter
    }
}