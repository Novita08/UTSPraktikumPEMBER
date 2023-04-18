package com.example.utspraktikumpember

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: Adapter
    lateinit var listData: ArrayList<Data>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycle = findViewById(R.id.idRVCourses)
        recycle.setHasFixedSize(true)
        listData = ArrayList()

        listData.add(Data("BoBoiBoy", "210441100001", "11 Tahun", R.drawable.boboy))
        listData.add(Data("Spongebob", "210441100002", "12 tahun", R.drawable.bobb))
        listData.add(Data("We Bare Bears", "210441100003", "13 tahun", R.drawable.beruang))
        listData.add(Data("Dora The Explorer", "210441100004", "14 tahun", R.drawable.dora))
        listData.add(Data("Larva Cartoons", "210441100005", "15 tahun", R.drawable.emon))
        listData.add(Data("Doraemon", "210441100006", "16 tahun", R.drawable.larva))
        listData.add(Data("Mickey Mouse", "210441100007", "17 tahun", R.drawable.micky))
        listData.add(Data("Nobita", "210441100008", "18 tahun", R.drawable.nobi))
        listData.add(Data("Wini The Pooh", "210441100009", "19 tahun", R.drawable.pooh))
        listData.add(Data("Upin Ipin", "210441100010", "20 tahun", R.drawable.upip))
        listData.add(Data("Popeye", "210441100011", "21 Tahun", R.drawable.pop))
        listData.add(Data("Kak Rose", "210441100012", "22 tahun", R.drawable.kak))
        listData.add(Data("Plangton", "210441100013", "23 tahun", R.drawable.plang))
        listData.add(Data("Mail Bin Mail", "210441100014", "24 tahun", R.drawable.mail))
        listData.add(Data("Squadword", "210441100015", "25 tahun", R.drawable.squad))
        listData.add(Data("Intan Payung", "210441100016", "26 tahun", R.drawable.san))
        listData.add(Data("Susanti", "210441100017", "27 tahun", R.drawable.sus))
        listData.add(Data("Patrick", "210441100018", "28 tahun", R.drawable.pat))
        listData.add(Data("Tuan Krab", "210441100019", "29 tahun", R.drawable.tuan))
        listData.add(Data("Mei-Mei Cantik", "210441100020", "30 tahun", R.drawable.me))
        showList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.list) {
            showList()
        } else if (item.itemId == R.id.grid) {
            showGrid()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showGrid() {
        val layoutManager = GridLayoutManager(this, 2)
        recycle.layoutManager = layoutManager
        recycleAdapter = Adapter(listData, this)
        recycle.adapter = recycleAdapter
    }

    private fun showList() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycle.layoutManager = layoutManager
        recycleAdapter = Adapter(listData, this)
        recycle.adapter = recycleAdapter
    }
}