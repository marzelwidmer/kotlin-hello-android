package ch.keepcalm.helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import ch.keepcalm.helloworld.adapter.MyCustomerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_listview)
        listView.adapter = MyCustomerAdapter(this)
    }
}

