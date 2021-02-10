package com.example.shankselectronics.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shankselectronics.R
import com.example.shankselectronics.activity.MainActivity
import com.example.shankselectronics.adaptar.ListAdaptar
import com.example.shankselectronics.adaptar.TabAdaptar
import com.example.shankselectronics.model.Product
import kotlinx.android.synthetic.main.fragment_my.view.*


class MyFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var categoryId: Int = 0
    private var mProducts: ArrayList<Product> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            categoryId = it.getInt(MainActivity.key)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view =  inflater.inflate(R.layout.fragment_my, container, false)
        init (view)
        return view
    }

    private fun init(view: View)
    {
        getData(categoryId)
        var listAdaptar = ListAdaptar(activity!!, mProducts)
        view.list_view.adapter = listAdaptar

    }

    companion object {
        @JvmStatic
        fun newInstance(param1: Int) =
            MyFragment().apply {
                arguments = Bundle().apply {
                    putInt(MainActivity.key, param1)

                }
            }
    }

    private fun getData(catId: Int)
    {
        when (catId) {

            1 -> {
                mProducts.add(
                    Product(
                        "Huawei P20",
                        "Huawei P 20 smartphone with touch screen",
                        R.drawable.huawei_p20
                    )
                )
                mProducts.add(
                    Product(
                        "Iphone 6",
                        "Apple smart phone with 64 GB memory",
                        R.drawable.iphone_six
                    )
                )
                mProducts.add(
                    Product(
                        "Iphone X",
                        "Apple smart phone with 128 GB memory and wide angle camera",
                        R.drawable.iphone_x
                    )
                )
                mProducts.add(
                    Product(
                        "Jio",
                        "Jio phone with memory card of 512 MB and keypad",
                        R.drawable.jio_keypad_phone
                    )
                )
                mProducts.add(
                    Product(
                        "Galaxy Y",
                        "Samsung new Galaxy Y with high optimization and processing speed",
                        R.drawable.samsung_galaxy
                    )
                )
            }

            2->{
                mProducts.add(Product("ASUS", "ASUS - 14.0\" Laptop - Intel Celeron N4020 - 4GB Memory - 128GB eMMC - Pink", R.drawable.asus))
                mProducts.add(Product("MSI modern 15", "A10M-455 - Intel I5 - 8GB Memory - 512GB SSD - Black",R.drawable.msi_modern ))
                mProducts.add(Product("Dell Inspiron 7000", "17\" QHD+ Touch Laptop - 11th Gen Intel Core i7 -NVIDIA - 16GB RAM - 512GB SSD+32GB Optane - Silver", R.drawable.dell_inperon))
                mProducts.add(Product("HP chromebook", "14\" Touch-Screen Chromebook - Intel Core i3 - 8GB Memory - 64GB eMMC Flash Memory - Mineral Silver", R.drawable.chromebook))
                mProducts.add(Product("Macbook Pro", "13.3\" Laptop - Apple M1 chip - 8GB Memory - 512GB SSD (Latest Model) - Space Gray", R.drawable.macbook))
                mProducts.add(Product("Lenovo Yoga", " C740 2-in-1 14\" Touch-Screen Laptop - Intel Core i5 - 8GB Memory - 256GB Solid State Drive - Mica", R.drawable.lenovo))
                mProducts.add(Product("MSI modern 15", "A10M-455 - Intel I5 - 8GB Memory - 512GB SSD - Black",R.drawable.msi_modern ))
                mProducts.add(Product("Dell Inspiron 7000", "17\" QHD+ Touch Laptop - 11th Gen Intel Core i7 -NVIDIA - 16GB RAM - 512GB SSD+32GB Optane - Silver", R.drawable.dell_inperon))
                mProducts.add(Product("HP chromebook", "14\" Touch-Screen Chromebook - Intel Core i3 - 8GB Memory - 64GB eMMC Flash Memory - Mineral Silver", R.drawable.chromebook))
                mProducts.add(Product("Macbook Pro", "13.3\" Laptop - Apple M1 chip - 8GB Memory - 512GB SSD (Latest Model) - Space Gray", R.drawable.macbook))
                mProducts.add(Product("Lenovo Yoga", " C740 2-in-1 14\" Touch-Screen Laptop - Intel Core i5 - 8GB Memory - 256GB Solid State Drive - Mica", R.drawable.lenovo))
            }

            3->{
                mProducts.add(Product("CyberPowerPC", "Gamer Xtreme Gaming Desktop - Intel Core i5-10600KF -" +
                        " 8GB Memory - NVIDIA GeForce GTX 1660 SUPER - 1TB HDD + 240GB SSD - Black", R.drawable.cyperpowerpc))
                mProducts.add(Product("HP - ENVY Desktop", "Intel Core i7 - 16GB memory - 512GB SSD - Nightfall Black", R.drawable.hp_envy))
                mProducts.add(Product("Dell - Inspiron 3880 Desktop", "Intel Core i5-10400 - 12GB Memory -" +
                        " 256B SSD -Ethernet - WiFi - Bluetooth - keyboard + mouse - Black", R.drawable.dell))
                mProducts.add(Product("iBUYPOWER ", "Trace MR Gaming Desktop - Intel i7-10700F - 16GB Memory " +
                        "- NVIDIA GeForce GTX 1660Ti 6GB - 480GB SSD + 1TB HDD", R.drawable.ibuypower))
                mProducts.add(Product("HP OMEN", "30L Gaming Desktop - AMD Ryzen 7-Series - 3700X " +
                        "- 16GB Memory - NVIDIA GeForce RTX 2060 - 1TB HDD + 256GB SSD - Black", R.drawable.hpomen))
            }
        }
    }
}